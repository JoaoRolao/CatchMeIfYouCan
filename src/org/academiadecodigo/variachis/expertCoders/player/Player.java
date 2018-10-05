package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.item.Item;


public class Player extends AbstractCollidable {


    private Grid grid;
    private Position position;
    private Item item; // player must know items
    private int knowledge = 0;
    private int fun = 0;


    public Player(Grid grid) {
        this.grid = grid;
    }


    public void moveLeft() {
        position.moveLeft();
    }


    public void moveRight() {
        position.moveRight();
    }


    @Override
    public boolean checkCollision() {
        return super.checkCollision();
    }


    @Override
    public void draw() {
        System.out.println("I'm the Player");
        // draw must apply an image
    }

    public Player(){

    }


    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }


    public void setFun(int fun) {
        this.fun = fun;
    }

}
