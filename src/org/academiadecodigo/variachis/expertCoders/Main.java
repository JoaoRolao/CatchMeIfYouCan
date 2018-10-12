package org.academiadecodigo.variachis.expertCoders;


public class Main {

    public static void main(String[] args) {


        Game game = new Game();


        game.gameInit();
        System.out.println(game.isGameStart());

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        game.gameStart();


        //game.gameStart();


    }
}
