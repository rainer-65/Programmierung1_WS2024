package ch.fhnw.richards.week10_Arrays.sorting;

public class SortingAlgorithms {
	
	public static void BubbleSort(int[] sortArray) {
		boolean swapRequired;
		do {
			swapRequired = false;
			for (int i = 0; i < (sortArray.length - 1); i++) {
				if (sortArray[i+1] < sortArray[i]) {
					swap(sortArray, i, i+1);
					swapRequired = true;
				}
			}
		} while (swapRequired);
	}
	
	public static void SelectionSort(int[] sortArray) {
		// Exercise
	}
	
	public static void InsertionSort(int[] sortArray) {
		for (int i = 1; i < sortArray.length; i++) {
			int x = sortArray[i];
			int j = i-1;
			while (j >=0 && sortArray[j] > x) {
				sortArray[j+1] = sortArray[j];
				j--;
			}
			sortArray[j+1] = x;
		}
	}
	
	public static void MergeSort(int[] sortArray) {
		mergeSort(sortArray, 0, sortArray.length-1);
	}
	
	private static void mergeSort(int[] sortArray, int start, int end) {
		if (start == end) {
			// Nothing to do: list of 1 is already sorted!
		} else {
			int middle = (start + end) / 2;
			mergeSort(sortArray, start, middle);
			mergeSort(sortArray, middle+1, end);
			merge(sortArray, start, middle, end);
		}
	}
	
	private static void merge(int[] sortArray, int start, int middle, int end) {
		int c1 = start;
		int c2 = middle+1;
		int[] temp = new int[end+1-start];
		int c_temp = 0;
		while (c1 <= middle || c2 <= end) {
			if (c1 <= middle) {
				if (c2 <= end) {
					if (sortArray[c1] < sortArray[c2]) {
						temp[c_temp++] = sortArray[c1++];
					} else {
						temp[c_temp++] = sortArray[c2++];
					}
				} else { // copy rest from c1
					temp[c_temp++] = sortArray[c1++];
				}
			} else { // copy rest from c2
				temp[c_temp++] = sortArray[c2++];
			}
		}
		
		// Copy result back to sortArray
		for (int i = 0; i < temp.length; i++) {
			sortArray[start+i] = temp[i];
		}
	}
	
	public static void QuickSort(int[] sortArray) {
		quickSort(sortArray, 0, sortArray.length-1);
	}
	
	private static void quickSort(int[] sortArray, int start, int end) {
		// Exercise
	}
	
	private static void swap(int[] sortArray, int i, int j) {
		int temp = sortArray[i];
		sortArray[i] = sortArray[j];
		sortArray[j] = temp;
	}
}
