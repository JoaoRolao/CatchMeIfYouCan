package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;


public class Player extends AbstractCollidable {


    private Position position;
    private int knowledge = 0;
    private int fun = 0;


    public Player(Position position) {
        this.position = position;
    }


    public void moveLeft() {
        position.moveLeft();
        System.out.println("I'm moving to the left");
    }


    public void moveRight() {
        position.moveRight();
        System.out.println("I'm moving to the right");
    }

    @Override
    public boolean checkCollision(Position position) {
        return this.position.checkCollision(position);
    }

    @Override
    public void draw() {
        position.draw();
        System.out.println("I'm the Player");   // draw must apply an image
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }


    public Position getPosition() {
        return position;
    }
}
