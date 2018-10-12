package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.interfaces.Drawable;

public class GameLevel implements Drawable {

    private Level actualLevel ;
    private Picture picture;

    public GameLevel() {
        actualLevel = Level.ZERO;
        picture = new Picture(Grid.PADDING, Grid.PADDING, actualLevel.pic);
    }

    @Override
    public void draw() {
        picture.load(actualLevel.getPic());
        picture.draw();
    }

    public void setActualLevel(Level actualLevel) {
        this.actualLevel = actualLevel;
    }

    public enum Level {
        ZERO("inicial_screen.jpg"),
        ONE("levelOne.jpg"),
        TWO("salinha_screen_2_salinha.jpg"),
        HELP("help.jpg"),
        OVER("gameover_screen.jpg");

        private String pic;

        Level(String pic) {
            this.pic = pic;
        }

        public String getPic() {
            return pic;
        }
    }

    public Level getActualLevel() {
        return actualLevel;
    }
}
