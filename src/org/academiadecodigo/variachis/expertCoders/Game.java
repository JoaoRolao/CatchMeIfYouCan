package org.academiadecodigo.variachis.expertCoders;

import java.util.LinkedList;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.grid.position.PositionFactory;
import org.academiadecodigo.variachis.expertCoders.item.Item;
import org.academiadecodigo.variachis.expertCoders.item.ItemFactory;
import org.academiadecodigo.variachis.expertCoders.player.Player;
import org.academiadecodigo.variachis.expertCoders.player.PlayerKeyboard;

public class Game implements KeyboardHandler {
    private LinkedList<Item> allItems = new LinkedList<>();
    private LinkedList<Item> activeItems = new LinkedList<>();
    private Player player;
    private Grid grid;
    private boolean gameOver;
    private GameLevel levelOne = new GameLevel();

    private void addItemsToList() {
        for (int i = 0; i < 10; i++) {
            allItems.add(ItemFactory.getItem(grid));
        }
        for (int i = 0; i < 5; i++) {
            activeItems.add(allItems.remove(i));
        }
    }

    public void gameInit() {
        this.grid = new Grid(80, 60);
        grid.draw();
        keyboardInit();
        levelOne.draw();
        this.player = new Player(PositionFactory.getPlayerPosition(grid));
        player.draw();
        addItemsToList();
    }

    private void itemRecycle(Item item) {
        allItems.add(item);
    }

    public void gameStart() {

        while (!gameOver) {

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Item item : activeItems) {

                item.move(Position.Direction.DOWN);
                item.draw();
                System.out.println("player: " + player.getPosition());
                System.out.println("item: " + item.getPosition());

                if (player.checkCollision(item.getPosition())) {
                    System.out.println("yesssss");
                    item.setColided(true);
                    player.beingHit(item);
                }

                if (grid.checkCollision(item.getPosition())) {
                    item.setColided(true);

                }

                if (item.isColided()) {
                    itemRecycle(item);
                    item.recycle();
                }

                if (player.getKnowledge() <= 0 || player.getFun() <= 0) { // TODO: 11/10/2018
                    System.out.println("You loose with : " + player.getFun() + " Fun, and with : " + player.getKnowledge() + " Knowlege.");
                    levelOne.setActualLevel(GameLevel.Level.TWO);


                }

            }

        }

    }

    public void keyboardInit() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent changeLevel1 = new KeyboardEvent();
        changeLevel1.setKey(KeyboardEvent.KEY_1);
        changeLevel1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent changeLevel2 = new KeyboardEvent();
        changeLevel2.setKey(KeyboardEvent.KEY_2);
        changeLevel2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveRight);
        keyboard.addEventListener(changeLevel2);
        keyboard.addEventListener(changeLevel1);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                if (player.isLeftOf(grid.getCols())) {
                    player.move(Position.Direction.RIGHT);
                }
                break;

            case KeyboardEvent.KEY_LEFT:
                if (player.isRightOf(0)) {
                    player.move(Position.Direction.LEFT);
                }
                break;
            case KeyboardEvent.KEY_1:
                levelOne.setActualLevel(GameLevel.Level.ONE);
                levelOne.draw();
                break;
            case KeyboardEvent.KEY_2:
                levelOne.setActualLevel(GameLevel.Level.TWO);
                levelOne.draw();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}



