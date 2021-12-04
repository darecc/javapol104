package Java_programowanie_2021204;

/**
 * Zaimplementuj klasę PrimeFinder pozwalającą na proste wyznaczanie liczb pierwszych.
 * Klasa powinna posiadać następującą funkcjonalność:
 * - sprawdzanie, czy zadana liczba N jest liczbą pierwszą (metoda prywatna),
 * - wskazanie najmniejszej liczby pierwszej większej od zadanej liczby N
 *  (metoda publiczna).
 * - wypisanie wszystkich liczb pierwszych mniejszych od N (metoda publiczna)
 */

public class PrimeFinder {
    boolean checkIfPrime(int n) {
        if(n%2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i = i+2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * funkcja znajduje kolejna najblizsza liczba pierwsza wieksza lub rowna n
     * @param n
     * @return
     */
    int FindNextPrime(int n) {
        if (checkIfPrime(n)==true)
            return n;
        do {n++;
        } while (checkIfPrime(n)==false);
        return n;
    }

    /**
     * funkcja znajduje kolejna najblizsza liczba pierwsza mniejsza lub rowna n
     * @param n
     * @return
     */
    int FindPreviousPrime(int n) {
        if (checkIfPrime(n)==true)
            return n;
        do {n--;
        } while (checkIfPrime(n)==false);
        return n;
    }
    public static void main(String[] args) {
        PrimeFinder P = new PrimeFinder();
        boolean czyPierwsza = P.checkIfPrime(1257);
        System.out.println("Sprawdzana liczba jest liczba pierwsza " + czyPierwsza);

        int m = P.FindNextPrime(1257);
        System.out.println("Kolejna najblizsza liczba pierwsza to " + m);

        for (int i = 100_000; i < 1_000_000; i += 100_000) {
            System.out.println("Liczba pierwsza wieksza:  " + P.FindNextPrime(i));
            System.out.println("Liczba pierwsza mniejsza: " + P.FindPreviousPrime(i));
        }
    }

}
