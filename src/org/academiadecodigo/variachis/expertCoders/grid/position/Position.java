package org.academiadecodigo.variachis.expertCoders.grid.position;

public class Position {

    private int col;
    private int row;
    private Grid grid;
    private boolean collided = false;

    public Position(int col, int row, Grid grid) {

        this.col = col;
        this.row = row;
        this.grid = grid;
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

    public void moveUp() {

        row--;
    }

    public void draw() {


    }

    public boolean checkCollision() {

        return collided;
    }
}
