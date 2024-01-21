package testi1;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationProgram {
	public static void main(String[] args) {
		/*
		 * Program Multiplication calculates and prints the product of two decimal
		 * numbers inputted by the user.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter x: ");
		BigDecimal b = new BigDecimal(scanner.nextLine().replace(',', '.'));

		System.out.print("Enter y: ");
		BigDecimal c = new BigDecimal(scanner.nextLine().replace(',', '.'));

		BigDecimal d = b.multiply(c);

		System.out.println();
		System.out.println(b + " * " + c + " = " + d);

		scanner.close();
	}
}
