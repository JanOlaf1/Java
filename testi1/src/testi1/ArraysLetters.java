package testi1;
import java.util.Scanner;

public class ArraysLetters {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char[] b = {'A', 'A', 'B', 'A', 'C', 'B', 'C', 'F', 'B', 'B', 'B', 'A', 'C', 'C', 'C'};
        System.out.println("Enter letter: ");
        char c = a.next().charAt(0);

        int d = 0;
        for (char letter : b) {
            if (letter == c) {
                d++;
            }
        }

        double e = (double) d / b.length * 100;
        String f = String.format("%.1f%%", e);
        System.out.println(f);
        a.close();
    }
}
