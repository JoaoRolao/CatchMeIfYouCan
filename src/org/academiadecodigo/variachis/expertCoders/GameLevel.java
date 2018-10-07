package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.interfaces.Drawable;

public class GameLevel implements Drawable {

    private String actualLevel;
    private Grid grid;
    private Picture picture = new Picture();
    
    
    public GameLevel() {
        
        actualLevel = "";

    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void draw(Picture picture) {

        //checkLevel(actualLevel);
        picture.translate(grid.getCell(),grid.getCell()); //fills the 800x600 resolution, translated cell value to exactly fill the limit border
        picture.draw();
        
    }

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

        //instantiating new picture object -> loading image from resources.
        
        picture.load("levelOne.jpg");
        picture.translate(grid.getCell(),grid.getCell()); //fills the 800x600 resolution, translated cell value to exactly fill the limit border
        picture.draw();


    }
}
