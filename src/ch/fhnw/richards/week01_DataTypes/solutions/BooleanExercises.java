package ch.fhnw.richards.week01_DataTypes.solutions;

public class BooleanExercises {

	public static void main(String[] args) {
		int i = 654;
		int j = -54;
		int k = 56;

		// j is not the smallest
		boolean j_not_smallest = (j >= i) || (j >= k);
		System.out.println("j not smallest: " + j_not_smallest);
		
		// k is between i and j
		boolean k_between = (k > i) && (k < j) || (k > j) && (k < i);
		System.out.println("k between i and j: " + k_between);
				
		// All three have the same value
		boolean all_equal = (i == j) && (i == k);
		System.out.println("all equal: " + all_equal);
		
		// At least two of the three are equal
		boolean twoOfThree = (i == j) || (i == k) || (j == k);
		System.out.println("two of three equal: " + twoOfThree);
	}

}
