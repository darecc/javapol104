package Java_programowanie_2021204;

import java.util.Random;
import java.util.Scanner;

/**12. Dana jest tablica kwadratowa o rozmiarze n. Wczytaj pozycję okrętu (x, y). Wylosuj punkt startowy
 (pierwszy strzał) i staraj się znaleźć okręt. Po każdym strzale echosonda zwraca odległość od okrętu
 (pierwiastek kwadratowy z sumy kwadratów odległości x i y strzału od okrętu). Spróbuj opracować technikę
 zbliżania się do okrętu.
 *
 */

public class Okret {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy kwadratowej: ");
        int n =  scan.nextInt();

        int[][] morze = new int[n][n];

        Random losowa = new Random();
        int x = losowa.nextInt(n);
        int y = losowa.nextInt(n);

        morze [x][y] = 1;

        boolean trafienie = false;
        do {
            System.out.println("Podaj x: ");
            int uX = scan.nextInt();
            System.out.println("Podaj y: ");
            int uY = scan.nextInt();

            double odleglosc = Math.sqrt((uX-x)*(uX-x)+(uY-y)*(uY-y));
            if (odleglosc == 0){
                trafienie = true;
            } else {
                System.out.println("Odległość okrętu wynosi: " + odleglosc);
            }

        } while (trafienie == false);

        System.out.println("Gratulacje!");

    }
}
