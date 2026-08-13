/*
 * This is a minimal Swing GUI, just showing how to get a label on the screen.
 * 
 */

import javax.swing.*;

public class BasicGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, World!");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lblHello = new JLabel("It's so gooey!");
        frame.add(lblHello);
        frame.setVisible(true);
    }

}