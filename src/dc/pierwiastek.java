package dc;

import java.util.Scanner;

/**
 * Obliczanie pierwiastka z liczby dodatniej przy uzyciu jedynie + - * oraz /
 */
public class pierwiastek {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner sk = new Scanner(System.in);
        double x = sk.nextDouble();
        double p = 0.5;
        double l = x /2;
        int kierunek = -1;
        double eps = 0.0001;
        double dist;
        do {
            if (l * l < x) {
                if (kierunek == -1)
                    p = p /2;
                l = l + p;
                kierunek = 1;
            }
            else {
                if (kierunek == 1)
                    p = p/2;
                l = l - p;
                kierunek = -1;
            }
            dist = Math.abs(x - l*l);

    } while (dist > eps);
        System.out.format("Pierwiastek = %.6f", l);
    }
}
