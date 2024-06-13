package com.tiwarisaish.advancedjava;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Home_Calc  extends Application {

    private TextField textField = new TextField();
    private long num = 0;
    private String op = "";
    private Boolean start = true;



    public void start (Stage primaryStage) throws Exception{

        textField.setFont(Font.font(16));
        textField.setPrefHeight(50);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false);

        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        stackPane.getChildren().add(textField);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(stackPane);

        Scene scene = new Scene(borderPane, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}
