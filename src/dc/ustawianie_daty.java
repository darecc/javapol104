package dc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

/**
 * - Znając dzisiejsze dane (d, m, r) i dzień tygodnia trzeba dowiedzieć się jaki dzień będzie za n dni
 * - Oblicza odległość pomiędzy dwoma datami za pomocą Period
 */

public class ustawianie_daty {
    public static void main(String[] args) {

        Scanner scanDaty = new Scanner(System.in);
        System.out.println("Podaj liczbę dni do dodania");
        int liczbaDni = scanDaty.nextInt();
        System.out.println("Tyle dni zostanie dodanych do twojej daty " + liczbaDni);

        LocalDate nowaData = LocalDate.now().plusDays(liczbaDni);

        System.out.println("Twoja nowa data  " + nowaData);

        System.out.println("Kiedy się urodziłeś/łaś");
        String urodzenie = scanDaty.next();
        LocalDate d1 = LocalDate.parse(urodzenie);

        System.out.println("Kiedy się pierwszy raz pocałowałeś z dziewczyną?");
        String kiss = scanDaty.next();
        LocalDate d2 = LocalDate.parse(kiss);

        Period period = Period.between(d1,d2);
        System.out.format("Liczba lat to %d, a liczba miesięcy to %d, a liczba " +
                "dni to %d ",period.getYears(), period.getMonths(), period.getDays());

    }
}
