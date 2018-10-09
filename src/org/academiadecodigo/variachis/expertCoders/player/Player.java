package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.item.Item;


public class Player extends AbstractCollidable {


    //properties of the player
    private int knowledge = 10; //status <-
    private int fun = 10;  //status <-
    private Picture playerPicture = new Picture();


    public Player(Position position) {
        super(position);
    }

    @Override
    public boolean checkCollision(Position position) {
        return super.getPosition().equals(position);
    }

    @Override
    public void draw() {
        /*
        //IS THIS OK TO DO? using the factory to give the player a position (told in the factory the pos and grid)
        PositionFactory positionFactory = new PositionFactory();
        Position playerPosition = positionFactory.playerPosition();
        //draw the pos
        playerPosition.draw();
        */

        //load and draw player img
        playerPicture.load("playerTest.jpg");
        playerPicture.draw();



    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setFun(int fun) {
        this.fun = fun;
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

