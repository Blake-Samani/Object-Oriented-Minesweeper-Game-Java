package test;

import model.MinesweeperGame;

public class MinesweeperGameTest {
    public static void main(String[] args){

    MinesweeperGame b = new MinesweeperGame();
    
    int[] a;
    a = b.getBomb();

    for(var e: a){
        System.out.println(e);
    }

    MinesweeperGame c = new MinesweeperGame();
    int[] d;
    d = c.getBomb();

    System.out.println("============================================");

    for(var e: d){
        System.out.println(e);
    }


    
     
    }
}
