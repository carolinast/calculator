package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JPanel myPanel;
    private JTextField input;
    private JButton button00;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton multiply;
    private JButton undo;
    private JButton divide;
    private JButton minus;
    private JButton plus;
    private JButton point;
    private JButton equals;
    private JButton clear;

    double firstNumber;
    double secondNumber;
    double result;
    int operation;
    String sum;

    public Calculator() {
        $$$setupUI$$$();
        button00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "00");
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "0");
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + ".");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "9");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(input.getText());
                input.setText("");
                operation = 1;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(input.getText());
                input.setText("");
                operation = 2;
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(input.getText());
                input.setText("");
                operation = 3;
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(input.getText());
                input.setText("");
                operation = 4;
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
            }
        });
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = input.getText().length() - 1;

                if (value > -1) {
                    StringBuilder undoneValue = new StringBuilder(input.getText());
                    undoneValue.deleteCharAt(value);
                    input.setText(String.valueOf(undoneValue));
                }
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operation) {
                    case 1:
                        secondNumber = Double.parseDouble(input.getText());
                        result = firstNumber + secondNumber;
                        sum = String.valueOf(result);
                        input.setText(sum);
                        break;

                    case 2:
                        secondNumber = Double.parseDouble(input.getText());
                        result = firstNumber - secondNumber;
                        sum = String.valueOf(result);
                        input.setText(sum);
                        break;

                    case 3:
                        secondNumber = Double.parseDouble(input.getText());
                        result = firstNumber * secondNumber;
                        sum = String.valueOf(result);
                        input.setText(sum);
                        break;

                    case 4:
                        secondNumber = Double.parseDouble(input.getText());
                        result = firstNumber / secondNumber;
                        sum = String.valueOf(result);
                        input.setText(sum);
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(700, 200, 350, 500);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        myPanel = new JPanel();
        myPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 4, new Insets(15, 15, 15, 15), -1, -1));
        myPanel.setBackground(new Color(-12763325));
        Font myPanelFont = this.$$$getFont$$$(null, Font.BOLD, -1, myPanel.getFont());
        if (myPanelFont != null) myPanel.setFont(myPanelFont);
        myPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-4473925)), null));
        button00 = new JButton();
        button00.setBackground(new Color(-8552573));
        Font button00Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button00.getFont());
        if (button00Font != null) button00.setFont(button00Font);
        button00.setText("00");
        myPanel.add(button00, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button1 = new JButton();
        button1.setBackground(new Color(-8552573));
        Font button1Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button1.getFont());
        if (button1Font != null) button1.setFont(button1Font);
        button1.setText("1");
        myPanel.add(button1, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button4 = new JButton();
        button4.setBackground(new Color(-8552573));
        Font button4Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button4.getFont());
        if (button4Font != null) button4.setFont(button4Font);
        button4.setText("4");
        myPanel.add(button4, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        input = new JTextField();
        input.setEditable(false);
        Font inputFont = this.$$$getFont$$$("Consolas", Font.BOLD, 36, input.getFont());
        if (inputFont != null) input.setFont(inputFont);
        input.setHorizontalAlignment(4);
        input.setMargin(new Insets(2, 5, 2, 5));
        input.setText("");
        myPanel.add(input, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        button7 = new JButton();
        button7.setBackground(new Color(-8552573));
        Font button7Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button7.getFont());
        if (button7Font != null) button7.setFont(button7Font);
        button7.setText("7");
        myPanel.add(button7, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        undo = new JButton();
        undo.setBackground(new Color(-8552573));
        Font undoFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, undo.getFont());
        if (undoFont != null) undo.setFont(undoFont);
        undo.setText("<-");
        myPanel.add(undo, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        divide = new JButton();
        divide.setBackground(new Color(-8552573));
        Font divideFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, divide.getFont());
        if (divideFont != null) divide.setFont(divideFont);
        divide.setText("/");
        myPanel.add(divide, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button9 = new JButton();
        button9.setBackground(new Color(-8552573));
        Font button9Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button9.getFont());
        if (button9Font != null) button9.setFont(button9Font);
        button9.setText("9");
        myPanel.add(button9, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        multiply = new JButton();
        multiply.setBackground(new Color(-8552573));
        Font multiplyFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, multiply.getFont());
        if (multiplyFont != null) multiply.setFont(multiplyFont);
        multiply.setText("*");
        myPanel.add(multiply, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button6 = new JButton();
        button6.setBackground(new Color(-8552573));
        Font button6Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button6.getFont());
        if (button6Font != null) button6.setFont(button6Font);
        button6.setText("6");
        myPanel.add(button6, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        minus = new JButton();
        minus.setBackground(new Color(-8552573));
        Font minusFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, minus.getFont());
        if (minusFont != null) minus.setFont(minusFont);
        minus.setText("-");
        myPanel.add(minus, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button3 = new JButton();
        button3.setBackground(new Color(-8552573));
        Font button3Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button3.getFont());
        if (button3Font != null) button3.setFont(button3Font);
        button3.setText("3");
        myPanel.add(button3, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        plus = new JButton();
        plus.setBackground(new Color(-8552573));
        Font plusFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, plus.getFont());
        if (plusFont != null) plus.setFont(plusFont);
        plus.setText("+");
        myPanel.add(plus, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        point = new JButton();
        point.setBackground(new Color(-8552573));
        Font pointFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, point.getFont());
        if (pointFont != null) point.setFont(pointFont);
        point.setText(".");
        myPanel.add(point, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        equals = new JButton();
        equals.setBackground(new Color(-8552573));
        Font equalsFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, equals.getFont());
        if (equalsFont != null) equals.setFont(equalsFont);
        equals.setText("=");
        myPanel.add(equals, new com.intellij.uiDesigner.core.GridConstraints(5, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clear = new JButton();
        clear.setBackground(new Color(-8552573));
        Font clearFont = this.$$$getFont$$$("Consolas", Font.BOLD, 22, clear.getFont());
        if (clearFont != null) clear.setFont(clearFont);
        clear.setHorizontalTextPosition(11);
        clear.setText("C");
        myPanel.add(clear, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button8 = new JButton();
        button8.setBackground(new Color(-8552573));
        Font button8Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button8.getFont());
        if (button8Font != null) button8.setFont(button8Font);
        button8.setText("8");
        myPanel.add(button8, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button5 = new JButton();
        button5.setBackground(new Color(-8552573));
        Font button5Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button5.getFont());
        if (button5Font != null) button5.setFont(button5Font);
        button5.setText("5");
        myPanel.add(button5, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button2 = new JButton();
        button2.setBackground(new Color(-8552573));
        Font button2Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button2.getFont());
        if (button2Font != null) button2.setFont(button2Font);
        button2.setText("2");
        myPanel.add(button2, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button0 = new JButton();
        button0.setBackground(new Color(-8552573));
        Font button0Font = this.$$$getFont$$$("Consolas", Font.BOLD, 22, button0.getFont());
        if (button0Font != null) button0.setFont(button0Font);
        button0.setText("0");
        myPanel.add(button0, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return myPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
