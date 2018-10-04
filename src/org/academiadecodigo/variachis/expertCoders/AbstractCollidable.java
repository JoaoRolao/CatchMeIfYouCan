package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.interfaces.Collidable;

public class AbstractCollidable implements Collidable {


    private Position position;
    private Grid grid;




    @Override
    public boolean checkColision() {
        return false;
    }

    @Override
    public void draw() {

    }
}
