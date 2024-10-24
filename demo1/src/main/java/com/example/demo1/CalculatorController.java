package com.example.demo1;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.Calculator;

public class CalculatorController {
    @FXML
    private TextField display;

    private final Calculator calculator = new Calculator();
    private final StringBuilder input = new StringBuilder();

    @FXML
    private void handleDigit(javafx.event.ActionEvent event) {
        String digit = ((javafx.scene.control.Button) event.getSource()).getText();
        input.append(digit);
        display.setText(input.toString());
    }
    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        String operator = ((javafx.scene.control.Button) event.getSource()).getText();
        calculator.setOperand1(Double.parseDouble(input.toString()));
        calculator.setOperator(operator.charAt(0));
        input.setLength(0);  // Clear the input for the second operand
    }

    @FXML
    private void handleEquals(javafx.event.ActionEvent event) {
        calculator.setOperand2(Double.parseDouble(input.toString()));
        calculator.calculate();
        if (calculator.isError()) {
            display.setText("Error");
        } else {
            display.setText(String.valueOf(calculator.getResult()));
        }
        input.setLength(0);  // Clear input for next operation
    }

    @FXML
    private void handleClear(javafx.event.ActionEvent event) {
        calculator.reset();
        input.setLength(0);
        display.setText("");
    }
}
