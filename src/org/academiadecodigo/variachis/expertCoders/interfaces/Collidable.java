package org.academiadecodigo.variachis.expertCoders.interfaces;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

public interface Collidable extends Drawable {

    @Override
    void draw(Picture picture);

    boolean checkCollision(Position position);
}
