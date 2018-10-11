package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;
import org.academiadecodigo.variachis.expertCoders.interfaces.Drawable;

public class GameLevel implements Drawable {

    private Level actualLevel ;
    private Picture picture;

    public GameLevel() {
        actualLevel = Level.ONE;
        picture = new Picture(Grid.PADDING, Grid.PADDING, actualLevel.pic);
    }

    @Override
    public void draw() {
        picture.load(actualLevel.pic);
        picture.draw();
    }

    public void setActualLevel(Level actualLevel) {
        this.actualLevel = actualLevel;
    }

    public enum Level {
        ONE("levelOne.jpg"),
        TWO("salinha_screen_2_salinha.jpg");

        private String pic;

        Level(String pic) {
            this.pic = pic;
        }
    }
}
