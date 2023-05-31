package testi1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SoftDrinks {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int b = a.nextInt();
        System.out.print("Enter the number of bottles: ");
        int c = a.nextInt();

        DecimalFormat nolla = new DecimalFormat("0");

        int tulos1 = c / b;
        int leftoverBottles = c % b;
System.out.println();
        if (leftoverBottles == 0) {
            System.out.println("There will be " + tulos1 + " bottles for each student.");
            System.out.println("There will be 0 leftover bottles.");
        } else {
            System.out.println("There will be " + tulos1 + " bottles for each student.");
            System.out.println("There will be " + nolla.format(leftoverBottles) + " leftover bottles.");
        }
        a.close();
    }
}
