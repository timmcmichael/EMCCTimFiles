import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    // Fields (Widgets)
    private JLabel lblHeading, lblLennon, lblMcCartney, lblHarrison, lblStarr;
    private JTextField txtLennon, txtMcCartney, txtHarrison, txtStarr;
    private JButton btnFinished;

    public FlowLayoutDemo() {
        super("FlowLayout Demo");
        this.setSize(700, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.lblHeading = new JLabel("Enter the best song from each of the Beatles");
        this.lblLennon = new JLabel("Best John song:");
        this.txtLennon = new JTextField("In My Life");
        this.lblMcCartney = new JLabel("Best Paul song:");
        this.txtMcCartney = new JTextField("Here, There and Everywhere");
        this.lblHarrison = new JLabel("Best George Song:");
        this.txtHarrison = new JTextField("While My Guitar Gently Weeps");
        this.lblStarr = new JLabel("Best Ringo Song:");
        this.txtStarr = new JTextField("Octopus's Garden");
        this.btnFinished = new JButton("Finished!");

        this.add(this.lblHeading);
        this.add(lblLennon);
        this.add(txtLennon);
        this.add(lblMcCartney);
        this.add(txtMcCartney);
        this.add(lblHarrison);
        this.add(txtHarrison);
        this.add(lblStarr);
        this.add(txtStarr);
        this.add(btnFinished);

    }

    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);

    }
}
