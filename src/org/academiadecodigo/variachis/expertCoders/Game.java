package org.academiadecodigo.variachis.expertCoders;

import java.util.LinkedList;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.item.ItemFactory;
import org.academiadecodigo.variachis.expertCoders.player.Player;
import org.academiadecodigo.variachis.expertCoders.player.PlayerKeyboard;

public class Game implements KeyboardHandler {
    private LinkedList<Item> allItems = new LinkedList<>();
    private LinkedList<Item> activeItems = new LinkedList<>();
    private Player player;
    private Grid grid;
    private boolean gameOver;


    public void addItemsToList() {
        for (int i = 0; i < 3; i++) {
            allItems.add(ItemFactory.getItem(grid));
        }

        for (int i = 0; i < 2; i++) {
            activeItems.add(allItems.remove(i));
        }
    }


    public void gameInit() {
        //game knows the grid (instantiate grid) and draw the grid
        this.grid = new Grid(80, 60);
        grid.draw();
        keyboardInit();

        GameLevel levelOne = new GameLevel(PositionFactory.getLevelPosition(grid));
        levelOne.setGrid(grid);
        levelOne.draw();

        //instantiate the player in the grid with a position
        this.player = new Player(PositionFactory.getPlayerPosition(grid));

        player.draw();

        addItemsToList();



    }


    public void itemRecycle(Item item) {

        allItems.add(item);
       // activeItems.add(allItems.poll());
    }


    public void gameStart() {


        while (!gameOver) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Item item : activeItems) {

                item.move(Position.Direction.DOWN);
                item.draw();

                if (player.checkCollision(item.getPosition())) {
                    System.out.println("COLIDEDDDDD with player");
                    item.setColided(true);
                    player.beingHit(item);
                }

                if (grid.checkCollision(item.getPosition())) {
                    System.out.println("GRIDDD COLIDE CHECKER");
                    item.setColided(true);
                    //gameOver = true;
                }

                if (item.isColided()) {
                    System.out.println("TESTESTES");
                    itemRecycle(item);
                    item.recycle();
                }

                if (player.getKnowledge() <= 0 || player.getFun() <= 0){
                    System.out.println("You loose with : " + player.getFun() + " Fun, and with : " + player.getKnowledge() + " Knowlege.");
                    gameOver = true;

                }

            }

        }

    }

    public void keyboardInit(){
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveRight);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                if(player.getPosition().getCol() + grid.PADDING < grid.getCols() * grid.CELLSIZE) {
                    player.move(Position.Direction.RIGHT);
                    player.getPlayerPicture().translate(grid.CELLSIZE, 0);
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                player.move(Position.Direction.LEFT);
                player.getPlayerPicture().translate(- grid.CELLSIZE, 0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}



