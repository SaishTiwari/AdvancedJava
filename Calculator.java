package com.tiwarisaish.advancedjava;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField display;
    private double num1 = 0;
    private String operator = "";
    private boolean start = true;

    @Override
    public void start(Stage primaryStage) {
        display = new TextField();
        display.setEditable(false);
        display.setPrefSize(200, 40);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        int row = 1;
        int col = 0;

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setPrefSize(50, 50);
            button.setOnAction(e -> handleButtonClick(label));
            grid.add(button, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }

        grid.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(grid, 250, 300);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String label) {
        if (label.matches("[0-9]")) {
            if (start) {
                display.clear();
                start = false;
            }
            display.appendText(label);
        } else if (label.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operator = label;
            start = true;
        } else if (label.equals("=")) {
            double num2 = Double.parseDouble(display.getText());
            double result = calculate(num1, num2, operator);
            display.setText(String.valueOf(result));
            start = true;
        } else if (label.equals("C")) {
            display.clear();
            start = true;
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    display.setText("Error");
                    start = true;
                    return 0;
                }
            default: return 0;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
