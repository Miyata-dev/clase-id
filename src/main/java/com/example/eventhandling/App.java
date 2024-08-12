package com.example.eventhandling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Grid!");

        /*
        ID idUno = new ID(1, 2);
        ID idDos = new ID(1, 3);
        */
        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Circle circle = new Circle();
            }
        } */

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}