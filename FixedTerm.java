import java.util.Scanner;
import java.text.DecimalFormat;

public class FixedTerm {
	public static void main(String[] args) {
		/*
		 * This program, FixedTerm, computes interest for an initial deposit in a
		 * fixed-term savings account. It takes input for the initial deposit, number of
		 * years, interest rate, and capital income tax rate, then calculates and
		 * displays compound interest and the balance at the end of each year. Finally,
		 * it shows the interest after tax and the remaining balance after tax.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		double initialDeposit = Double.parseDouble(scanner.nextLine().replace(',', '.'));

		System.out.print("Enter time period in full years: ");
		double numberOfYears = Double.parseDouble(scanner.nextLine().replace(',', '.'));

		System.out.print("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(scanner.nextLine().replace(',', '.'));

		System.out.print("Enter capital income tax rate (%): ");
		double taxRate = Double.parseDouble(scanner.nextLine().replace(',', '.'));

		double balance = initialDeposit;
		double totalInterest = 0;
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		System.out.println();

		for (int year = 1; year <= numberOfYears; year++) {
			double interest = balance * (interestRate / 100);
			balance += interest;
			totalInterest += interest;
			System.out.println("Year " + year + ": " + decimalFormat.format(totalInterest) + " | "
					+ decimalFormat.format(balance));
		}

		System.out.println();

		double interestAfterTax = totalInterest - (totalInterest * (taxRate / 100));
		double remainingBalanceAfterTax = initialDeposit + interestAfterTax;

		System.out.println("The interest after tax is " + decimalFormat.format(interestAfterTax));
		System.out.println("The remaining balance after tax is " + decimalFormat.format(remainingBalanceAfterTax));

		scanner.close();
	}
}
