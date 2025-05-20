package Receiver;

import javax.swing.*;

public class main extends JFrame {

    public main() {

        Screen screen = Screen.getInstance();
        add(screen);
    }

    public static void main(String[] args) {
        main main = new main();
        main.setSize(800, 600);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);


    } 

}