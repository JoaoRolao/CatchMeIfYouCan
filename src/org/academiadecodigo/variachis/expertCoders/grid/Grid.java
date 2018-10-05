package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class Grid implements Collidable { //implements the -->Collidable interface (-->Drawable)

    //properties of the grid
    private int rows;   //grid has rows
    private int cols;   //grid has columns
    private int width = 800;  //grid has width(largura) of 800
    private int height = 800; //grid has height(altura) of 800

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


    //GETTER FOR THE POSITION CLASS TO USE --->HEIGHT(ALTURA) ---> POSITION KNOWS THE HEIGHT AND WIDTH TO HAVE A POSITION (????)
    public int getHeight() {
        return height;
    }

    //GETTER FOR THE POSITION CLASS TO USE --->WIDTH(LARGURA) ---> POSITION KNOWS THE WIDTH AND HEIGHT TO HAVE A POSITION (????)
    public int getWidth() {
        return width;
    }

    //*************inherited interface methods ---TO WORK--- *********************



    public void draw() {

    }
}
