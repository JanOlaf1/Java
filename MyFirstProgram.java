package testi1;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		/*
		 * In this code happens little bit too much of everything. Don't ask!!!! Due
		 * reason that i don't remember these are all in one tab. But Basically;
		 * 
		 * Program NumbersProgram prints integers between -1 and -20 using a for loop.
		 * 
		 * Program WelcomeProgram inputs a person's name, title, and a greeting phrase,
		 * then prints a greeting following the specified example output.
		 * 
		 * Program PersonProgram inputs age, given name, and profession, then prints the
		 * inputted data as specified in the example output.
		 * 
		 * Program SalesProgram inputs the price, product name, and discount from the
		 * user, then prints the selling price of the product based on the provided
		 * example output.
		 * 
		 * Program ArithmeticProgram inputs two integers and one decimal number from the
		 * user.
		 */

		System.out.println("This is my first Java Program:-)");
		NumbersProgram();
		WelcomeProgram();
		PersonProgram();
		SalesProgram();
		ArithmeticProgram();
	}

	public static void NumbersProgram() {
		for (int i = -1; i >= -20; i--)
			System.out.println(i);
	}

	public static void WelcomeProgram() {
		Scanner skanneri = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String nimi = skanneri.nextLine();

		System.out.println("Enter your title: ");
		String titteli = skanneri.nextLine();

		System.out.println("Enter Phrase: ");
		String lause = skanneri.nextLine();
		skanneri.close();

		System.out.println();
		System.out.println(lause + " " + titteli + " " + nimi);
	}

	public static void PersonProgram() {
		Scanner wendy = new Scanner(System.in);
		System.out.println("Enter age: ");

		String ika = wendy.nextLine();

		System.out.println("Enter given name: ");
		String nimi1 = wendy.nextLine();

		System.out.println("Enter profession: ");
		String ammatti = wendy.nextLine();
		wendy.close();

		System.out.println();
		System.out.println(nimi1 + " is a " + ammatti + " who is " + ika + " years of age.");
	}

	public static void SalesProgram() {
		Scanner myynti = new Scanner(System.in);
		System.out.println("Enter price: ");
		int hinta = Integer.parseInt(myynti.nextLine());

		System.out.println("Enter product name: ");
		String nimi2 = myynti.nextLine();

		System.out.println("Enter discount: ");
		int ale = Integer.parseInt(myynti.nextLine());

		int hinta1 = hinta - ale;

		System.out.println();
		System.out.println("The selling price of a " + nimi2 + " is " + hinta1 + " euros.");
		myynti.close();
	}

	public static void ArithmeticProgram() {
		Scanner desimaali = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integeri = Integer.parseInt(desimaali.nextLine());

		System.out.print("Enter another integer: ");
		int integeri2 = Integer.parseInt(desimaali.nextLine());

		System.out.print("Enter a decimal number: ");
		double desimaali1 = Double.parseDouble(desimaali.nextLine().replace(',', '.'));
		System.out.println();
		int tulos1 = integeri * integeri2;
		double tulos2 = integeri * desimaali1;
		double tulos3 = desimaali1 * desimaali1;
		System.out.println(integeri + " * " + integeri2 + " = " + tulos1);
		System.out.println(integeri + " * " + desimaali1 + " = " + tulos2);
		System.out.println(desimaali1 + " * " + desimaali1 + " = " + tulos3);
		desimaali.close();
	}
}
