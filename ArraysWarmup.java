package testi1;
/*This program, ArraysWarmup, 
 * contains an array of six integers (17, 1, 2, 0, 2, 3). 
 * It iterates through the array elements and prints the values on a single line.*/

public class ArraysWarmup {
	public static void main(String[] args) {
		int[] a = { 17, 1, 2, 0, 2, 3 };
		for (int b = 0; b < a.length; b++) {
			System.out.print(a[b] + " ");
		}
	}
}
