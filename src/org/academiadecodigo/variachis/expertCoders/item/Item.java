package org.academiadecodigo.variachis.expertCoders.item;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

import java.awt.*;

public class Item extends AbstractCollidable {

    private Grid grid;
    private Position position;
    private Type type;
    private boolean colided;
    private Picture picture = new Picture();


    public Item(Type type) {
        this.type = type;
    }
    //Enum type inner class

    public enum Type {
        CAP,
        PEN,
        MAC,
        POLY,
        COCK


        //cherries - > if you catch the cherrie you leave the game to the bathroom farting all over the map

    }

    public void setColided(boolean colided) {
        this.colided = colided;
    }

    public boolean isColided() {
        return colided;
    }


    public static Type random() {
        int randomType = (int) (Math.random() * Type.values().length);
        return Type.values()[randomType];
    }

    public void move() {
        System.out.println("moving item");
        this.position.moveDown();
    }

    @Override
    public boolean checkCollision(Position position) {
        return this.position.checkCollision(position);
    }

    @Override
    public void draw() {
       //position.draw();

        switch (random()) {
            case CAP:
                setCapIcon();
                break;
            case MAC:
               setCapIcon();
               break;
            case PEN:
                setCapIcon();
                break;
            case COCK:
                setCapIcon();
                break;
            case POLY:
                setCapIcon();
                break;
        }

    }


    //*********************DRAW THE CAP ICON**********************


    public void setCapIcon() {

        picture.load("beer.png");
        picture.draw();
        picture.translate(40, 40); //TODO:FIX PROBLEM HERE
        //move();
        picture.delete();
    }


    //SETTERS AND GETTER
    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Type getType() {
        return type;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }


}
