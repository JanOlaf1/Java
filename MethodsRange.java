package testi1;

import java.util.Scanner;

public class MethodsRange {
	public static void main(String[] args) {
		/*
		 * This program, MethodsRange, features a method called printRange. The
		 * printRange method takes the first and last integers as parameters, printing
		 * all integers between them. The main method inputs the first and last integers
		 * from the user and calls printRange with the inputted values.
		 */
		Scanner skannneri = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int eka_arvo = Integer.parseInt(skannneri.nextLine());

		System.out.print("Enter last value: ");
		int vika_arvo = Integer.parseInt(skannneri.nextLine());

		skannneri.close();
		System.out.println();
		printRange(eka_arvo, vika_arvo);
	}

	public static void printRange(int d, int e) {
		for (int i = d; i <= e; i++) {

			System.out.print(i + " ");
		}
	}
}
