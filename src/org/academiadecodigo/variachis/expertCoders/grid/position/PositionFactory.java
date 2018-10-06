package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

/**
 * A factory to create different positions for different items.
 */

public class PositionFactory {

    //method to instantiate the positions
    public static Position getPosition(int column, int row, Grid grid) {

        return new Position(column, row, grid);

    }

    public static Position getItemPosition(Grid grid){
        int randomCol = (int)Math.random()* grid.getCols();
        return new Position(randomCol,0,grid);
    }


}
