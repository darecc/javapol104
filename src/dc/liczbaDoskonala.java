package dc;

public class liczbaDoskonala {

    public static void main(String[] args) {
//       Zadanie 4 - Znajdowanie koljnej liczby doskonałej (suma podzielników równa liczbie, np. 6 = 1 + 2 + 3).

        int x = 29;


        do {
            int suma = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    suma = suma + i;
                }
            }
            if (suma == x) {
                System.out.println("Liczba " + x + " jest doskonała");
                return;
            }
            x++;
        } while (x < 2222);

    }
}