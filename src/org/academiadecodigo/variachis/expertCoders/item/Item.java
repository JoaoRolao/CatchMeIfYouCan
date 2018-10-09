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
    private Picture picture;


    public Item(Type type, Position position) {
        super(position);
        this.type = type;
        picture = new Picture(super.getPosition().getCol(), super.getPosition().getRow() + 10, "cap.png");
    }


    //Enum type inner class
    public enum Type {
        CAP,
        ABSTRACTION,
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

    public void recycle() {
        this.setColided(false);
        this.getPosition().setRowZero();
        this.getPosition().setCol();

    }



    //*********************DRAW THE CAP ICON**********************
    @Override
    public void draw() {
        switch (random()) {
            case CAP:
                setCapIcon();
                break;
            case ABSTRACTION:
                setAbstractIcon();
                break;
            case BEER:
                setBeerIcon();
                break;
            case TREE:
                setInheritanceIcon();
                break;
            case POLY:
                setPolyIcon();
                break;
        }

    }


    //*********************DRAW THE CAP ICON**********************


    public void setCapIcon() {

        while (true) {
            picture.load("cap.png");
            picture.draw();
            picture.translate(0, 1);

            if (picture.getMaxX() > grid.getRows()){

                picture.delete();
                break;

            }
        }


        picture.load("cap.png");
        picture.draw();
    }

    public void setAbstractIcon() {
        picture.load("abstraction.png");
        picture.draw();
    }

    public void setPolyIcon() {
        picture.load("polymorphism.png");
        picture.draw();
    }

    public void setInheritanceIcon() {
        picture.load("inheritance.png");
        picture.draw();
    }

    public void setBeerIcon() {
        picture.load("beer.png");
        picture.draw();
    }


    //SETTERS AND GETTER

    public Type getType() {
        return type;
    }


}
