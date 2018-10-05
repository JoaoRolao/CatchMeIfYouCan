package org.academiadecodigo.variachis.expertCoders.interfaces;

public interface Collidable extends Drawable {

    @Override
    void draw();

    boolean checkCollision();
}
