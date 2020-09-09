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
    private int xPoly[] = {120, 200, 280};
    private int yPoly[] = {75, 175, 75};
    private int axPoly[] = {120, 200, 280};
    private int ayPoly[] = {140, 30, 140};
    private int bxPoly[] = {150, 150, 280};
    private int byPoly[] = {140, 40, 140};
    private int cxPoly[] = {120, 250, 240};
    private int cyPoly[] = {140, 40, 140};

    private MinesweeperGamePanel panel;

    public MinesweeperCanvas(MinesweeperGamePanel panel){
        this.panel = panel;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.PINK);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
     
        Graphics2D g2 = (Graphics2D) g;

        MinesweeperGamePanel.GameState state = panel.getGameState();
        if(state == MinesweeperGamePanel.GameState.PLAYING) {
            g2.setColor(Color.red);
            g2.setFont(new Font("Courier", Font.BOLD, 18));
            g2.drawString("START SWEEPING :D", 20, 40); //canvas draw
            g2.drawOval(180, 80, 100, 100);
            g2.fillOval(180, 80, 100, 100);
            g2.drawLine(230, 100, 250, 30);
            g2.drawLine(240, 30, 260, 30);
            g2.drawLine(245, 20, 260, 50);
            g2.drawLine(240, 40, 260, 20);
            
            
        }else if(state == MinesweeperGamePanel.GameState.WIN){
            g2.setColor(Color.red);
            g2.setFont(new Font("Courier", Font.BOLD, 25));
            g2.drawString("WOW YOU WON AMAZING!", 300, 100);
            // panel.getCanvas().repaint();
            //draw picture
        }else{
            g2.setColor(Color.red);
            g2.setFont(new Font("Courier", Font.BOLD, 25));
            g2.drawString("WOW YOU EXPLODED", 300, 100);
            g2.drawPolygon(xPoly, yPoly, 3);
            g2.fillPolygon(xPoly, yPoly, 3);
            g2.drawPolygon(axPoly, ayPoly, 3);
            g2.fillPolygon(axPoly, ayPoly, 3);
            g2.drawPolygon(bxPoly, byPoly, 3);
            g2.fillPolygon(bxPoly, byPoly, 3);
            g2.drawPolygon(cxPoly, cyPoly, 3);
            g2.fillPolygon(cxPoly, cyPoly, 3);
        }
    }
  
}
