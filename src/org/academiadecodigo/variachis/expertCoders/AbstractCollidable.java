package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;


public class AbstractCollidable implements Collidable {


    private Position position;


    public AbstractCollidable(Position position) {
        this.position = position;
    }

    @Override
    public void draw() {

    }

    protected void move(Direction direction) {
        position.move(direction);
    }

    @Override
    public boolean checkCollision(Position position) {
        return false;
    }
}
