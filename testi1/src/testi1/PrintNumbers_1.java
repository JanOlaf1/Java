package testi1;
import java.util.Scanner;

public class PrintNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the middle number: ");
        double b = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        for (int c = 1; c <= b; c++) {
            System.out.println(c);
        }
        
        for (int d = (int) b - 1; d >= 1; d--) {
            System.out.println(d);
        }

        scanner.close();
    }
}
