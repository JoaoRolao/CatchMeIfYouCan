package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

/**
 * A factory to create different positions for different items.
 */

public class PositionFactory {

    public static Position getPlayerPosition(Grid grid) {
        return new Position((grid.getCols() / 2), (grid.getRows()), grid);

    }

    public static Position getItemPosition(Grid grid) {
        int randomCol = (int) (Math.random() * (grid.getCols() * Grid.CELLSIZE));
        return new Position(randomCol - Grid.CELLSIZE, 0, grid);
    }
}
