package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.MinesweeperGame;
import view.MinesweeperGamePanel;


public class MinesweeperKeyListener implements ActionListener {

    private MinesweeperGamePanel panel;
    private MinesweeperGame game = new MinesweeperGame();
    private int bombLocation;

    public MinesweeperKeyListener(MinesweeperGamePanel panel){
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println(button.getText());
        // int ind = Integer.parseInt(button.getText());

        // System.out.println(ind);
        if (button == panel.getRestartButton()) {
           JFrame window = panel.getWindow();
           window.getContentPane().removeAll();
           var gm = new MinesweeperGamePanel(window);
           gm.init();
           window.pack();
           window.revalidate();
     }
     panel.getCanvas().repaint(); //check this when testing canvas

     JButton[] arButtons = panel.getMinesButtons();
     int[] bombAr = game.getBomb();
     

        for(int i = 0; i < arButtons.length; i++){
            if(bombAr[i] == 1){
                bombLocation = i;
            }
        }
        
        for(int i =0; i < arButtons.length; i++){
            if(button == arButtons[bombLocation]){
                button.setText("BOMB BOOM BOOM");
            }else{
                button.setVisible(false);
            }
        }

     
    
    }
}
