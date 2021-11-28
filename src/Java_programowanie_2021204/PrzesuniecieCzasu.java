package Java_programowanie_2021204;

import java.util.Scanner;

/**
 * Wyświetlacz czasu składa się z 3 części: G (godziny), M (minuty) oraz S (sekundy).
 * G = 0...23, M = 0...59, S = 0...59.
 * Napisz program, który wczytuje G,M,S oraz p, gdzie p to przesunięcie czasowe w sekundach.
 * Zadaniem programu jest wyliczyć i wyświetlić właściwy czas po przesunięciu o p sekund.
 * Np. dla G = 7, M = 58 i S = 50, p = 135 program ma zwrócić G = 8, M = 1, S = 5.
 */
public class PrzesuniecieCzasu {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Podaj godzinę: ");
        int g = S.nextInt();
        System.out.println("Podaj minutę: ");
        int m = S.nextInt();
        System.out.println("Podaj sekundę: ");
        int s = S.nextInt();
        System.out.println("podaj przesuniecie: ");
        int p = S.nextInt();
        // korzystamy z klasy Time
        Time czas = new Time(g,m,s);
        czas.shift(p);
        System.out.println("Czas po przesunięciu "+ czas);

    }
}
