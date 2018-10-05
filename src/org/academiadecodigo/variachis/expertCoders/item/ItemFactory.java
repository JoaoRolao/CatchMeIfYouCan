package org.academiadecodigo.variachis.expertCoders.item;

public class ItemFactory {

    private Item item;

    public Item getItem(){
        return new Item(Item.random());
    }


}
