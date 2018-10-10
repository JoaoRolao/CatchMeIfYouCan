package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

/**
 * A factory to create different positions for different items.
 */

public class PositionFactory {

    private Grid grid;


    //method to instantiate the positions
    public static Position getPlayerPosition(Grid grid) {

        return new Position((grid.getCols() * grid.CELLSIZE) / 2, (grid.getRows() * grid.CELLSIZE), grid);

    }


    public static Position getItemPosition(Grid grid) {
        int randomCol = (int) (Math.random() * (grid.getCols() * grid.CELLSIZE));
        return new Position(randomCol - Grid.CELLSIZE, 0, grid);
    }

    public static Position getLevelPosition(Grid grid) {
        return new Position(grid.getCols(), grid.getRows(), grid);
    }


    public void setGrid(Grid grid) {
        this.grid = grid;
    }





}
