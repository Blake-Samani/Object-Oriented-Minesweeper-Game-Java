package model;

import java.util.Random;

public class MinesweeperGame {
    private static int MAXX = 50;
    private int[] hasBomb = new int[MAXX];


    public MinesweeperGame(){
        randomizeBomb();
    }

    private void randomizeBomb(){
        for(int i = 0; i < MAXX; i++){
            hasBomb[i] = 0;
        }
        Random r = new Random();
        hasBomb[r.nextInt(MAXX)] = 1;
    }

    public int[] getBomb(){
        return hasBomb;
    }
}
    