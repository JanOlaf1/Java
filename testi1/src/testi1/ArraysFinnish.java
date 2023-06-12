package testi1;
import java.util.Scanner;

public class ArraysFinnish {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter an English word: ");
        String b = a.nextLine();

        String[] esanat = {"bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher"};
        String[] fsanat = {"bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja"};

        boolean e = false;
        for (int i = 0; i < esanat.length; i++) {
            if (b.equalsIgnoreCase(esanat[i])) {
                System.out.println(fsanat[i]);
                e = true;
                break;
            }
        }

        if (!e) {
            System.out.println("Unknown word");
        }
        a.close();
    }
}
