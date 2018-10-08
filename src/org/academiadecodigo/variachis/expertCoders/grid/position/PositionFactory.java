package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

/**
 * A factory to create different positions for different items.
 */

public class PositionFactory {

    private Grid grid;

    //method to instantiate the positions
    public static Position getPosition(int column, int row, Grid grid) {

        return new Position(column, row, grid);

    }

    public static Position getItemPosition(Grid grid) {
        int randomCol = (int) (Math.random() * grid.getCell());
        return new Position(randomCol, 0, grid);
    }


    public void setGrid(Grid grid) {
        this.grid = grid;
    }


    public int getRandomCol() {
        int cols = this.grid.getCols();
        return (int) (Math.random() * cols);

    }

    public int getRandomRow() {
        int rows = this.grid.getRows();
        return (int) (Math.random() * rows);
    }


}
