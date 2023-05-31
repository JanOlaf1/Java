package testi1;
import java.util.Scanner;

public class MethodsRange {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter first value: ");
        int b = Integer.parseInt(a.nextLine());
        
        System.out.print("Enter last value: ");
        int c = Integer.parseInt(a.nextLine());
        
        a.close();
System.out.println();
        printRange(b, c);
    }

    public static void printRange(int d, int e) {
        for (int i = d; i <= e; i++) {
        
            System.out.print(i + " ");
        }
    }
}

