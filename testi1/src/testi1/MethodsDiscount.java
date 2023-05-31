package testi1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MethodsDiscount {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter list price: ");
        double b = Double.parseDouble(a.nextLine().replace(',', '.'));

        DecimalFormat kaksi = new DecimalFormat("0.00");
        
        System.out.print("Enter selling price: ");
        double c = Double.parseDouble(a.nextLine().replace(',', '.'));
System.out.println();

        double d = computePercentage(b, c);
        System.out.println("The discount percentage is " + kaksi.format(d) + (" %"));
        a.close();
    }

    public static double computePercentage(double b, double c) {
        double e = b - c;
        double d = (e / b) * 100;
        return d;
        
    }
}
