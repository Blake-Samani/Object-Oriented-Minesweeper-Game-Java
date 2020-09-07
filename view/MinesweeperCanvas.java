package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MinesweeperCanvas extends JPanel {

    public static int WIDTH = 400;
    public static int HEIGHT = 200;

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
    }
}
