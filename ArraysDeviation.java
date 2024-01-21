package testi1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDeviation {
	/*
	 * This program, ArraysDeviation, uses a class called ArraysLibrary for generic
	 * methods like max, min, median, mean, and standardDeviation, applied to arrays
	 * of integers. The main method prompts the user for a sample size, inputs
	 * values, calculates and displays descriptive statistics. Check the example
	 * output for details.
	 */
	public static void main(String[] args) {
		Scanner numerot = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int annettu_numero = numerot.nextInt();

		if (annettu_numero < 4) {
			System.out.println("Sorry, at least 4 values required.");
			numerot.close();
			return;
		}

		int[] taulukko = new int[annettu_numero];
		double o = 0;
		for (int c = 0; c < annettu_numero; c++) {
			System.out.print("Enter an integer: ");
			int e = numerot.nextInt();
			o += e;
			taulukko[c] = e;
		}

		Arrays.sort(taulukko);
		DecimalFormat unocomprende = new DecimalFormat("0.0");
		double minimi = ArraysLibrary.min(taulukko);
		double maksimi = ArraysLibrary.max(taulukko);
		double keskiarvo = ArraysLibrary.mean(taulukko);
		double median = ArraysLibrary.median(taulukko);
		double standardDeviation = ArraysLibrary.standardDeviation(taulukko);

		System.out.println();
		System.out.println("n = " + annettu_numero);
		System.out.println("Min: " + minimi);
		System.out.println("Max: " + maksimi);
		System.out.println("Mean: " + unocomprende.format(keskiarvo));
		System.out.println("Median: " + unocomprende.format(median));
		System.out.println("Sample standard deviation: " + unocomprende.format(standardDeviation));
		System.out.print("Sample data: ");
		for (int i = 0; i < annettu_numero; i++) {
			System.out.print(taulukko[i] + " ");
		}
		numerot.close();
	}
}
