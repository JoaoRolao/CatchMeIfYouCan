package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;


public class Player extends AbstractCollidable {

    //properties of the player
    private int knowledge = 0; //status <-
    private int fun = 0;  //status <-
    private Picture playerPicture = new Picture();


    public Player(Position position) {
        super(position);
    }

    @Override
    public boolean checkCollision(Position position) { // TODO: 08/10/2018
        return false;
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


}

