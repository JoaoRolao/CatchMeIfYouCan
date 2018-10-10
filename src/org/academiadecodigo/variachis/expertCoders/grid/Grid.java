package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Grid implements Collidable { //implements the -->Collidable interface (-->Drawable)

    //properties of the grid
    public static final int PADDING = 10;
    public static int rows;   //grid has rows
    private int cols;   //grid has columns
    private Rectangle field; //defines the size of the game field
    public static final int CELLSIZE = 10;


    //constructor -> initializing the properties -> delegating to Position since Position HAS-A grid
    public Grid(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
    }


    //GETTER FOR THE POSITION CLASS TO USE --->COLUMNS
    public int getCols() {
        return cols;
    }

    //GETTER FOR THE POSITION CLASS TO USE --->ROWS
    public int getRows() {
        return rows;
    }

    //*************inherited interface methods ---TO WORK--- *********************
    @Override
    public void draw() {

        field = new Rectangle(PADDING, PADDING, CELLSIZE * cols, CELLSIZE * rows);
        field.draw();
    }

    @Override
    public boolean checkCollision(Position position) {
        return (position.getRow() == rows);
    }

    public int getWidth() {
        return this.field.getWidth();
    }

    public int getHeigth() {
        return this.field.getHeight();
    }
}
