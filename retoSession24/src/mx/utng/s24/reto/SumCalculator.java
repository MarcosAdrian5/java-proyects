package mx.utng.s24.reto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator {
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel labelResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SumCalculator window = new SumCalculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public SumCalculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Sum Calculator");
        frame.setBounds(100, 100, 450, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        textField1 = new JTextField();
        textField1.setColumns(10);
        frame.getContentPane().add(textField1);

        textField2 = new JTextField();
        textField2.setColumns(10);
        frame.getContentPane().add(textField2);

        JButton calculateButton = new JButton("Calculate Sum");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(textField1.getText());
                int number2 = Integer.parseInt(textField2.getText());
                int sum = number1 + number2;
                labelResult.setText("Result: " + sum);
            }
        });
        frame.getContentPane().add(calculateButton);

        labelResult = new JLabel("Result:");
        frame.getContentPane().add(labelResult);
    }
}