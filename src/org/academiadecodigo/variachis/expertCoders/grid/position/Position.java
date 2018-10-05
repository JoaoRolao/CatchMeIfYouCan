package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

public class Position {

    private int row;
    private int col;
    private Grid grid;




    public void moveDown(){
        this.row = row++;
    }

    public void moveLeft(){
        this.col = col--;
    }

    public void moveRight(){
        this.col = col++;
    }




}


