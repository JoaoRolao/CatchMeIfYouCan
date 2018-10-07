package org.academiadecodigo.variachis.expertCoders;

import java.util.LinkedList;
import java.util.logging.Level;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.item.ItemFactory;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Game {
    private Item item;
    private LinkedList<Item> allItems = new LinkedList<>();
    private LinkedList<Item> activeItems = new LinkedList<>();
    private Player player;
    private Grid grid;
    private ItemFactory itemFactory = new ItemFactory();
    private boolean gameOver;
    private GameLevel gameLevel = new GameLevel();

    public void addItemsToList() {
        int items = 0;
        while (items != 50) {
            allItems.add(itemFactory.getItem());
            items++;
        }
    }


    public void gameInit() {
        this.grid = new Grid(60, 80);
        this.player = new Player(PositionFactory.getPosition(grid.getCols() / 2, grid.getRows(), grid));
        gameLevel.setGrid(grid);
        //grid.draw();
        gameLevel.setActualLevel("levelOne"); //sets current level at level one
        Picture level = new Picture();
        level.load("levelOne.jpg");
        gameLevel.draw(level);

        //adding items to the list and giving them a position
        addItemsToList();
        for (int i = 0; i < 10; i++) {
            activeItems.add(allItems.remove(i));
        }

        for (Item item : activeItems) {
            item.setPosition(PositionFactory.getItemPosition(grid));
            switch (item.getType()){
                case CAP:
                    Picture picture = new Picture();
                    picture.load("devil.png");
                    item.draw(picture);
                    //picture.translate(item.getPosition().getRow(), item.getPosition().getCol());
                    break;
                case MAC:
                    Picture picture1 = new Picture();
                    picture1.load("devil.png");
                    item.draw(picture1);
                    break;
                case PEN:
                    Picture picture2 = new Picture();
                    picture2.load("devil.png");
                    item.draw(picture2);
                    break;
                case COCK:
                    Picture picture3 = new Picture();
                    picture3.load("devil.png");
                    item.draw(picture3);
                    break;
                case POLY:
                    Picture picture4 = new Picture();
                    picture4.load("devil.png");
                    item.draw(picture4);
                    break;

            }
        }

        for (Item item : allItems) {
            item.setPosition(PositionFactory.getItemPosition(grid));
        }
        Picture picturePlayer = new Picture();
        picturePlayer.load("playerTest.jpg");

        player.draw(picturePlayer);
        int i = grid.getWitdth() / 2;
        int ii = grid.getHeight() / 2;
        picturePlayer.translate(i - 45, ii - 45 );

    }


    public Item itemRecycle(Item item) {
        item.setColided(false);
        item.getPosition().setRowZero();
        item.getPosition().setCol();
        allItems.add(item);
        Item itemNew = allItems.poll();
        return itemNew;
    }


    public void gameStart() {


        //CHECK LEVEL METHOD -> ALLWAYS LEVEL ONE INIT VALUE TODO:CHANGE THE VAL OF CURRENTLEVEL WHEN CONDITION TO NEXT LVL MEETS

        while (!gameOver) {

            //TODO: IF PLAYER PRESS KEY PLAYER.MOVE()


            for (Item item : activeItems) {

                //draw the items and move them down

                //item.move(); //doesnt need this since im calling the move in the icon methods to move each item.(?)

                if (player.checkCollision(item.getPosition())) {
                    System.out.println("COLIDEDDDDD with player");
                    item.setColided(true);
                    switch (item.getType()) {
                        case CAP:
                            player.setKnowledge(player.getKnowledge() - 2);
                            break;
                        case MAC:
                            player.setKnowledge(player.getKnowledge() + 2);
                            break;
                        case PEN:
                            player.setFun(player.getFun() - 2);
                            break;
                        case COCK:
                            player.setFun(player.getFun() + 2);
                            break;
                        case POLY:
                            //TODO change image
                            System.out.println("fun: " + player.getFun() + " knowlege: " + player.getKnowledge());
                            gameOver = true;

                    }
                }

                if (grid.checkCollision(item.getPosition())) {
                    System.out.println("colided with grid");
                    item.setColided(true);
                    //gameOver = true;
                }
            }

            for (Item item : activeItems) {
                if (item.isColided()) {
                    itemRecycle(item);
                }
            }

            if (player.getFun() <= 0 || player.getKnowledge() <= 0) {
                gameOver = true;
            }

        }

    }

}



