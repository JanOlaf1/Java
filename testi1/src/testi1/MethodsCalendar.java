package testi1;
import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter year: ");
        int b = Integer.parseInt(a.nextLine());

        System.out.print("Enter month: ");
        int c = Integer.parseInt(a.nextLine());
        System.out.println();

        a.close();

        printCalendar(b, c);
    }

    public static void printCalendar(int b, int c) {
        String[] months = {"Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu",
                "Kesäkuu", "Heinäkuu", "Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu"};
        if (c >= 1 && c <= 12) {
            String d = months[c - 1];

            System.out.println(" > " + d + " " + b + " < ");
        }

        LocalDate myDate = LocalDate.of(b, c, 1);
        System.out.println(" Ma   Ti   Ke   To   Pe   La   Su");

        int dayOfWeek = myDate.getDayOfWeek().getValue();
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("     ");
        }

        int daysInMonth = myDate.lengthOfMonth();
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);

            if (dayOfWeek == 7) {
                System.out.println();
                dayOfWeek = 1;
            } else {
                dayOfWeek++;
            }
        }
        System.out.println();
    }
}
