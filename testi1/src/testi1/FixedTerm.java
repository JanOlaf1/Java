package testi1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FixedTerm {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter initial deposit: ");
        double b = Double.parseDouble(a.nextLine().replace(',', '.'));

        System.out.print("Enter time period in full years: ");
        double c = Double.parseDouble(a.nextLine().replace(',', '.'));

        System.out.print("Enter interest rate (%): ");
        double d = Double.parseDouble(a.nextLine().replace(',', '.'));

        System.out.print("Enter capital income tax rate (%): ");
        double e = Double.parseDouble(a.nextLine().replace(',', '.'));

        double f = b;
        double i = 0;
        DecimalFormat kaksi = new DecimalFormat("0.00");
        System.out.println();

        for (int h = 1; h <= c; h++) {
            double g = f * (d / 100);
            f += g;
            i += g;
            System.out.println("Year " + h + ": " + kaksi.format(i) + " | " + kaksi.format(f));
        }

        System.out.println();

        double m = f - b;
        double n = m - (m * (e / 100));
        double o = b + n;

        System.out.println("The interest after tax is " + kaksi.format(n));
        System.out.println("The remaining balance after tax is " + kaksi.format(o));

        a.close();
    }
}
