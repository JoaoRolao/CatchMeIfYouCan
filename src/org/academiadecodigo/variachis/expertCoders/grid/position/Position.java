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


    public void setRowZero() {
        this.row = 0;
    }

    public void setCol() {
        this.col = (int) (Math.random() * grid.getCols());
    }

    public boolean isCollided() {
        return collided;
    }

    public void setCollided(boolean collided) {
        System.out.println("seted pos colided");
        this.collided = collided;
    }


    @Override
    public boolean checkCollision(Position position) {

        return this.equals(position);
    }

    @Override
    public void draw() {
        System.out.println("col: " + col + " row: " + row);

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

    public boolean equals(Position position) {

        if (this.row != position.row || this.col != position.col) {
            return false;
        }

        return true;
    }

    public int getRow() {
        return row;
    }
}