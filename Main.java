import javax.swing.JFrame;

import view.MenuScreen;

public class Main {
    public static void main(String[] args){


        JFrame window = new JFrame("BOMB SWEEPER VER: ALPHA 1.042543892");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(600, 300);

        var menu = new MenuScreen(window);
        menu.init();

        window.pack();
        window.setVisible(true);
    }
}