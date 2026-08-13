
/*
 * This demonstrates a GridLayout in Swing with 3 rows and 2 columns.
 * 
 */
import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    // Fields (widgets)
    private JLabel lblOne, lblTwo, lblThree, lblFour, lblFive, lblSix;

    public GridLayoutDemo() {
        super("GridLayout Demo");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 2));

        this.lblOne = new JLabel("One");
        this.lblTwo = new JLabel("Two");
        this.lblThree = new JLabel("Three");
        this.lblFour = new JLabel("Four");
        this.lblFive = new JLabel("Five");
        this.lblSix = new JLabel("Six");

        this.add(lblOne);
        this.add(lblTwo);
        this.add(lblThree);
        this.add(lblFour);
        this.add(lblFive);
        this.add(lblSix);

    }

    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setVisible(true);
    }
}
