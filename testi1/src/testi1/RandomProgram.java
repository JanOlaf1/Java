package testi1;
import java.util.Random;
import java.util.Scanner;

public class RandomProgram {
    static Random randomizer = new Random(); // Do NOT change this line of code!

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = randomizer.nextInt(100); // Do NOT change this line of code!

        System.out.print("Guess a number (0-99): ");
        int arvaus = Integer.parseInt(input.nextLine());

        while (true) {
            if (arvaus > number) {
                System.out.println("The correct number is smaller!");
                System.out.println();
                System.out.print("Guess again: ");
                arvaus = Integer.parseInt(input.nextLine());
            } else if (arvaus < number) {
                System.out.println("The correct number is larger!");
                System.out.println();
                System.out.print("Guess again: ");
                arvaus = Integer.parseInt(input.nextLine());
            } else {
                System.out.println("Correct!");
                break;
            }
        }
        input.close();
    }
}
