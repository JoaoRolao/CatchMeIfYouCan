package org.academiadecodigo.variachis.expertCoders.grid.position;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;


public class Position {

    private int row;
    private int col;
    private Grid grid;


    public Position(int col, int row, Grid grid) {

        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    public int getGridRows() {
        return grid.getRows();
    }

    public enum Direction {
        DOWN,
        RIGHT,
        LEFT;
    }

    public void setRowZero() {
        this.row = 0;
    }

    public void setCol() {
        this.col = (int) (Math.random() * grid.getCols());
    }

    public void move(Direction direction) {
        switch (direction) {
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
            case DOWN:
                moveDown();
                break;
        }
    }

    private void moveRight() {
        this.col++;
    }

    private void moveLeft() {
        this.col--;
    }

    private void moveDown() {

        this.row++;
    }

    public boolean equals(Position position) {
//positions minus five because item collides with grid at row 56
        return  (this.row == position.row - 5 && this.col == position.col);

    }


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}