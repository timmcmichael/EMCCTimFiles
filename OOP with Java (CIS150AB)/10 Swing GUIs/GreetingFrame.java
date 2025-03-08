
/*
 * This demonstrates event handling with the Swing framework.
 * 
 * NOTE: This is the completed code at the end of the video. The video starts from a new file, so there is no starter file.
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingFrame extends JFrame implements ActionListener {

    // Fields (widgets)
    private JLabel lblName, lblGreeting;
    private JTextField txtName;
    private JButton btnSubmit;

    public GreetingFrame() {
        super("Greetings!");

        // Frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new FlowLayout());

        // Widgets
        this.lblName = new JLabel("Enter your name:");
        this.txtName = new JTextField();
        this.txtName.setPreferredSize(new Dimension(250, 25));
        this.btnSubmit = new JButton("Submit");
        this.lblGreeting = new JLabel();
        this.lblGreeting.setPreferredSize(new Dimension(250, 25));

        this.add(this.lblName);
        this.add(this.txtName);
        this.add(this.btnSubmit);
        this.add(this.lblGreeting);

        this.btnSubmit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String greeting = "Hello, ";
        greeting += this.txtName.getText();
        this.lblGreeting.setText(greeting);
    }

    public static void main(String[] args) {
        GreetingFrame frame = new GreetingFrame();
        frame.setVisible(true);
    }

}
