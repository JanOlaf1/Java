package testi1;

public class ArraysMatrix {
	public static void main(String[] args) {
		/*
		 * This program, ArraysMatrix, includes a main method that utilizes the
		 * printMatrixSum method. The printMatrixSum method prints the sum of two
		 * matrices, handling two-dimensional arrays.
		 */

		int[][] m1 = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] m2 = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] m3 = { { 1, 1, 1, 1 }, { 3, 2, 3, 1 }, { 2, 2, 2, 2 } };
		int[][] m4 = { { 2, 2, 3, 3 }, { 2, 3, 1, 0 }, { 1, 2, 3, 4 } };
		printMatrixSum(m1, m2);
		System.out.println();
		printMatrixSum(m3, m4);
	}

	public static void printMatrixSum(int[][] matrix1, int[][] matrix2) {
		int a = matrix1.length;
		int b = matrix1[0].length;

		if (a != matrix2.length || b != matrix2[0].length) {
			System.out.println("Matrices must have the same dimensions.");
			return;
		}

		int[][] c = new int[a][b];

		// Compute the sum of matrices
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				c[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Print the result
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
