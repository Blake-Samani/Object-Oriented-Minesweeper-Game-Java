package model;

import java.util.Random;

public class MinesweeperGame {
    private int[] hasBomb = new int[20];


    public MinesweeperGame(){
        for(int i = 0; i < 20; i++){
            hasBomb[i] = 0;
        }
        randomizeBomb();
    }

    private void randomizeBomb(){
        Random r = new Random();
        hasBomb[r.nextInt(20)] = 1;
    }

    public int[] getBomb(){
        return hasBomb;
    }
}
