package testi1;

import java.util.Scanner;

public class MethodsTriplex {
	public static void main(String[] args) {
		/*
		 * MethodsTriplex, with a method called triplex that calculates the triplex of a
		 * positive integer. The main method prompts the user for a positive integer and
		 * prints all triplexes up to the inputted value, calling the triplex method for
		 * each calculation
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int positiivinen_luku = tutka.nextInt();
		tutka.close();

		for (int i = 1; i <= positiivinen_luku; i++) {
			int muuttuja = triplex(i);
			System.out.println("triplex(" + i + ") = " + muuttuja);
		}
	}

	public static int triplex(int triple) {
		if (triple == 1) {
			return 1;
		}

		int muuttuja = triple;
		for (int i = 1; i < triple; i += 3) {
			muuttuja *= i;
		}

		return muuttuja;
	}
}
