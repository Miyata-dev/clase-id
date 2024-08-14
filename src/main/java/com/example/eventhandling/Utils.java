package com.example.eventhandling;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Utils {
    public static void paintCircles(GridPane grid, int columnToPaint, int state) {
        for (Node circle : grid.getChildren()) {
            String targetID = circle.getId();
            ID temporaryID = new ID(targetID);
            CustomCircle targetedCircle = (CustomCircle) circle;

            if (ID.isThisColumn(temporaryID, columnToPaint)) {
                //System.out.println(temporaryID.getGeneratedID() + " " + circle.getId());

                targetedCircle.setState(state);
            }
        }
    }
}
