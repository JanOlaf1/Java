package testi1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PositiveNumbers {
	public static void main(String[] args) {
		/*
		 * This program, PositiveNumbers, takes integers from the user until the user
		 * enters zero to quit. It then computes and prints the average of the entered
		 * positive integers with two decimal places. If the only entered value is zero,
		 * the program prints "No positive values."
		 */
		DecimalFormat yksjapuol = new DecimalFormat("0.0");
		Scanner arvo = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int arvo1 = arvo.nextInt();

		int arvo2 = 0;
		int arvo3 = 0;

		while (arvo1 != 0) {
			if (arvo1 > 0) {
				arvo2 += arvo1;
				arvo3++;
			}
			System.out.print(" Enter next integer: ");
			arvo1 = arvo.nextInt();
		}
		if (arvo3 > 0) {
			double keski = (double) arvo2 / arvo3;
			System.out.println("The average of the positive values is " + yksjapuol.format(keski));
		} else {
			System.out.println("No positive values");
		}
		arvo.close();
	}
}
