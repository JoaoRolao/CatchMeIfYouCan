package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class Grid implements Collidable {

    public static final int PADDING = 10;
    private int rows;
    private int cols;
    public static final int CELLSIZE = 10;

    public Grid(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getCols() {
        return cols;
    }

    /**
     * @return the number of rows
     */
    public int getRows() {
        return rows;
    }

    @Override
    public void draw() {

        Rectangle field = new Rectangle(PADDING, PADDING, CELLSIZE * cols, CELLSIZE * rows);
        field.draw();
    }

    @Override
    public boolean checkCollision(Position position) {
        return (position.getRow() == rows - 4);
    }
}
