package testi1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BeachVolleyball {
	public static void main(String[] args) {
		/*
		 * Program BeachVolleyball calculates the expenses for a group renting a beach
		 * volleyball court. It inputs the number of people, hourly court rate, and
		 * rental duration in full hours, then calculates the individual contribution
		 * and displays the total with two decimals.
		 */
		Scanner pallo = new Scanner(System.in);

		System.out.print("Enter the number of people: ");
		int ihmiset = Integer.parseInt(pallo.nextLine());

		System.out.print("Enter the hourly rate: ");
		double palkka = Double.parseDouble(pallo.nextLine().replace(',', '.'));

		System.out.print("Enter the length of the rental (hours): ");
		double aika = Double.parseDouble(pallo.nextLine().replace(',', '.'));
		System.out.println();

		DecimalFormat dosTresQuotros = new DecimalFormat("0.00");

		double tulos = palkka * aika;
		double tulos1 = tulos / ihmiset;
		System.out.print("Each of the " + ihmiset + " people should pay " + dosTresQuotros.format(tulos1) + " euros.");
		pallo.close();
	}
}
