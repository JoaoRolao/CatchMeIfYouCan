package org.academiadecodigo.variachis.expertCoders.item;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;

public class ItemFactory {

    //Create new items -- random values
    public static Item getItem(Grid grid) {
        return new Item(Item.random(), PositionFactory.getItemPosition(grid));
    }


}
