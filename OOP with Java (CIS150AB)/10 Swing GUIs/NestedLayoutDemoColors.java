/*
 * This demonstrates the use of nested layouts to organize a more complex GUI.
 * 
 * This example uses colors to make the different elements more visible. To see an example without those colors, see NestedLayoutDemo.java
 */

import javax.swing.*;
import java.awt.*;

public class NestedLayoutDemoColors extends JFrame {

    // Fields (widgets)
    private JPanel pnlChoices, pnlButton;
    private JLabel lblPrompt;
    private JRadioButton rdbEpstein, rdbMartin, rdbBest, rdbAspinall, rdbEvans;
    private ButtonGroup grpFifthMember;
    private JButton btnSubmit;

    public NestedLayoutDemoColors() {
        super("Fancy Layout Demo");
        this.setSize(300, 180);
        this.getContentPane().setBackground(Color.pink);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.lblPrompt = new JLabel("Who was the fifth Beatle?");
        this.btnSubmit = new JButton("Submit My Selections");
        this.grpFifthMember = new ButtonGroup();

        this.rdbEpstein = new JRadioButton("Brian Epstein");
        this.rdbMartin = new JRadioButton("George Martin");
        this.rdbBest = new JRadioButton("Pete Best");
        this.rdbAspinall = new JRadioButton("Neil Aspinall");
        this.rdbEvans = new JRadioButton("Mal Evans");

        // Add radio buttons to group (so only one can be selected at a time)
        this.grpFifthMember.add(this.rdbAspinall);
        this.grpFifthMember.add(this.rdbBest);
        this.grpFifthMember.add(this.rdbEpstein);
        this.grpFifthMember.add(this.rdbMartin);
        this.grpFifthMember.add(this.rdbEvans);

        // Panel to organize the radio buttons into a grid within a panel
        this.pnlChoices = new JPanel();
        this.pnlChoices.setBackground(Color.CYAN);
        this.pnlChoices.setLayout(new GridLayout(3, 2)); // 3 rows, two columns
        this.pnlChoices.add(this.rdbAspinall);
        this.pnlChoices.add(this.rdbBest);
        this.pnlChoices.add(this.rdbEpstein);
        this.pnlChoices.add(this.rdbMartin);
        this.pnlChoices.add(this.rdbEvans);

        // Panel to "organize" the Button. Putting it in a FlowLayout makes it centered
        this.pnlButton = new JPanel();
        this.pnlButton.setBackground(Color.ORANGE);
        this.pnlButton.setLayout(new FlowLayout());
        this.pnlButton.add(this.btnSubmit);

        // Add the prompt and two panels to the FlowLayout
        this.add(this.lblPrompt);
        this.add(this.pnlChoices);
        this.add(this.pnlButton);

    }

    public static void main(String[] args) {
        NestedLayoutDemoColors frame = new NestedLayoutDemoColors();
        frame.setVisible(true);
    }

}
