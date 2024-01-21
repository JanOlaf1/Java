package testi1;

import java.util.Scanner;

public class err {
	/* Yksinkertainen ehtolauseke, jossa tarkistaan onko numero 1 tai muu numero. */
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna numero:");
		int tulos = tutka.nextInt();
		if (tulos == 1) {
			System.out.println(" oik luku");
		} else {
			System.err.println("Virhe");
		}
		;
		tutka.close();

	}
}
