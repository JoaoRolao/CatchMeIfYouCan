package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class Position implements Collidable {

    private int row;
    private int col;
    private Grid grid;
    private boolean collided;


    public Position(int col, int row, Grid grid) {

        this.col = col;
        this.row = row;
        this.grid = grid;
    }


    //

    //INHERITED METHODS FROM INTERFACE

    @Override
    public boolean checkCollision(Position one, Position two) {

        return one.equals(two);

    }


    @Override
    public void draw() {

    }

    public void moveRight() {

        col++;
    }

    public void moveLeft() {

        col--;
    }

    public void moveDown() {

        row++;
    }
}