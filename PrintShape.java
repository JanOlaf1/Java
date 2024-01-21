package testi1;

import java.util.Scanner;

public class PrintShape {
	public static void main(String[] args) {
		/*
		 * This program, PrintShape, takes the height and width of a shape from the user
		 * and prints the shape using asterisks (*) as illustrated in the example
		 * output.
		 */
		Scanner muoto = new Scanner(System.in);
		System.out.print("Enter width: ");
		int leveys = muoto.nextInt();

		System.out.print("Enter height: ");
		int pituus = muoto.nextInt();
		System.out.println();

		for (int i = 0; i < pituus; i++) {
			for (int j = 0; j < leveys; j++) {
				System.out.print("*");
			}
			System.out.println();
			muoto.close();
		}
	}
}
