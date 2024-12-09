import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCheckBoxDemo extends JFrame implements ActionListener {

    // Widgets
    private JLabel lblPrompt;
    private JCheckBox chkLennon, chkMcCartney, chkHarrison, chkSutcliffe, chkBest, chkStarr;
    private JButton btnSubmit;

    public JCheckBoxDemo() {
        super("JCheckBox Demo");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.lblPrompt = new JLabel("Select all of the members of the Beatles:");
        this.chkLennon = new JCheckBox("John Lennon");
        this.chkMcCartney = new JCheckBox("Paul McCartney");
        this.chkHarrison = new JCheckBox("George Harrison");
        this.chkSutcliffe = new JCheckBox("Stuart Sutcliffe");
        this.chkBest = new JCheckBox("Pete Best");
        this.chkStarr = new JCheckBox("Ringo Starr");
        this.btnSubmit = new JButton("Submit");

        this.chkLennon.setPreferredSize(new Dimension(250, 25));
        this.chkMcCartney.setPreferredSize(new Dimension(250, 25));
        this.chkHarrison.setPreferredSize(new Dimension(250, 25));
        this.chkSutcliffe.setPreferredSize(new Dimension(250, 25));
        this.chkBest.setPreferredSize(new Dimension(250, 25));
        this.chkStarr.setPreferredSize(new Dimension(250, 25));

        this.add(lblPrompt);
        this.add(chkLennon);
        this.add(chkMcCartney);
        this.add(chkHarrison);
        this.add(chkSutcliffe);
        this.add(chkBest);
        this.add(chkStarr);
        this.add(btnSubmit);

        this.btnSubmit.addActionListener(this);

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
        JCheckBoxDemo frame = new JCheckBoxDemo();
        frame.setVisible(true);

    }
}