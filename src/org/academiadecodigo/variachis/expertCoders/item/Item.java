package org.academiadecodigo.variachis.expertCoders.item;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

public class Item extends AbstractCollidable {

    private Type type;
    private boolean colided = false;
    private Picture picture;

    public Item(Type type, Position position) {
        super(position);
        this.type = type;
        picture = new Picture(super.getPosition().getCol(), super.getPosition().getRow() + 10, "cap.png");
    }

    /**
     * enum type inner class to item class
     */
    public enum Type {
        CAP("cap.png"),
        ABSTRACTION("abstraction.png"),
        BEER("beer.png"),
        POLY("polymorphism.png"),
        TREE("inheritance.png");

        private String pic;

        Type(String pic) {
            this.pic = pic;
        }
    }


    public Picture getPicture() {
        return picture;
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
        picture.translate(0, Grid.CELLSIZE); // TODO: 11/10/2018  

    }


    @Override
    public boolean checkCollision(Position position) {
        return this.getPosition().equals(position);
    }

    public void recycle() {

        this.picture.translate(0, -getPosition().getRow() * Grid.CELLSIZE);
        this.getPosition().setRowZero();
        this.getPosition().setCol();
        this.picture.delete();
        this.setColided(false);
    }


    @Override
    public void draw() {
        picture.load(type.pic);
        picture.draw();
    }

    public Type getType() {
        return type;
    }
}
