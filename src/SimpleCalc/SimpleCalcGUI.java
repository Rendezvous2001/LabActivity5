package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{// For

    private JPanel panel2;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() throws Exception{// since Try catch exception handling if inside here
        cbOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int total = 0;

                    int first = Integer.parseInt(tfNumber1.getText());// to type something to text field and be saved
                    int second = Integer.parseInt(tfNumber2.getText());

                    if (cbOperations.getSelectedItem().equals("+")) {
                        total = first + second;
                        lblResult.setText(Integer.toString(total));
                    } else if (cbOperations.getSelectedItem().equals("-")) {
                        total = first - second;
                        lblResult.setText(Integer.toString(total));
                    } else if (cbOperations.getSelectedItem().equals("*")) {
                        total = first * second;
                        lblResult.setText(Integer.toString(total));
                    } else if (cbOperations.getSelectedItem().equals("/")) {
                        total = first / second;
                        lblResult.setText(Integer.toString(total));
                    }
                }catch(Exception e1) {
                    JOptionPane.showMessageDialog(panel2, "Invalid Input");
                }
            }
        });
    }



    public static void main(String[] args) throws Exception{ // to call the exception handling in the main method

        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel2);
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");


    }

}
