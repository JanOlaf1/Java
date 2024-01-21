package testi1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTravel {
	public static void main(String[] args) {
		/*
		 * Program TrainTravel inputs the number of train trips per month, the price of
		 * a single ticket, and the cost of a monthly season ticket. It then determines
		 * the cheaper option and calculates the cost difference.
		 */

		DecimalFormat kaksi = new DecimalFormat("0.00");

		Scanner lippu = new Scanner(System.in);

		System.out.print("Enter the number of train trips: ");
		double matkamaara = Double.parseDouble(lippu.nextLine().replace(',', '.'));

		System.out.print("Enter the single ticket price: ");
		double hinta = Double.parseDouble(lippu.nextLine().replace(',', '.'));

		System.out.print("Enter the monthly season ticket price: ");
		double kausi = Double.parseDouble(lippu.nextLine().replace(',', '.'));

		System.out.println();
		double tulos = hinta * matkamaara;
		double tulos1 = kausi - tulos;
		double tulos2 = tulos - kausi;

		if (tulos > kausi) {
			System.out.print("Buying a monthly season ticket is " + kaksi.format(tulos2) + " euros cheaper.");
		} else if (tulos < kausi) {
			System.out.println("Buying single tickets is " + kaksi.format(tulos1) + " euros cheaper.");
		} else {
			System.out.print("The total cost is the same.");
			lippu.close();
		}
	}
}
