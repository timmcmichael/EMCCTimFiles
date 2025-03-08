
/*
 * This is a demonstration of the JRadioButton widget in Swing.
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonDemo extends JFrame implements ActionListener {

    // Widgets
    private JLabel lblRadioButtons;
    private JRadioButton rdbLennon, rdbMcCartney, rdbHarrison, rdbStarr;
    private ButtonGroup grpChoices;
    private JButton btnSubmit;

    public JRadioButtonDemo() {
        super("JRadioButton Demo");
        this.setSize(300, 210);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.lblRadioButtons = new JLabel("Select the best songwriter in the Beatles:");
        this.rdbLennon = new JRadioButton("John Lennon");
        this.rdbMcCartney = new JRadioButton("Paul McCartney");
        this.rdbHarrison = new JRadioButton("George Harrison");
        this.rdbStarr = new JRadioButton("Ringo Starr");
        this.btnSubmit = new JButton("Submit");

        this.grpChoices = new ButtonGroup();
        this.grpChoices.add(rdbLennon);
        this.grpChoices.add(rdbMcCartney);
        this.grpChoices.add(rdbHarrison);
        this.grpChoices.add(rdbStarr);

        this.rdbLennon.setPreferredSize(new Dimension(250, 25));
        this.rdbMcCartney.setPreferredSize(new Dimension(250, 25));
        this.rdbHarrison.setPreferredSize(new Dimension(250, 25));
        this.rdbStarr.setPreferredSize(new Dimension(250, 25));

        this.add(lblRadioButtons);
        this.add(rdbLennon);
        this.add(rdbMcCartney);
        this.add(rdbHarrison);
        this.add(rdbStarr);
        this.add(btnSubmit);

        this.btnSubmit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.rdbLennon.isSelected()) {
            // ...
        } else if (this.rdbMcCartney.isSelected()) {
            // ...
        } else if (this.rdbHarrison.isSelected()) {
            // ...
        } else if (this.rdbStarr.isSelected()) {
            // ...
        } else {
            // ... No radiobutton selected!
        }
        // etc
    }

    public static void main(String[] args) {
        JRadioButtonDemo frame = new JRadioButtonDemo();
        frame.setVisible(true);

    }
}