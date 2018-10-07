package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;


public class Player extends AbstractCollidable implements KeyboardHandler {


    private Position position;
    private int knowledge = 50;
    private int fun = 50;
    private Keyboard keyboard;
    private Picture player = new Picture();
    private Grid grid; //testing player pos with grid



    public Player(Position position) {
        this.position = position;
        keyboard = new Keyboard(this);
        init();
    }


    //initialize keyboard handlers
    public void init(){

        //left key pressed
        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        //right key pressed
        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        keyboard.addEventListener(left);
        keyboard.addEventListener(right);

    }

    //************inherited method from keyboard handler*****************


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                player.translate(-10,0);
                break;
            case KeyboardEvent.KEY_RIGHT:
                player.translate(10, 0);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    //********************************************************************
    public void moveLeft() {
        position.moveLeft();
        System.out.println("I'm moving to the left");
    }


    public void moveRight() {
        position.moveRight();
        System.out.println("I'm moving to the right");
    }

    @Override
    public boolean checkCollision(Position position){
        return this.position.checkCollision(position);
    }

    @Override
    public void draw() {
        player.load("playerTest.jpg");
        int i = grid.getWidth() / 2;
        int ii = grid.getHeight() / 2;
        player.draw();
        player.translate(i - 45, ii- -185 );
        //this.position.draw();

    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }


    public Position getPosition() {
        return position;
    }

    public int getFun() {
        return fun;
    }

    public int getKnowledge() {
        return knowledge;
    }


    public void setGrid(Grid grid) {
        this.grid = grid;
    }
}
