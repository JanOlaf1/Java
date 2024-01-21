package testi1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {
	public static void main(String[] args) {
		/*
		 * Program PopulationProgram inputs the population of three areas, calculates
		 * the percentage of each area, and displays the results with one decimal place.
		 */
		Scanner vakiluku = new Scanner(System.in);
		System.out.print("Enter the population of the area A: ");
		double vakiluku1 = Double.parseDouble(vakiluku.nextLine().replace(',', '.'));

		System.out.print("Enter the population of the area B: ");
		double vakiluku2 = Double.parseDouble(vakiluku.nextLine().replace(',', '.'));

		System.out.print("Enter the population of the area C: ");
		double vakiluku3 = Double.parseDouble(vakiluku.nextLine().replace(',', '.'));
		double tulos1 = vakiluku1 + vakiluku2 + vakiluku3;
		double tulos2 = (vakiluku1 / tulos1) * 100;
		double tulos3 = (vakiluku2 / tulos1) * 100;
		double tulos4 = (vakiluku3 / tulos1) * 100;
		vakiluku.close();
		DecimalFormat yksi = new DecimalFormat("0.0");
		System.out.println();
		System.out.println("A: " + yksi.format(tulos2) + " %");
		System.out.println("B: " + yksi.format(tulos3) + " %");
		System.out.println("C: " + yksi.format(tulos4) + " %");

	}
}
