package testi1;

import java.util.Scanner;

public class PrintNumbers_1 {
	public static void main(String[] args) {
		/*
		 * This program, PrintNumbers_1, takes an integer input from the user and prints
		 * integers on a single line as shown in the example output. If there are no
		 * integers to be printed, the program does not output anything.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the middle number: ");
		double middle = Double.parseDouble(scanner.nextLine().replace(',', '.'));

		for (int c = 1; c <= middle; c++) {
			System.out.println(c);
		}

		for (int d = (int) middle - 1; d >= 1; d--) {
			System.out.println(d);
		}

		scanner.close();
	}
}
