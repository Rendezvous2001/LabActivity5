package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame {

    private JPanel panel3;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private List<JRadioButton> rbButtons;

    private List<JCheckBox> rbCheckBox;

    public FoodOrderGUI() {

        rbButtons = new ArrayList<>();
        rbButtons.add(rbNone);
        rbButtons.add(rb5);
        rbButtons.add(rb10);
        rbButtons.add(rb15);

        rbCheckBox = new ArrayList<>();
        rbCheckBox.add(cPizza);
        rbCheckBox.add(cBurger);
        rbCheckBox.add(cFries);
        rbCheckBox.add(cSoftDrinks);
        rbCheckBox.add(cTea);
        rbCheckBox.add(cSundae);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int countRbCheckBox = 0;
                double foodPrice = 0;

                for (JCheckBox rbC : rbCheckBox) {
                    if (rbC.isSelected()) {
                        if (rbC.getText().equals("Pizza")) {
                            foodPrice += 100;
                            countRbCheckBox++;
                        } else if (rbC.getText().equals("Burger")) {
                            foodPrice += 80;
                            countRbCheckBox++;
                        } else if (rbC.getText().equals("Fries")) {
                            foodPrice += 65;
                            countRbCheckBox++;
                        } else if (rbC.getText().equals("Soft drinks")) {
                            foodPrice += 55;
                            countRbCheckBox++;
                        } else if (rbC.getText().equals("Tea")) {
                            foodPrice += 50;
                            countRbCheckBox++;
                        } else if (rbC.getText().equals("Sundae")) {
                            foodPrice += 40;
                            countRbCheckBox++;
                        }

                    }
                }
                int foodDiscount = 0;
                for (JRadioButton rbB : rbButtons) {
                    if (rbB.isSelected()) {
                        if (rbB.getText().equals("None")) {
                            JOptionPane.showMessageDialog(panel3, "The total price is Php " + String.format("%.2f", foodPrice));//To have a 2 decimal places of none flat prices
                            foodDiscount++;
                        } else if (rbB.getText().equals("5% Off")) {
                            JOptionPane.showMessageDialog(panel3, "The total price is Php " + String.format("%.2f", foodPrice * .95));//Meaning the 5 percent discount has been deducted to 100% then multiply to the total price
                            foodDiscount++;
                        } else if (rbB.getText().equals("10% Off")) {
                            JOptionPane.showMessageDialog(panel3, "The total price is Php " + String.format("%.2f", foodPrice * .90));
                            foodDiscount++;
                        } else if (rbB.getText().equals("15% Off")) {
                            JOptionPane.showMessageDialog(panel3, "The total price is Php " + String.format("%.2f", foodPrice * .85));
                            foodDiscount++;
                        }
                    }
                }
            }
        });
    }


    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel3);//To run Frame function
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }

}

