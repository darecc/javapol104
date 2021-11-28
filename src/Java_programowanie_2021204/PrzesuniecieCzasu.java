package Java_programowanie_2021204;

import java.util.Scanner;

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
        System.out.println("czas po przesunięciu "+ czas);

    }
}
