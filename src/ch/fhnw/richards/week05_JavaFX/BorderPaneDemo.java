package ch.fhnw.richards.week05_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
	// Declare the individual controls in the GUI
    Label topLabel = new Label("I am at the top!");
    Label bottomLabel = new Label("I am at the bottom!");
    Label leftLabel = new Label("I am on the left!");
    Label rightLabel = new Label("I am on the right!");
    Label centerLabel = new Label("I am in the center!");

    // Organize the layout, add in the controls
    BorderPane root = new BorderPane();
    root.setTop(topLabel);
    root.setBottom(bottomLabel);
    root.setLeft(leftLabel);
    root.setRight(rightLabel);
    root.setCenter(centerLabel);

    // Create the scene using our layout; then display it
    Scene scene = new Scene(root);
    primaryStage.setTitle("Hello, JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}