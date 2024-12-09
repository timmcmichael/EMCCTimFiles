import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCheckBoxDemo2 extends JFrame implements ActionListener {

    // Widgets
    private JLabel lblCheckBoxes;
    private JCheckBox chkLennon, chkMcCartney, chkHarrison, chkSutcliffe, chkBest, chkStarr;
    private JButton btnSubmit;

    public JCheckBoxDemo2() {
        super("Checkbox Example");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.lblCheckBoxes = new JLabel("The Beatles are a tremendously important band.");
        this.chkLennon = new JCheckBox("I agree to these terms and conditions.");
        this.chkMcCartney = new JCheckBox("Paul McCartney");
        this.chkHarrison = new JCheckBox("George Harrison");
        this.chkSutcliffe = new JCheckBox("Stuart Sutcliffe");
        this.chkBest = new JCheckBox("Pete Best");
        this.chkStarr = new JCheckBox("Ringo Starr");
        this.btnSubmit = new JButton("Submit");

        // this.chkLennon.setPreferredSize(new Dimension(250, 25));
        this.chkMcCartney.setPreferredSize(new Dimension(250, 25));
        this.chkHarrison.setPreferredSize(new Dimension(250, 25));
        this.chkSutcliffe.setPreferredSize(new Dimension(250, 25));
        this.chkBest.setPreferredSize(new Dimension(250, 25));
        this.chkStarr.setPreferredSize(new Dimension(250, 25));

        this.add(lblCheckBoxes);
        this.add(chkLennon);
        // this.add(chkMcCartney);
        // this.add(chkHarrison);
        // this.add(chkSutcliffe);
        // this.add(chkBest);
        // this.add(chkStarr);
        // this.add(btnSubmit);

        // this.btnSubmit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.chkLennon.isSelected()) {
            // ...
        }
        if (this.chkMcCartney.isSelected()) {
            // ...
        }
        if (this.chkHarrison.isSelected()) {
            // ...
        }
        // etc
    }

    public static void main(String[] args) {
        JCheckBoxDemo2 frame = new JCheckBoxDemo2();
        frame.setVisible(true);

    }
}