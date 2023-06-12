package testi1;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] b = new int[5];
        for (int c = 0; c < b.length; c++) {
            System.out.print("Enter an integer: ");
            b[c] = a.nextInt();
        }
        Arrays.sort(b);

        for (int c = 0; c < b.length / 2; c++) {
            int temp = b[c];
            b[c] = b[b.length - 1 - c];
            b[b.length - 1 - c] = temp;
        }

        for (int c = 0; c < b.length; c++) {
            System.out.println(b[c]);
        }
        a.close();
    }
}
