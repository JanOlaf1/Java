package testi1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FixedTerm1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter initial deposit: ");
        double b = Double.parseDouble(a.nextLine().replace(',', '.'));

        System.out.print("Enter time period in full years: ");
        int c = Integer.parseInt(a.nextLine());

        System.out.print("Enter interest rate (%): ");
        double d = Double.parseDouble(a.nextLine().replace(',', '.'));

        System.out.print("Enter capital income tax rate (%): ");
        double e = Double.parseDouble(a.nextLine().replace(',', '.'));

        DecimalFormat kaksi = new DecimalFormat("0.00");
        System.out.println();

        double f = b;

        for (int h = 1; h <= c; h++) {
            double g = f * (d / 100);
            f += g;

            System.out.println("Year " + h + ": " + kaksi.format(g) + " | " + kaksi.format(f));
        }

        System.out.println();

        double i = f - b;
        System.out.println("The interest after tax is " + kaksi.format(i));

        double j = f - (i * (1 - e / 100));
        System.out.println("The remaining balance after tax is " + kaksi.format(j));

        a.close();
    }
}
