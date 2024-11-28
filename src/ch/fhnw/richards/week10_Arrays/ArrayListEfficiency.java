package ch.fhnw.richards.week10_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListEfficiency {

	public static void main(String[] args) {
		System.out.println("This is a simple program to compare efficiency of arrays and ArrayLists");
		System.out.println("Measurements are only approximate, but should give a general idea\n");
		
		final int[] dataSetSizes = { 100000, 200000, 500000, 1000000, 2000000, 5000000, 10000000 };

		for (int dataSetSize : dataSetSizes) {
			oneMeasurement(dataSetSize, Integer.class, Array.class);
			oneMeasurement(dataSetSize, Integer.class, ArrayList.class);
			oneMeasurement(dataSetSize, String.class, Array.class);
			oneMeasurement(dataSetSize, String.class, ArrayList.class);
		}
		
		System.out.println("--- Tests complete ---");
	}

	private static void oneMeasurement(int dataSetSize, Class<?> dataClass, Class<?> containerClass) {
		final int repetitions = 3;
		
		long totalTime = 0;
		long totalMemory = 0;
		Runtime rt = Runtime.getRuntime();
		int[] intTestArray;
		String[] strTestArray;
		ArrayList<Object> testArrayList;

		for (int rep = 0; rep < repetitions; rep++) {
			long startTime = System.currentTimeMillis();

			if (containerClass.equals(ArrayList.class)) {
				testArrayList = new ArrayList<>();
				for (int i = 0; i < dataSetSize; i++) {
					if (dataClass.equals(String.class))
						testArrayList.add(Integer.toHexString(i));
					else
						testArrayList.add(new Integer(i));
				}
			} else if (dataClass.equals(String.class)){
				strTestArray = new String[dataSetSize];
				for (int i = 0; i < dataSetSize; i++) {
					strTestArray[i] = Integer.toHexString(i);
				}				
			} else { // array of int
				intTestArray = new int[dataSetSize];
				for (int i = 0; i < dataSetSize; i++) {
					intTestArray[i] = i;
				}				
			}
			
			long endTime = System.currentTimeMillis();
			totalTime += (endTime - startTime);
			totalMemory += (rt.totalMemory() - rt.freeMemory());
	
			// Clean up memory for the next test
			intTestArray = null; strTestArray = null; testArrayList = null;
			rt.gc();
		}
		long averageTime = totalTime / repetitions;
		long averageMemory = totalMemory / ( 1024 * repetitions);
		
		System.out.print("Test ");
		System.out.print(containerClass.equals(ArrayList.class) ? "ArrayList" : "Arrays");
		System.out.print(" with " + dataSetSize + " elements of type ");
		System.out.println(dataClass.equals(String.class) ? "String" : containerClass.equals(ArrayList.class) ? "Integer" : "int");
		System.out.println("Memory usage: " + averageMemory + "KB");
		System.out.println("Running time: " + averageTime + "ms\n");
	}
	
}
