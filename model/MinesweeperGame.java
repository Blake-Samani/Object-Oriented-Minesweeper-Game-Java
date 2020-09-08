package model;

import java.util.Random;

public class MinesweeperGame {
    private int[] hasBomb = new int[20];


    public MinesweeperGame(){
        randomizeBomb();
    }

    private void randomizeBomb(){
        for(int i = 0; i < 20; i++){
            hasBomb[i] = 0;
        }
        Random r = new Random();
        hasBomb[r.nextInt(20)] = 1;
    }

    public int[] getBomb(){
        return hasBomb;
    }

    // public int getBombIndex(){
    //     int a;
    //     for(int i = 0; i < hasBomb.length; i++){
    //         if(hasBomb[i] == 1){
    //             System.out.println(hasBomb[i]);
    //             a = hasBomb[i];
    //             return a;
    //         }
    //         else{
    //             System.out.println("NO BOMB WAS FOUND");
    //             a = 0;
    //             return a;
    //         }
            
    //     }
    // }
}
