package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
<<<<<<< HEAD
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
=======

public class Position {

    private int row;
    private int col;
    private Grid grid;




    public void moveDown(){
        this.row = row++;
    }



>>>>>>> 840c7b50349b9b465e6ba862f6e6094060d217f1
}


