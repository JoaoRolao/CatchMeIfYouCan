package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Grid implements Collidable { //implements the -->Collidable interface (-->Drawable)

    //properties of the grid
    private final int PADDING = 10;
    private int rows;   //grid has rows
    private int cols;   //grid has columns
    private Rectangle field; //defines the size of the game field


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

        field = new Rectangle(PADDING, PADDING, cols, rows);
        field.draw();
    }

    @Override
    public boolean checkCollision(Position position) {
        return (position.getRow() == rows); // TODO: 08/10/2018
    }
}
