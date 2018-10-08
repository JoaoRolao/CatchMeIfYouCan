package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;


public class Player extends AbstractCollidable {


    private int knowledge = 0;
    private int fun = 0;


    public Player(Position position) {
        super(position);
    }

    @Override
    public boolean checkCollision(Position position) { // TODO: 08/10/2018
        return false;
    }

    @Override
    public void draw() {
        System.out.println("I'm the Player");   // draw must apply an image
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    @Override
    protected void move(Position.Direction direction) {
        super.move(direction);
    }


}

