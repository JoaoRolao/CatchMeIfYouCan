package org.academiadecodigo.variachis.expertCoders.item;

public class ItemFactory {

    private Item item;

    //Create new items -- random values
    public Item getItem() {
        return new Item(Item.random());
    }


}
