package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MinesweeperCanvas extends JPanel {

    public static int WIDTH = 400;
    public static int HEIGHT = 200;
    private int bomb = 1;

    private MinesweeperGamePanel panel;

    public MinesweeperCanvas(MinesweeperGamePanel panel){
        this.panel = panel;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.PINK);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // custom drawing
        // ready to play

        Graphics2D g2 = (Graphics2D) g;

        MinesweeperGamePanel.GameState state = panel.getGameState();
        if(state == MinesweeperGamePanel.GameState.READY) {
            g2.setColor(Color.BLUE);
            g2.setFont(new Font("Courier", Font.BOLD, 25));
            g2.drawString("START", 100, 150); //canvas draw
        }else{
            g2.setColor(Color.BLUE);
            g2.setFont(new Font("Courier", Font.BOLD, 25));
            //draw picture
            
        }
    }

    public int getBomb(){
        return bomb;
    }
}
