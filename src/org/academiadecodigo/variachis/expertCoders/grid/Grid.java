package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class Grid implements Collidable { //implements the -->Collidable interface (-->Drawable)

    //properties of the grid
    private int rows;
    private int cols;
    private int width;
    private int heigth;

    public Grid(int rows, int cols){

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
    public boolean checkColision() {
        return false;
    }


    @Override
    public void draw() {

    }
}
