package testi1;

import java.util.Scanner;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ArraysLibrary {
	public static void main(String[] args) {
		/*
		 * /* ArraysLibrary program calculates descriptive statistics for an array of
		 * integers. It prompts the user to input the number of values, takes integer
		 * inputs, calculates minimum, maximum, mean, median, and sample standard
		 * deviation, and prints the results along with the sample data.
		 */
		Scanner numerot = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int annettu_numero = numerot.nextInt();

		if (annettu_numero < 4) {
			System.out.println("Sorry, at least 4 values required.");
			numerot.close();
			return;
		}

		int[] taulukko = new int[annettu_numero];
		double muuttuja = 0;
		for (int c = 0; c < annettu_numero; c++) {
			System.out.print("Enter an integer: ");
			int integeri = numerot.nextInt();
			muuttuja += integeri;
			taulukko[c] = integeri;
		}

		Arrays.sort(taulukko);
		DecimalFormat unocomprende = new DecimalFormat("0.0");
		int minimi = min(taulukko);
		int maksimi = max(taulukko);
		double keski = muuttuja / annettu_numero;
		double median = median(taulukko);
		double standardDeviation = standardDeviation(taulukko);

		System.out.println();
		System.out.println("n = " + annettu_numero);
		System.out.println("Min: " + minimi);
		System.out.println("Max: " + maksimi);
		System.out.println("Mean: " + unocomprende.format(keski));
		System.out.println("Median: " + unocomprende.format(median));
		System.out.println("Sample standard deviation: " + unocomprende.format(standardDeviation));
		System.out.print("Sample data: ");
		for (int i = 0; i < annettu_numero; i++) {
			System.out.print(taulukko[i] + " ");
		}
		numerot.close();
	}

	public static int min(int[] g) {
		int minimi = g[0];
		for (int i = 1; i < g.length; i++) {
			if (g[i] < minimi) {
				minimi = g[i];
			}
		}
		return minimi;
	}

	public static int max(int[] h) {
		int maksimi = h[0];
		for (int i = 1; i < h.length; i++) {
			if (h[i] > maksimi) {
				maksimi = h[i];
			}
		}
		return maksimi;
	}

	public static double median(int[] z) {
		int length = z.length;
		if (length % 2 == 0) {
			return (z[length / 2] + z[length / 2 - 1]) / 2.0;
		} else {
			return z[length / 2];
		}
	}

	public static double standardDeviation(int[] z) {
		double y = mean(z);
		double r = 0;
		for (int i = 0; i < z.length; i++) {
			double vali_aik = z[i] - y;
			r += vali_aik * vali_aik;
		}
		return Math.sqrt(r / (z.length - 1));
	}

	public static double mean(int[] z) {
		double sum = 0;
		for (int i = 0; i < z.length; i++) {
			sum += z[i];
		}
		return sum / z.length;
	}
}
