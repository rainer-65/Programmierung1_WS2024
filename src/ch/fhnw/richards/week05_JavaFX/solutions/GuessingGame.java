package ch.fhnw.richards.week05_JavaFX.solutions;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.util.Duration;

import java.util.Random;

public class GuessingGame extends Application {

    // Create the GUI
    Label headerLbl1 = new Label("Ich denke an eine Zahl zwischen 1 und 10");
    Label headerLbl2 = new Label("Raten Sie:");
    Label hintLbl = new Label("");
    TextField numberFld = new TextField();

    // Randomization
    private int secretNumber;
    private Random random = new Random();


    // Launch the application
    public void start(Stage stage) throws Exception {

        // Set title for the stage
        stage.setTitle("Guessing Game");

        // Creating buttons
        Button validateBtn = new Button("Validieren");
        Button newGameBtn = new Button("Neues Spiel?");

        // Create a FlowPane
        FlowPane flow_pane = new FlowPane(Orientation.VERTICAL);
        flow_pane.setBackground(Background.fill(Color.LIGHTBLUE));

        // Settings paddings and margins
        flow_pane.setPadding(new Insets(20, 20, 20, 20));
        flow_pane.setHgap(20);
        flow_pane.setVgap(20);
        flow_pane.setAlignment(Pos.CENTER);

        // Add GUI controls
        flow_pane.getChildren().add(headerLbl1);
        flow_pane.getChildren().add(headerLbl2);
        flow_pane.getChildren().add(numberFld);
        flow_pane.getChildren().add(validateBtn);
        flow_pane.getChildren().add(hintLbl);
        flow_pane.getChildren().add(newGameBtn);

        // Create a scene
        Scene scene = new Scene(flow_pane, 500, 400);

        // Set the scene
        stage.setScene(scene);

        // Show the GUI
        stage.show();

        // Animation for headerLbl1
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), headerLbl1);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.setCycleCount(20);
        fadeTransition.play();


        // Generate random number for first try
        createSecretNumber();

        // Event handling
        validateBtn.setOnAction(this::validateInput);
        newGameBtn.setOnAction(this::newGame);
    }


    private void createSecretNumber() {
        secretNumber = random.nextInt(10) + 1;
    }

    private void validateInput(ActionEvent actionEvent) {
        if (!numberFld.getText().isEmpty()) {
            if (secretNumber == Integer.parseInt(numberFld.getText())) {
                hintLbl.setTextFill(Color.GREEN);
                hintLbl.setText("NUMMER ERRATEN!");

            } else if (secretNumber < Integer.parseInt(numberFld.getText())) {
                hintLbl.setTextFill(Color.RED);
                hintLbl.setText("Deine Nummer ist zu gross!");
            } else {
                hintLbl.setTextFill(Color.RED);
                hintLbl.setText("Deine Nummer ist zu klein!");
            }

        } else {
            Alert inputAlert = new Alert(Alert.AlertType.ERROR);
            inputAlert.setContentText("Bitte Zahl eingeben!");
            inputAlert.show();
        }
    }


    private void newGame(ActionEvent actionEvent) {
        createSecretNumber();
        numberFld.setText("");
        hintLbl.setText("");
    }

    // Main Method
    public static void main(String[] args) {
        // launch the application
        launch(args);
    }
}
