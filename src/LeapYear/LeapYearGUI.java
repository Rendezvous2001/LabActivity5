package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JLabel inputYourLabel;
    private JButton btnCheckYear;

    public LeapYearGUI() throws Exception{
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int year = Integer.parseInt(tfYear.getText());//for input

                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        JOptionPane.showMessageDialog(panel1, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(panel1, "Not a leap year");
                    }
                }catch(Exception e1) {
                    JOptionPane.showMessageDialog(panel1, "Invalid Year");
                }
            }
        });

    }

    public static void main(String[] args) throws Exception{

        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(300, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");


    }

}