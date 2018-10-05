package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class Grid implements Collidable { //implements the -->Collidable interface (-->Drawable)

    //properties of the grid
    private int rows;   //grid has rows
    private int cols;   //grid has columns

    //constructor -> initializing the properties -> delegating to Position since Position HAS-A grid
    public Grid(int rows, int cols) {

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


    public void draw() {
    }


    @Override
    public boolean checkColision() {
        return false;
    }


}
