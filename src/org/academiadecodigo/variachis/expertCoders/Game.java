package org.academiadecodigo.variachis.expertCoders;

import java.util.LinkedList;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.item.ItemFactory;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Game {
    private Item item;
    private LinkedList<Item> liknedList = new LinkedList<>();
    private Player player;
    private Grid grid;
    private ItemFactory itemFactory = new ItemFactory();




    public void addItemsToList() {
        int items = 0;
        while (items != 20) {
            liknedList.add(itemFactory.getItem());
            items++;
        }
    }

    public void gameInit() {
        this.grid = new Grid(200, 200);
        this.player = new Player();

        addItemsToList();
        for (Item item: liknedList) {
           item.draw();

        }


    }


}
