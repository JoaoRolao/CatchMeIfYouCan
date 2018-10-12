package org.academiadecodigo.variachis.expertCoders.player;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.expertCoders.AbstractCollidable;
import org.academiadecodigo.variachis.expertCoders.grid.Grid;
import org.academiadecodigo.variachis.expertCoders.grid.position.Position;
import org.academiadecodigo.variachis.expertCoders.item.Item;

public class Player extends AbstractCollidable {

    private int knowledge = 50;
    private int fun = 50;
    private Picture playerPicture;
    private Position[] positions = new Position[4]; // TODO: 11/10/2018  


    public Player(Position position) {
        super(position);
        playerPicture = new Picture(super.getPosition().getCol() * Grid.CELLSIZE + Grid.PADDING,
                super.getPosition().getRow() * Grid.CELLSIZE + Grid.PADDING,
                "filipe.png");

    }


    @Override
    public boolean checkCollision(Position position) {

        return getPosition().equals(position);
    }

    @Override
    public void draw() {
        playerPicture.translate(-playerPicture.getWidth(), -playerPicture.getHeight());
        playerPicture.draw();

    }

    @Override
    public void move(Position.Direction direction) {
        super.move(direction);
        int dx = direction == Position.Direction.RIGHT ? 1 : -1;
        int diff = playerPicture.getX() + dx > Grid.PADDING ? dx : 0; // TODO: 11/10/2018

        playerPicture.translate(diff * Grid.CELLSIZE, 0);

    }

    public boolean gameOver(){
        return (getKnowledge() <= 0 || getFun() <= 0);
    }


    public void beingHit(Item item) {
        switch (item.getType()) {
            case CAP:
                knowledge -= 20;
                break;
            case BEER:
                fun += 20;
                break;
            case TREE:
                knowledge += 20;
                break;
            case ABSTRACTION:
                fun -= 20;
                break;
            case POLY:
                int random = ((int) (Math.random() * 4));
                switch (random){
                    case 0:
                        playerPicture.load("mestre_shorts.png");
                        playerPicture.draw();
                        break;
                    case 1:
                        playerPicture.load("sid.png");
                        playerPicture.draw();
                        break;
                    case 2:
                        playerPicture.load("filipe.png");
                        playerPicture.draw();
                        break;
                    case 3:
                        playerPicture.load("seringas.png");
                        playerPicture.draw();
                        break;
                }
                break;
        }
    }


    public boolean nextlevel(){
        return (getFun() >= 100 || getKnowledge() >= 100);
    }


    public int getFun() {
        return fun;
    }

    public int getKnowledge() {
        return knowledge;
    }


    public boolean isLeftOf(int cols) {
        return getPosition().getCol() < cols;
    }

    public boolean isRightOf(int cols) {
        return getPosition().getCol() > cols;
    }


    @Override
    public String toString() {
        return "Player{" +
                "playerPicture=" + playerPicture +
                '}';
    }
}

