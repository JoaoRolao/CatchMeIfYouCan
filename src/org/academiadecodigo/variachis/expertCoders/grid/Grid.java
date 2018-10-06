package org.academiadecodigo.variachis.expertCoders.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.player.Player;

public class Grid implements Collidable { //implements the -->Collidable interface (-->Drawable)

    public final int PADDING = 10;
    //properties of the grid
    private int rows;   //grid has rows
    private int cols;   //grid has columns
    private Player player;
    private Item item;
    private Rectangle field;
    private int cell = 10;
    private String level = "mainLevel";


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

    //method to make a grid position
    public Position makePosition(int cols, int rows) {

        return new Position(cols, rows, this);

    }


    //*************inherited interface methods ---TO WORK--- *********************
    @Override
    public void draw() {

        //field area ->added padding and the field size will be the colls * cell and row * cell
        this.field = new Rectangle(PADDING, PADDING, cols * cell, rows * cell);

        this.field.draw();

        //TESTING MAIN LEVEL BACKGROUND IMAGE ->IF THE LEVEL IS EQUALS TO "mainLevel" we instantiate a picture and load/draw the image
        if (level.equals("mainLevel")) {
            System.out.println("Entered level 1");

            //main level background (testing)
            Picture mainLevel = new Picture();
            mainLevel.load("game_levelResized.jpg");
            //mainLevel.grow();
            mainLevel.translate(cell, cell);
            mainLevel.draw();
        }


        System.out.println("im a grid ");
    }

    @Override
    public boolean checkCollision(Position position) {
        if ((position.getRow() == rows)) {
            return true;
        }

        return false;
    }
}
