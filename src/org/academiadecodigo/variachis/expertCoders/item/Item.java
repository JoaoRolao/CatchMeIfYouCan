package org.academiadecodigo.variachis.expertCoders.item;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

public class Item extends AbstractCollidable {

    private Grid grid;
    private Position position;



    //Enum type inner class

    public enum Type {
        CAPS,
        PEN,
        MAC,
        POLY,
        COCK;

    }









}
