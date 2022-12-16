package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{// For

    private JPanel panel2;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {

        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel2);
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");


    }

}
