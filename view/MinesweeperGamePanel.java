package view;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.MinesweeperKeyListener;
import model.MinesweeperGame;

public class MinesweeperGamePanel {

    public enum GameState {
        READY, PLAYING, GAMEOVER
    }

    private MinesweeperCanvas canvas;
    private JButton[] minesButton = new JButton[20];
    private JButton restartButton = new JButton("New Game");
    private GameState gameState = GameState.READY;

    private JFrame window;

    private MinesweeperGame msgame; //GAME OBJECT


    public MinesweeperGamePanel(JFrame window){
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        canvas = new MinesweeperCanvas(this);
        cp.add(BorderLayout.NORTH, canvas);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(400, 200));
        buttonPanel.setLayout(new GridLayout(5,4));

        MinesweeperKeyListener keyListener = new MinesweeperKeyListener(this);

        

        for(int i = 0; i < 20; i++){
            minesButton[i] = new JButton(); // CHANGE THIS
            buttonPanel.add(minesButton[i]);
            minesButton[i].addActionListener(keyListener);  
        }

        restartButton.addActionListener(keyListener);

        cp.add(BorderLayout.CENTER, buttonPanel);

        JPanel southPanel = new JPanel();
        southPanel.add(restartButton);
        southPanel.setPreferredSize(new Dimension(400,35));
        southPanel.setBackground(Color.pink);
        cp.add(BorderLayout.SOUTH, southPanel);

        // northPanel.setLayout(new GridLayout(2,2));
        // northPanel.add()
    }

    public MinesweeperGame getMinesweeperGame(){
        return msgame;
    }

    public JFrame getWindow(){
        return window;
    }
    

    public MinesweeperCanvas getCanvas(){
        return canvas;
    }
    
    public JButton[] getMinesButtons(){
        return minesButton;
    }

    public JButton getRestartButton(){
       return restartButton;
    }

    public GameState getGameState(){
        return gameState;
    }

    public void setGameState(GameState state) {
        this.gameState = state;
    }

    

   


}
