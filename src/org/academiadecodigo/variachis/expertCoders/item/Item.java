package org.academiadecodigo.variachis.expertCoders.item;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

public class Item extends AbstractCollidable {

    private Grid grid;
    private Position position;
    private Type type;


public Item (Type type){
    this.type = type;
}
    //Enum type inner class

    public enum Type {
        CAP,
        PEN,
        MAC,
        POLY,
        COCK;

    }

    public static Type random() {
        int randomType = (int) (Math.random() * Type.values().length);
        return Type.values()[randomType];

    }

    public void move(){
     position.moveDown();
    }





}
