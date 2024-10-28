package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApp.class.getResource("Calculatorview.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 250);
            Stage stage = new Stage();
            stage.setTitle("Electricity Cost Calculator");
            stage.setScene(scene);
            stage.show();
        }

    public static void main(String[] args) {
        launch();
    }

    }


