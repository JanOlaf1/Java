package testi1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsCertificationProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Coach> coaches = new ArrayList<>();

        for (var i = 0; i < 4; i++) {
            System.out.println("Enter coach name: ");
            String nimi = scanner.nextLine();
            System.out.println("Enter " + nimi + "'s score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consuming the newline character
            coaches.add(new Coach(nimi, score));
        }

        System.out.println("Enter the minimum passing score: ");
        int minScore = scanner.nextInt();

        System.out.println("\nPassing scores");
        int passedScores = 0;

        for (Coach coach : coaches) {
            if (coach.getScore() >= minScore) {
                System.out.println(
                        coach.getName()
                                + " ("
                                + coach.getScore()
                                + " points)"
                );
                passedScores++;
            }
        }

        double passingRate = (double) passedScores / coaches.size() * 100;
        System.out.println("The passing rate is " + passingRate + " %");

        scanner.close();
    }

    public static class Coach {
        private String name;
        private int score;

        public Coach(final String name, final int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }
    }
}
