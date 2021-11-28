package Java_programowanie_20211128;

import java.util.Scanner;

/**
 * Wczytaj liczbę rzeczywistą W (liczba większa od zera i mniejsza od 1).
 * Znajdź ułamek o mianowniku mniejszym od 100 000, który jest najmniej odległy od W.
 */
public class UlamekBliskiLiczbie {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę rzeczywistą > 0 i < 1: ");
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double min = 1;
        double min_l = 1; // szukany licznik
        double min_m = 2; // szukany mianownik

        double licznik = 1, mianownik =2;
        do{
            double ulamek = licznik / mianownik;
            double odstep = Math.abs(w - ulamek);
            if(odstep < min) {
                min = odstep;
                min_l = licznik;
                min_m = mianownik;
            }
           if(ulamek > w) {
               mianownik++;
           } else {
               licznik++;
               mianownik++;
           }
        }
        while(mianownik <= 100_000);
        System.out.println("Szukany ulamek to: " + (int)min_l + "/" + (int)min_m + " = " + min_l/min_m);
    }
}
