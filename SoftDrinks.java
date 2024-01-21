package testi1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SoftDrinks {
	public static void main(String[] args) {
		/*
		 * Ohjelma Virvoitusjuomat kysyy opiskelijoiden ja virvoitusjuomapullojen
		 * lukumäärän, laskee pullojen määrän per opiskelija ja selvittää jääneet
		 * pullojen määrän. Jokainen opiskelija saa yhtä monta pulloa.
		 */
		Scanner syote = new Scanner(System.in);
		System.out.print("Syötä opiskelijoiden lukumäärä: ");
		int opiskelijoidenLkm = syote.nextInt();
		System.out.print("Syötä pullojen lukumäärä: ");
		int pullojenLkm = syote.nextInt();

		DecimalFormat nolla = new DecimalFormat("0");

		int pullojaPerOpiskelija = pullojenLkm / opiskelijoidenLkm;
		int jaaneetPullot = pullojenLkm % opiskelijoidenLkm;
		System.out.println();
		if (jaaneetPullot == 0) {
			System.out.println("Jokaiselle opiskelijalle riittää " + pullojaPerOpiskelija + " pulloa.");
			System.out.println("Yhtään jäänyttä pulloa ei ole.");
		} else {
			System.out.println("Jokaiselle opiskelijalle riittää " + pullojaPerOpiskelija + " pulloa.");
			System.out.println("Jääneitä pulloja on " + nolla.format(jaaneetPullot) + " kappaletta.");
		}
		syote.close();
	}
}
