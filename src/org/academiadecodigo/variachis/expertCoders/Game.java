package org.academiadecodigo.variachis.expertCoders;

import java.util.LinkedList;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.item.ItemFactory;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Game {
    private Item item;
    private LinkedList<AbstractCollidable> allItems = new LinkedList<>();
    private LinkedList<AbstractCollidable> activeItems = new LinkedList<>();
    private Player player;
    private Grid grid;
    private ItemFactory itemFactory = new ItemFactory();
    private PositionFactory positionFactory = new PositionFactory();


    public void addItemsToList() {
        int items = 0;
        while (items != 20) {
            allItems.add(itemFactory.getItem());
            items++;
        }
    }


    public void gameInit() {
        this.grid = new Grid(200, 200);
        this.player = new Player(PositionFactory.getPosition(grid.getCols() / 2, grid.getRows(), grid));


        //adding items to the list and giving them a position
        addItemsToList();
<<<<<<< HEAD

        for (AbstractCollidable item : allItems) {

        }

        activeItems.add(player);
        positionFactory.setGrid(grid);





        //give a position to every item TODO can't access item index
        for (int i = 0; i < allItems.size(); i++) {
            System.out.println("entered working for: " + allItems.get(i));
            item.setPosition(PositionFactory.getPosition(positionFactory.getRandomCol(), 0, grid));
=======
        for (Item item : allItems) {
            item.setPosition(PositionFactory.getItemPosition(grid));
            item.draw();

>>>>>>> master
        }
        player.draw();
        grid.draw();

<<<<<<< HEAD




=======
>>>>>>> master
        /*
        //recycle items
        for (int i = 0; i < 6; i++) {
            activeItems.add(allItems.remove(i));
        }

        for (int i = 0; i < 6; i++) {
            allItems.add(activeItems.remove(i));

        }


<<<<<<< HEAD
        addItemsToList();
        for (AbstractCollidable item : activeItems) {
            item.draw();
        }*/
=======
*/
>>>>>>> master

    }


<<<<<<< HEAD
    //All game logic
    public void gameStart() {

    }


=======
>>>>>>> master
}
