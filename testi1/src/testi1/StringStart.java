package testi1;
import java.util.Scanner;

public class StringStart {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String b = a.nextLine();
        
        String c = b.toUpperCase();
        String d = b.toLowerCase();
        int f = b.length();
        System.out.println();
        System.out.println(d);
        System.out.println(c);
        System.out.println(f + " characters");
        a.close();
    }
}
