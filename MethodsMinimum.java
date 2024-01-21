package testi1;

import java.util.Scanner;

public class MethodsMinimum {
	public static void main(String[] args) {
		/*
		 * This program, MethodsMinimum, includes a method called minimum, which takes
		 * three integers as parameters and returns the smallest of the three. The main
		 * method inputs three integers from the user, calls the minimum method, and
		 * prints the value returned by the minimum method. The minimum method itself
		 * does not print anything.
		 */
		Scanner skanneri = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int eka_muuttuja = Integer.parseInt(skanneri.nextLine());

		System.out.print("Enter second integer: ");
		int toka_muuttuja = Integer.parseInt(skanneri.nextLine());

		System.out.print("Enter third integer: ");
		int kolmas_muuttuja = Integer.parseInt(skanneri.nextLine());

		System.out.println();

		int minimi = minimum(eka_muuttuja, toka_muuttuja, kolmas_muuttuja);
		System.out.println("The minimum value is " + minimi);

		skanneri.close();
	}

	public static int minimum(int eka_muuttuja, int toka_muuttuja, int kolmas_muuttuja) {
		int minimi = Math.min(eka_muuttuja, Math.min(toka_muuttuja, kolmas_muuttuja));
		return minimi;
	}
}
