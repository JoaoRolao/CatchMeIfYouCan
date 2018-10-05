package org.academiadecodigo.variachis.expertCoders;

import org.academiadecodigo.variachis.expertCoders.grid.Grid;

public class Main {

    public static void main(String[] args) {


        Game game = new Game();

        game.gameInit();


        //test grid
        Grid grid = new Grid(10, 10);
        grid.checkCollision();
        grid.draw();
        grid.getCols();
        grid.getRows();
    }



}
