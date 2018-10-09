package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.item.Item;


public class Player extends AbstractCollidable {


    //properties of the player
    private int knowledge = 20; //status <-
    private int fun = 20;  //status <-
    private Picture playerPicture;


    public Player(Position position) {
        super(position);
        playerPicture = new Picture(super.getPosition().getCol(), super.getPosition().getRow() - 100, "playerTest.jpg");
    }

    @Override
    public boolean checkCollision(Position position) {
        return super.getPosition().equals(position);
    }

    @Override
    public void draw() {
        playerPicture.draw();

    }


    @Override
    public void move(Position.Direction direction) {
        super.move(direction);

    }


    public void beingHit(Item item) {
        switch (item.getType()) {
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
            case ABSTRACTION:
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

