import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private IEval evaluator;

    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    public View(IEval evaluator) {
        this.evaluator = evaluator;

        setSize(360, 400);
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Font font1 = new Font("SansSerif", Font.BOLD, 32);

        inputField = new JTextField();
        inputField.setEditable(false);
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setFont(font1);

        numberButtons = new JButton[10];
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");

        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        mainPanel.add(inputField, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        for (int i = 9; i >= 0; i--) {
            buttonPanel.add(numberButtons[i]);
        }

        for (JButton operatorButton : operatorButtons) {
            buttonPanel.add(operatorButton);
        }

        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);

        for (JButton numberButton : numberButtons) {
            numberButton.addActionListener(new NumberButtonListener());
        }

        for (JButton operatorButton : operatorButtons) {
            operatorButton.addActionListener(new OperatorButtonListener());
        }

        equalsButton.addActionListener(new EqualsButtonListener());
        clearButton.addActionListener(new ClearButtonListener());

        setContentPane(mainPanel);
        //pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            inputField.setText(inputField.getText() + button.getText());
        }
    }

    private class OperatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            inputField.setText(inputField.getText() + " " + button.getText() + " ");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expression = inputField.getText();
            int result = evaluator.evaluate(expression);
            inputField.setText(String.valueOf(result));
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
        }
    }
}
