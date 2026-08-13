import javax.swing.*;
import java.awt.*;

public class GUICalculations extends JFrame {

    // Widgets
    JLabel lblFood, lblDrink, lblResult;
    JTextField txtFood, txtDrink;
    JCheckBox chkTip;
    JButton btnCalc;

    public GUICalculations() {
        super("Meal Price");
        this.lblFood = new JLabel("Enter the price of food:");
        this.txtFood = new JTextField("0.00");
        this.lblDrink = new JLabel("Enter the price of drinks:");
        this.txtDrink = new JTextField("0.00");
        this.chkTip = new JCheckBox("Add a 20% tip");
        this.btnCalc = new JButton("Calculate Total Price of Meal");
        this.lblResult = new JLabel("Total Price: $");

        this.setSize(300, 200);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(lblFood);
        this.add(txtFood);
        this.add(lblDrink);
        this.add(txtDrink);
        this.add(chkTip);
        this.add(btnCalc);
        this.add(lblResult);

    }

    public static void main(String[] args) {
        GUICalculations frame = new GUICalculations();
        frame.setVisible(true);
    }

}
