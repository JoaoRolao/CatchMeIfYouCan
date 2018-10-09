package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;

public class PlayerKeyboard implements KeyboardHandler {

    Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

    //KeyboardHandler keyboardHandler = new KeyboardHandler() {

    Keyboard keyboard = new Keyboard(this);

    public void moves() {
        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(moveRight);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                player.move(Position.Direction.RIGHT);
                break;
            case KeyboardEvent.KEY_LEFT:
                player.move(Position.Direction.LEFT);
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}



