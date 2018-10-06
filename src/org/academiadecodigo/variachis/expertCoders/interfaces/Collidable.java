package org.academiadecodigo.variachis.expertCoders.interfaces;

import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

public interface Collidable extends Drawable {

    @Override
    void draw();

    boolean checkCollision(Position position);
}
