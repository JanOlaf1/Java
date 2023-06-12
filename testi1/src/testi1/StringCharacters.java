package testi1;
import java.util.Scanner;

public class StringCharacters {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String b = a.nextLine();
        
        int h = 0;
        int e = 0;
        int f = 0;
        
        for (char c : b.toCharArray()) {
            if (Character.isLetter(c)) {
                h++;
            } else if (Character.isDigit(c)) {
                e++;
            } else {
                f++;
            }
        }
        a.close();
        System.out.println(h + " letter(s)");
        System.out.println(e + " digit(s)");
        System.out.println(f + " other character(s)");
    }
}
