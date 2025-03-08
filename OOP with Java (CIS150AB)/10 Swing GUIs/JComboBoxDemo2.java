
/*
 * This is a demonstration of the JComboBox widget in Swing.
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxDemo2 extends JFrame implements ActionListener {

    // Widgets
    private JLabel lblFavFab, lblFavSong;
    private JComboBox<String> cboBeatles, cboFavSong;
    private JButton btnSubmit;

    public JComboBoxDemo2() {
        super("JComboBox Demo");

        this.cboBeatles = new JComboBox<String>();
        this.cboBeatles.addItem("John Lennon");
        this.cboBeatles.addItem("Paul McCartney");
        this.cboBeatles.addItem("George Harrison");
        this.cboBeatles.addItem("Ringo Starr");

        this.setSize(500, 180);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.lblFavFab = new JLabel("Select your favorite member of the Fab Four:");
        // this.cboBeatles = new JComboBox(fabs);
        this.lblFavSong = new JLabel("Select or enter your favorite Beatles song:");
        // this.cboFavSong = new JComboBox(songs);

        // The song selection is editable:
        // this.cboFavSong.setEditable(true);

        this.btnSubmit = new JButton("Submit");

        this.add(lblFavFab);
        this.add(cboBeatles);
        this.add(lblFavSong);
        // this.add(cboFavSong);
        this.add(btnSubmit);

        this.btnSubmit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Get the index of the selected item:
        if (this.cboBeatles.getSelectedIndex() == 0) {
            // They chose John!
        } else if (this.cboBeatles.getSelectedIndex() == 1) {
            // They chose Paul!
        }
        // ...

        // Or convert the selected item to a String:
        String favSong = (String) cboFavSong.getSelectedItem();
    }

    public static void main(String[] args) {
        JComboBoxDemo2 frame = new JComboBoxDemo2();
        frame.setVisible(true);

    }
}