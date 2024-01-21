package testi1;

import java.util.*;
import java.time.*;

public class MethodsCalendar2 {
    public static void main(String args[]) {
        Scanner kalenteri_skanneri = new Scanner(System.kalenteri_skanneri);
        System.out.println("Syötä vuosi: ");
        int vuosi = kalenteri_skanneri.nextInt();
        System.out.println("Syötä kuukausi: ");
        int kuukausi = kalenteri_skanneri.nextInt();
        int a = 1;
        int b;

        YearMonth kuukauk = YearMonth.of(vuosi, kuukausi);
        int paivat = kuukauk.lengthOfMonth();

        String paivays = "";
                if (kuukausi < 10) {
                    paivays = String.valueOf(vuosi) + "-0" + String.valueOf(kuukausi) + "-01";
                }
                else {
                    paivays = String.valueOf(vuosi) + "-" + String.valueOf(kuukausi) + "-01";
                }
                
        LocalDate date = LocalDate.parse(paivays);

        DayOfWeek paiva = date.getDayOfWeek();

        int viikonpaiva = paiva.getValue();
        System.out.println();
        System.out.println("Ma Ti Ke To Pe La Su");
        Boolean jatkuu = true;


        while (jatkuu) {
            for (b = 1; b <= 7; b++) {
                if (a == paivat + 1) {
                    System.exit(0);
                }
                else if (a == 1 && b != viikonpaiva) {
                    System.out.print("  ");
                }
                else if (a == 1 && b == viikonpaiva) {
                    System.out.print(a + " ");
                    a += 1;
                }
                else if (a != 1 && b != 7) {
                    System.out.print(a + " ");
                    a += 1;
                }
                else if (b == 7) {
                    System.out.println(a);
                    a += 1;
                }

                if (a < 10 && b != 7) {
                    System.out.print(" ");
                }
            }
        }

    }
}