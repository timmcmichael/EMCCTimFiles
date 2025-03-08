
/*
 * This is a demonstration of a Swing GUI that performs calculations with user input and then displays the result.
 * 
 * NOTE: This is the completed code at the end of the video (and doesn't compile due to the filename change). See GUICalculations.java for the starter file.
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculations extends JFrame implements ActionListener {

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
        // this.lblResult.setMinimumSize(new Dimension(250, 25));

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

        this.btnCalc.addActionListener(this);
    }

    public double getFoodPrice() {
        String input = this.txtFood.getText();
        double foodPrice = Double.parseDouble(input);
        return foodPrice;
    }

    public double getDrinkPrice() {
        return Double.parseDouble(this.txtFood.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = this.txtFood.getText();
        double foodPrice = Double.parseDouble(input);

        double drinkPrice = Double.parseDouble(this.txtDrink.getText());

        boolean addTip = this.chkTip.isSelected();

        double total = foodPrice + drinkPrice;

        if (addTip) {
            total *= 1.2;
        }

        this.lblResult.setText("Total Price: $" + total);
    }

    public static void main(String[] args) {
        GUICalculationsDone frame = new GUICalculationsDone();
        frame.setVisible(true);
    }
}
