package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.interfaces.Drawable;

public class GameLevel implements Drawable {

    private String actualLevel;
    private Picture picture;
    private Position position;
    Grid grid;
    
    public GameLevel(Position position) {
        this.position = position;
        actualLevel = "levelOne";
       picture = new Picture(0, 0, "levelOne.jpg");

    }

    @Override
    public void draw() {

        checkLevel(actualLevel);
        picture.translate(10,10); //fills the 800x600 resolution, translated cell value to exactly fill the limit border
        picture.draw();
        
    }

    //use to change the level img
    public void setActualLevel(String actualLevel) {
        this.actualLevel = actualLevel;
    }

    public void checkLevel(String actualLevel){
        
        switch (actualLevel) { //init value of actual level will allways be levelOne

            case "levelOne":
                levelOne(); //call method level 1 -> gonna load and draw the bg image
        }
        
    }
    
    //LEVEL ONE METHOD -> LOAD AND SET BG IMAGE
    public void levelOne() {

        System.out.println("Entered level 1");

        picture.load("levelOne.jpg");
        picture.draw();
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }
}
