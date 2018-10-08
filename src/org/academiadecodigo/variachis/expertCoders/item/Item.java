package org.academiadecodigo.variachis.expertCoders.item;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

import java.awt.*;

public class Item extends AbstractCollidable {

    private Grid grid;
    private Type type;
    private boolean colided;
    private Picture picture = new Picture();


    public Item(Type type, Position position) {
        super(position);
        this.type = type;
    }


    //Enum type inner class
    public enum Type {
        CAP,
        OTHER,
        BEER,
        POLY,
        TREE;
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

    @Override
    public void move(Position.Direction direction) {
        super.move(direction);
    }



    @Override
    public boolean checkCollision(Position position) {
        return this.getPosition().equals(position);
    }

    public void recycle(){
        this.setColided(false);
        this.getPosition().setRowZero();
        this.getPosition().setCol();

    }
    @Override
    public void draw() {
       //position.draw();

        switch (random()) {
            case CAP:
                setCapIcon();
                break;
            case BEER:
               setCapIcon();
               break;
            case TREE:
                setCapIcon();
                break;
            case OTHER:
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

    public Type getType() {
        return type;
    }




}
