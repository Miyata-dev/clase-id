package com.example.eventhandling;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPaneController gridPaneController = new GridPaneController(5, 30);

        GridPane grid = gridPaneController.getGridPane();

        //Agregamos el onMouseClicked a todos los circulos.

        Scene scene = new Scene(grid, 500, 500);
        stage.setTitle("Grid!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}