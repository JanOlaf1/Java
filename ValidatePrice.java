package testi1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ValidatePrice {
	public static void main(String[] args) {
		/*
		 * This program, ValidatePrice, inputs the product price before VAT from the
		 * user, computes, and prints the VAT inclusive price with two decimal places
		 * (assuming a 25% VAT rate). If the input cannot be converted to a double, it
		 * prints "Invalid price!"
		 */
		Scanner vero = new Scanner(System.in);
		System.out.print("Enter the price before VAT: ");

		try {
			Double hinta = Double.parseDouble(vero.nextLine().replace(',', '.'));
			DecimalFormat dos = new DecimalFormat("0.00");

			Double tulos = hinta * 0.25;
			Double tulos1 = hinta + tulos;
			System.out.println();
			System.out.print("The VAT inclusive price is " + dos.format(tulos1).replace('.', ','));
			System.out.println();
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println("Invalid price!");
		}

		vero.close();
	}
}
