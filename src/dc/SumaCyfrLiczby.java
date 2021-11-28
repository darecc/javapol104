package dc;

import java.util.Scanner;

/**
 * Suma cyfr dla liczby X (np. X = 2021, suma cyfr = 2 + 0 + 2 + 1 = 5)
 */

public class SumaCyfrLiczby {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę mniejszą niż milion: ");
        Scanner S = new Scanner(System.in);
        int X = S.nextInt();

        int Podzielnik = 1_000_000;
        int SumaCyfr = 0;
        do {
            int CyfraLiczby = X / Podzielnik;
            SumaCyfr = SumaCyfr + CyfraLiczby;
            X = X - (Podzielnik * CyfraLiczby);
            Podzielnik = Podzielnik / 10;
        } while (Podzielnik > 0);
        System.out.println("Suma cyfr liczby " + X + " wynosi " + SumaCyfr);
    }
}
