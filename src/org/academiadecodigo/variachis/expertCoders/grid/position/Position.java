package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class Position implements Collidable {

    

    //INHERITED METHODS FROM INTERFACE


    @Override
    public boolean checkCollision() {
        return false;
    }

    @Override
    public void draw() {

    }

    private int row;
    private int col;
    private Grid grid;




    public void moveDown(){
        this.row = row++;
    }

}


