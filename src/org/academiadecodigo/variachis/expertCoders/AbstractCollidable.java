package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position.Direction;

public abstract class AbstractCollidable implements Collidable {


    private Position position;


    public AbstractCollidable(Position position) {
        this.position = position;
    }


    public Position getPosition() {
        return position;
    }

    public abstract void draw();

    protected void move(Direction direction) {
        position.move(direction);
    }

}

