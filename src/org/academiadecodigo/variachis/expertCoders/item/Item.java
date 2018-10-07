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
    public void draw(Picture picture) {

        switch (random()) {
            case CAP:
                setCapIcon();

            case MAC:
                System.out.println("MAC ICON METHOD HERE");
            case PEN:
                System.out.println("PEN ICON METHOD HERE");
            case COCK:
                System.out.println("COCK ICON METHOD HERE");
            case POLY:
                System.out.println("POLY ICON METHOD HERE");
        }
        position.draw(picture);
        System.out.println("I'm a fucking item");

    }


    //*********************DRAW THE CAP ICON**********************
    public void setCapIcon() {
        Picture cap = new Picture();
        cap.load("devil.png");
        cap.draw();
        //position.draw();
        move(); //start moving down
        //cap.translate(getPosition().getRow(), getPosition().getCol()); //TODO:FIX PROBLEM HERE
        cap.translate(position.getRow(), position.getCol());
        //cap.translate(g);
        cap.delete();
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


}
