package ch.fhnw.richards.week10_Arrays.sorting;

import java.lang.reflect.Method;
import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SortingTester extends Application  implements EventHandler<ActionEvent> {
	// Declare controls as object attributes, so that we can access them from the event handler
    private Button btnBubbleSort = new Button("Bubble Sort");
    private Button btnInsertionSort = new Button("Insertion Sort");
    private Button btnSelectionSort = new Button("Selection Sort");
    private Button btnMergeSort = new Button("Merge Sort");
    private Button btnQuickSort = new Button("Quick Sort");

    private Label lblTitle = new Label("Results (in seconds)");
	
    private Label lbl1000 = new Label("1000");
    private Label lbl10000 = new Label("10,000");
    private Label lbl100000 = new Label("100,000");
    private Label lbl1000000 = new Label("1,000,000");
    private Label lbl10000000 = new Label("10,000,000");

    private Label lblTime1000 = new Label();
    private Label lblTime10000 = new Label();
    private Label lblTime100000 = new Label();
    private Label lblTime1000000 = new Label();
    private Label lblTime10000000 = new Label();
    
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Set event handling
	    btnBubbleSort.setOnAction(this);
	    btnInsertionSort.setOnAction(this);
	    btnSelectionSort.setOnAction(this);
	    btnMergeSort.setOnAction(this);
	    btnQuickSort.setOnAction(this);
	    
	    // Organize the layout, add in the controls
	    VBox buttonsPane = new VBox(10, btnBubbleSort, btnInsertionSort, btnSelectionSort, btnMergeSort, btnQuickSort);

	    GridPane resultsPane = new GridPane();
	    resultsPane.add(lblTitle, 0, 0, 2, 1);
	    resultsPane.addRow(1, lbl1000, lblTime1000);
	    resultsPane.addRow(2, lbl10000, lblTime10000);
	    resultsPane.addRow(3, lbl100000, lblTime100000);
	    resultsPane.addRow(4, lbl1000000, lblTime1000000);
	    resultsPane.addRow(5, lbl10000000, lblTime10000000);
	    
	    HBox root = new HBox(50, buttonsPane, resultsPane);
	    
	    // Create the scene using our layout; then display it
	    Scene scene = new Scene(root);
	    
	    scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
	    
	    primaryStage.setTitle("Sorting Algorithm Tester");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		// Empty the previous results
		lblTime1000.setText("");
		lblTime10000.setText("");
		lblTime100000.setText("");
		lblTime1000000.setText("");
		lblTime10000000.setText("");
		
		Button btnClicked = (Button) event.getSource();
		String sortAlgorithm = "";
		boolean isEfficient = false; // Will be changed for O(n * log(n)) algorithms
		if (btnClicked == btnBubbleSort) {
			sortAlgorithm = "BubbleSort";
		} else if (btnClicked == btnInsertionSort) {
			sortAlgorithm = "InsertionSort";
		} else if (btnClicked == btnSelectionSort) {
			sortAlgorithm = "SelectionSort";
		} else if (btnClicked == btnMergeSort) {
			sortAlgorithm = "MergeSort";
			isEfficient = true;
		} else if (btnClicked == btnQuickSort) {
			sortAlgorithm = "QuickSort";
			isEfficient = true;
		}

		// Clear the old results
		lblTime1000.setText("");
		lblTime10000.setText("");
		lblTime100000.setText("");
		lblTime1000000.setText("");
		lblTime10000000.setText("");
		
		lblTitle.setText(sortAlgorithm + " (in seconds)");

		// Run the tests
		runTestLater(lblTime1000, sortAlgorithm, 1000);
		runTestLater(lblTime10000, sortAlgorithm, 10000);
		runTestLater(lblTime100000, sortAlgorithm, 100000);
		if (isEfficient) {
			runTestLater(lblTime1000000, sortAlgorithm, 1000000);
			runTestLater(lblTime10000000, sortAlgorithm, 10000000);
		} else {
			lblTime1000000.setText("not tested");
			lblTime10000000.setText("not tested");
		}
	}
	
	/**
	 * We place the test inside RunLater, so that the GUI updates
	 * between tests.
	 */
	private void runTestLater(Label lbl, String sortingAlgorithm, int dataSize) {
		Task<Void> test = new Task<Void>() { 
			@Override
			public Void call() throws Exception {
				String result = test(sortingAlgorithm, dataSize);
				Platform.runLater(() -> lbl.setText(result) );
				return null;
			}
		};
		Thread t = new Thread(test);
		t.start();
	}
	
	/**
	 * Test the names sorting algorithm with the given amount of data.
	 */
	private String test(String sortingAlgorithm, int dataSize) {
		final int REPITITIONS = 3;
		Random rand = new Random();
		int[] sortArray = new int[dataSize];

		long startTime = System.nanoTime();
		for (int rep = 1; rep <= REPITITIONS; rep++) {

			// Prep the array
			for (int i = 0; i < dataSize; i++) {
				sortArray[i] = rand.nextInt();
			}

			// This is advanced code - don't worry about how it works!
			// If you really want to know, look up "Java reflection"
			try {
				Class<SortingAlgorithms> clazz = SortingAlgorithms.class;
				Method sortMethod = clazz.getMethod(sortingAlgorithm, int[].class);
				sortMethod.invoke(null, sortArray);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Verify the sort
			for (int i = 0; i < dataSize - 1; i++) {
				if (sortArray[i] > sortArray[i + 1]) // Immediate abort!
					 return "Sorting failed!";
			}
		}
		long endTime = System.nanoTime();

		double iterationTime = (endTime - startTime) / (double) REPITITIONS;
		iterationTime = iterationTime / 1000000000.0;
		return String.format("%5.3e", iterationTime);
	}
}
