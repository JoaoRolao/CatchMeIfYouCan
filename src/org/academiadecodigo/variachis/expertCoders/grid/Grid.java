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

<<<<<<< HEAD
    //*************inherited interface methods ---TO WORK--- *********************
    @Override
    public boolean checkColision() {
        return false;
    }

    @Override
=======

    //GETTER FOR THE POSITION CLASS TO USE --->HEIGHT(ALTURA) ---> POSITION KNOWS THE HEIGHT AND WIDTH TO HAVE A POSITION (????)
    public int getHeight() {
        return height;
    }

    //GETTER FOR THE POSITION CLASS TO USE --->WIDTH(LARGURA) ---> POSITION KNOWS THE WIDTH AND HEIGHT TO HAVE A POSITION (????)
    public int getWidth() {
        return width;
    }

    //*************inherited interface methods ---TO WORK--- *********************



>>>>>>> 1592f096a481704fd2201fde367fb67a6939aac6
    public void draw() {
    }
}
