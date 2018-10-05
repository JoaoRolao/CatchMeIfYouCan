package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.item.Item;


public class Player extends AbstractCollidable {


    private Position position;
    private int knowledge = 0;
    private int fun = 0;


    public Player(Position position) {
        this.position = position;
    }


    public void moveLeft() {
        position.moveLeft();
    }


    public void moveRight() {
        position.moveRight();
    }


    @Override
    public boolean checkColision() {
        return super.checkColision();
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
