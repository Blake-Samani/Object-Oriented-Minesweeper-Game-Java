package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MinesweeperGamePanel;

public class MinesweeperKeyListener implements ActionListener {

    private MinesweeperGamePanel panel;

    public MinesweeperKeyListener(MinesweeperGamePanel panel){
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
    
}
