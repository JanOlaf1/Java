package testi1;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar {
	public static void main(String[] args) {
		/*
		 * MethodsCalendar, with a method printCalendar that prints a one-month calendar
		 * in Finnish based on user-inputted year and month.
		 */
		Scanner kalenteri = new Scanner(System.in);
		System.out.print("Enter year: ");
		int vuosi = Integer.parseInt(kalenteri.nextLine());

		System.out.print("Enter month: ");
		int kuukausi = Integer.parseInt(kalenteri.nextLine());
		System.out.println();

		kalenteri.close();

		printCalendar(vuosi, kuukausi);
	}

	public static void printCalendar(int vuosi, int kuukausi) {
		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };
		if (kuukausi >= 1 && kuukausi <= 12) {
			String d = months[kuukausi - 1];

			System.out.println(" > " + d + " " + vuosi + " < ");
		}

		LocalDate myDate = LocalDate.of(vuosi, kuukausi, 1);
		System.out.println(" Ma Ti Ke To Pe La Su");

		int dayOfWeek = myDate.getDayOfWeek().getValue();

		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("   ");
		}

		int daysInMonth = myDate.lengthOfMonth();
		for (int day = 1; day <= daysInMonth; day++) {
			System.out.printf("%3d", day);

			if (dayOfWeek == 7) {
				System.out.println();
				dayOfWeek = 1;
			} else {
				dayOfWeek++;
			}
		}
		System.out.println();
	}
}
