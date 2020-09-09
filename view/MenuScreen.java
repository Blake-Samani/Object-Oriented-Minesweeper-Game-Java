package view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



import javax.swing.JButton;

public class MenuScreen {
    
    private JFrame window;

    public MenuScreen(JFrame window){
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(800, 200));
        menuPanel.setLayout(new GridLayout(1, 1));
        cp.add(BorderLayout.CENTER, menuPanel);

        var minesweeperStartButton = new JButton("Minesweeper Game");
        menuPanel.add(minesweeperStartButton);
       

        minesweeperStartButton.addActionListener(event -> {
            window.getContentPane().removeAll();
            var panel = new MinesweeperGamePanel(window);
            panel.init();
            window.pack();
            window.setVisible(true);
           
        });
    }



}
