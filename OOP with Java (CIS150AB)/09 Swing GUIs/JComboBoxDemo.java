
/*
 * This is a demonstration of the JComboBox widget in Swing.
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxDemo extends JFrame implements ActionListener {

    // Widgets
    private JLabel lblFavFab, lblFavSong;
    private JComboBox<String> cboFavFab, cboFavSong;
    private JButton btnSubmit;

    public JComboBoxDemo() {
        super("JComboBox Demo");

        String[] fabs = { "John", "Paul", "George", "Ringo" };
        String[] songs = { "Here Comes the Sun", "Yesterday", "In My Life", "Let It Be" };

        this.setSize(500, 180);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.lblFavFab = new JLabel("Select your favorite member of the Fab Four:");
        this.lblFavSong = new JLabel("Select or enter your favorite Beatles song:");
        this.cboFavFab = new JComboBox<String>(fabs);
        this.cboFavSong = new JComboBox<String>(songs);

        // The song selection is editable:
        this.cboFavSong.setEditable(true);

        this.btnSubmit = new JButton("Submit");

        this.add(lblFavFab);
        this.add(cboFavFab);
        this.add(lblFavSong);
        this.add(cboFavSong);
        this.add(btnSubmit);

        this.btnSubmit.addActionListener(this);

    }

    @SuppressWarnings("unused")

    @Override
    public void actionPerformed(ActionEvent e) {

        // Get the index of the selected item:
        if (this.cboFavFab.getSelectedIndex() == 0) {
            // They chose John!
        } else if (this.cboFavFab.getSelectedIndex() == 1) {
            // They chose Paul!
        }
        // ...

        // Or convert the selected item to a String:

        String favSong = (String) cboFavSong.getSelectedItem();
    }

    public static void main(String[] args) {
        JComboBoxDemo frame = new JComboBoxDemo();
        frame.setVisible(true);

    }
}