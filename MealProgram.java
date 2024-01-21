package testi1;

import java.text.DecimalFormat;

import java.util.Scanner;

public class MealProgram {
	public static void main(String[] args) {
		/*
		 * Program MealProgram calculates the total cost of a meal at a restaurant. It
		 * takes user input for the cost of food, tax rate, and tip percentage (before
		 * tax), then calculates and prints the total meal cost.
		 */
		Scanner ruoka = new Scanner(System.in);

		System.out.print("Enter the price of food: ");
		double hinta1 = Double.parseDouble(ruoka.nextLine().replace(',', '.'));
		DecimalFormat kaksidessia = new DecimalFormat("0.00");

		System.out.print("Enter the tax rate: ");
		double vero = Double.parseDouble(ruoka.nextLine().replace(',', '.'));

		System.out.print("Enter the tip percentage: ");
		double prossa = Double.parseDouble(ruoka.nextLine().replace(',', '.'));
		System.out.println();

		double tulos1 = hinta1 * (vero / 100);
		double tulos2 = hinta1 * (prossa / 100);
		double tulos3 = hinta1 + tulos1 + tulos2;

		System.out.println("The total cost is " + kaksidessia.format(tulos3));
		ruoka.close();
	}
}
