package ch.fhnw.richards.week09_Comparing.solutions.fraction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class FractionGUI extends Application implements EventHandler<ActionEvent> {
    private TextField numerator1 = new TextField();
    private TextField numerator2 = new TextField();
    private TextField denominator1 = new TextField();
    private TextField denominator2 = new TextField();
    private ComboBox<String> operation = new ComboBox<>();
    private Button equals = new Button("=");
    private TextField numerator3 = new TextField("--");
    private TextField denominator3 = new TextField("--");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox fraction1 = new VBox(numerator1, denominator1);
        VBox fraction2 = new VBox(numerator2, denominator2);
        VBox fraction3 = new VBox(numerator3, denominator3);
        
        operation.getItems().addAll("+", "-", "*", "/");
        operation.setValue("+");
        operation.setMinWidth(Control.USE_PREF_SIZE);
        
        numerator1.getStyleClass().add("numerator");
        numerator2.getStyleClass().add("numerator");
        numerator3.getStyleClass().add("numerator");
        
        numerator3.setDisable(true);
        denominator3.setDisable(true);        
        
        equals.setOnAction(this);

        HBox root = new HBox(10, fraction1, operation, fraction2, equals, fraction3);
        root.setAlignment(Pos.CENTER);

        // Create the scene using our layout; then display it
        Scene scene = new Scene(root, 400, 100);
        scene.getStylesheets().add(getClass().getResource("fractions.css").toExternalForm());
        primaryStage.setTitle("Fraction Tester");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        Fraction f1 = new Fraction(Integer.parseInt(numerator1.getText()), Integer.parseInt(denominator1.getText()));
        Fraction f2 = new Fraction(Integer.parseInt(numerator2.getText()), Integer.parseInt(denominator2.getText()));
        
        String op = operation.getValue();
        Fraction f3 = null;
        switch(op) {
        case "+":
            f3 = f1.add(f2);
            break;
        case "-":
            f3 = f1.subtract(f2);
            break;
        case "*":
            f3 = f1.multiply(f2);
            break;
        case "/":
            f3 = f1.divide(f2);
            break;
        }
        
        if (f3 != null) {
            numerator3.setText(Long.toString(f3.getNumerator()));
            denominator3.setText(Long.toString(f3.getDenominator()));
        }
    }
}
