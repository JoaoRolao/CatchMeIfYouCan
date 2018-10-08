package org.academiadecodigo.variachis.expertCoders;

import java.util.LinkedList;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.item.ItemFactory;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Game {
    private LinkedList<Item> allItems = new LinkedList<>();
    private LinkedList<Item> activeItems = new LinkedList<>();
    private Player player;
    private Grid grid;
    private boolean gameOver;


    public void addItemsToList() {
        for (int i = 0; i < 30; i++) {
            allItems.add(ItemFactory.getItem(grid));
        }

        for (int i = 0; i < 10; i++) {
            activeItems.add(allItems.remove(i));
        }
    }


    public void gameInit() {
        this.grid = new Grid(200, 200);
        this.player = new Player(PositionFactory.getPlayerPosition(grid));

        //adding items to the list and giving them a position
        addItemsToList();

        player.draw();
        grid.draw();
    }


    public Item itemRecycle(Item item) {

        allItems.add(item);
        Item itemNew = allItems.poll();
        return itemNew;
    }


    public void gameStart() {


        while (!gameOver) {
            //TODO: IF PLAYER PRESS KEY PLAYER.MOVE()
            player.move(Position.Direction.LEFT);
            player.move(Position.Direction.RIGHT);

            for (Item item : activeItems) {
                item.move(Position.Direction.DOWN);

                if (player.checkCollision(item.getPosition())) {
                    System.out.println("COLIDEDDDDD with player");
                    item.setColided(true);
                    gameOver = true;
                    //TODO: PLAYER INTERACTION WITH ITEM TYPE
                }

                if (grid.checkCollision(item.getPosition())) {
                    System.out.println("colided with grid");
                    item.setColided(true);
                    //gameOver = true;
                }
                if (item.isColided()) {
                    itemRecycle(item);
                    item.recycle();
                }
            }

        }

    }

/*
    //recycle items
    for (int i = 0; i < 6; i++) {
        activeItems.add(allItems.remove(i));
    }

    for (int i = 0; i < 6; i++) {
        allItems.add(activeItems.remove(i));
    }
*/


}



