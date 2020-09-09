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
    private int clicks = 0;

    public MinesweeperKeyListener(MinesweeperGamePanel panel){
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println(button.getText());
        // int ind = Integer.parseInt(button.getText());

        JButton[] arButtons = panel.getMinesButtons();
        int[] bombAr = game.getBomb();
     
        for(int i = 0; i < arButtons.length; i++){ // find bomb location
            if(bombAr[i] == 1){
                bombLocation = i;
                System.out.println(""+ i + " BOMB IS AT " + i);
            }
        }
        if (button == panel.getRestartButton()) {
           game = new MinesweeperGame();
           JFrame window = panel.getWindow();
           window.getContentPane().removeAll();
           panel = new MinesweeperGamePanel(window);
           clicks = 0;
           panel.init();
           panel.setGameState(MinesweeperGamePanel.GameState.PLAYING);
           window.pack();
           window.revalidate();
           panel.getCanvas().repaint();
     }

        if(button == arButtons[bombLocation]){
            button.setText("BOMB");
            for (var b: panel.getMinesButtons()) {
                b.setEnabled(false); 
            }
            panel.setGameState(MinesweeperGamePanel.GameState.GAMEOVER);
            panel.getCanvas().repaint();
        }else{
            button.setVisible(false);
                if(clicks == arButtons.length-2){ // if clicks are 49
                    panel.setGameState(MinesweeperGamePanel.GameState.WIN);
                    panel.getCanvas().repaint();
                    for (var b: panel.getMinesButtons()) {
                        b.setEnabled(false);
                        b.setText(":)"); 
                    }
                 }
            clicks++;
            }
        

     
    
    }
}
