package testi1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsDiscount {
	public static void main(String[] args) {
		/*
		 * This program, MethodsDiscount, contains a method called computePercentage.
		 * The computePercentage method takes list price and selling price as
		 * parameters, computes and returns the discount percentage. The main method
		 * inputs prices from the user and calls computePercentage, finally printing the
		 * discount percentage with two decimal places. The computePercentage method
		 * itself does not print anything.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter list price: ");
		double list_price = Double.parseDouble(scanner.nextLine().replace(',', '.'));

		DecimalFormat two_dec = new DecimalFormat("0.00");

		System.out.print("Enter selling price: ");
		double sell_price = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		System.out.println();

		double variable = computePercentage(list_price, sell_price);
		System.out.println("The discount percentage is " + two_dec.format(variable) + (" %"));
		scanner.close();
	}

	public static double computePercentage(double list_price, double sell_price) {
		double difference = list_price - sell_price;
		double variable = (difference / list_price) * 100;
		return variable;

	}
}
