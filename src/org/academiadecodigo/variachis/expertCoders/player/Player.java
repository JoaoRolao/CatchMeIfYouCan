package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.item.Item;


public class Player extends AbstractCollidable {


    private int knowledge = 10;
    private int fun = 10;


    public Player(Position position) {
        super(position);
    }

    @Override
    public boolean checkCollision(Position position) {
        return super.getPosition().equals(position);
    }

    @Override
    public void draw() {
        System.out.println("I'm the Player");   // draw must apply an image
    }



    @Override
    public void move(Position.Direction direction) {
        super.move(direction);
    }

    public void beingHit(Item item){
        switch (item.getType()){
            case CAP:
                System.out.println("cap");
                knowledge -= 5;
                break;
            case BEER:
                System.out.println("beer");
                fun += 5;
                break;
            case TREE:
                System.out.println("tree");
                knowledge += 5;
                break;
            case OTHER:
                System.out.println("other");
                fun -= 5;
                break;
            case POLY:
                System.out.println("POLY");
                break;
        }
    }

    public int getFun() {
        return fun;
    }

    public int getKnowledge() {
        return knowledge;
    }
}

