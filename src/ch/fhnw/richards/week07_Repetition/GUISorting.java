package ch.fhnw.richards.week07_Repetition;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUISorting extends Application {

    private ArrayList<Integer> numberList = new ArrayList<>();
    TextField inputField = new TextField();

    Label infoLabel = new Label("Enter positive integers. Enter a negative number to stop.");
    Label resultLabel = new Label("");
    Button submitButton = new Button("Submit");
    Button sortButton = new Button("Sort");


    @Override
    public void start(Stage primaryStage) {

        // Create a FlowPane
        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
        flowPane.setBackground(Background.fill(Color.LIGHTBLUE));

        // Set the fixed width and height for the FlowPane
        double width = 500; // Replace with your desired width
        double height = 300; // Replace with your desired height

        flowPane.setPrefWidth(width);
        flowPane.setPrefHeight(height);
        flowPane.setMinWidth(width);
        flowPane.setMinHeight(height);
        flowPane.setMaxWidth(width);
        flowPane.setMaxHeight(height);

        // New VBox
        VBox vbox = new VBox();
        vbox.getChildren().addAll(inputField, infoLabel, submitButton, sortButton, resultLabel);
        vbox.setSpacing(20);

        // Settings paddings for FlowPane
        flowPane.setPadding(new Insets(20, 20, 20, 20));

        // Set width for input field
        inputField.setPrefWidth(150);
        inputField.setMaxWidth(150);
        inputField.setPromptText("Enter a positive integer");

        // Adding Vbox to FlowPane
        flowPane.getChildren().add(vbox);
        Scene scene = new Scene(flowPane);

        // Defining Event handlers for button clicks
        submitButton.setOnAction(this::enterNumbers);
        sortButton.setOnAction(this::sortNumbers);

        // Sorting disabled because input data not existing so far
        sortButton.setDisable(true);

        // Set the scene and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("GUI Sorting");
        primaryStage.show();
    }


    // Event handler for entering numbers
    private void enterNumbers(ActionEvent actionEvent) {
        resultLabel.setText("");
        int number = Integer.parseInt(inputField.getText());
        if (number >= 0) {
            numberList.add(number);
            infoLabel.setText("Number " + number + " added.");
        } else {
            // Terminate input on negative number
            infoLabel.setText("Input terminated. Numbers entered: " + numberList);
            inputField.setDisable(true);
            submitButton.setDisable(true);
            sortButton.setDisable(false);
        }

        inputField.clear();

    }

    // Event handler for sorting numbers
    private void sortNumbers(ActionEvent actionEvent) {
        ArrayList<Integer> sortedNumbers = new ArrayList<>();
        sortedNumbers = Sorting.sort(numberList);
        showResultInLabel(sortedNumbers);
    }

    // Showing the results
    public void showResultInLabel(ArrayList<Integer> sortedNumbers) {
        resultLabel.setText("Sorted numbers: " + sortedNumbers.toString());
        enableNewTry();
    }

    // Define settings for new try
    private void enableNewTry() {
        inputField.setDisable(false);
        sortButton.setDisable(true);
        submitButton.setDisable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}


