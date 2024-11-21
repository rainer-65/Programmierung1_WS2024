package ch.fhnw.richards.week07_Repetition;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxInFlowPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a FlowPane
        FlowPane flowPane = new FlowPane();

        // Create a VBox and add some content to it
        VBox vbox = new VBox();
        vbox.setSpacing(20); // Optional: space between elements in the VBox

        // Adding some example data (Labels) to the VBox
        Label label1 = new Label("Data 1");
        Label label2 = new Label("Data 2");
        Label label3 = new Label("Data 3");

        vbox.getChildren().addAll(label1, label2, label3); // Add labels to the VBox

        // Add the VBox to the FlowPane
        flowPane.getChildren().add(vbox);

        // Create a Scene with the FlowPane
        Scene scene = new Scene(flowPane, 400, 300);

        // Set the Scene on the Stage and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox inside FlowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

