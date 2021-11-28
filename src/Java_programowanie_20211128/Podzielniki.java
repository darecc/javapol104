package Java_programowanie_20211128;

import java.util.Scanner;

/**
 * Dla każdej liczby z przedzialu od 1 do n znajdz wszystkie liczby o takiej samej sumie podzielników calkowitych.
 */
public class Podzielniki {
    /**
     * zdefiniowanie metody obliczajacej sume podzielnikow
      * @param liczba liczba, dla której obliczamy podzielniki
     * @return suma podzielnikow
     */
    public static int SumaPodzielnikow(int liczba){
        int suma=0;
        for(int i =1; i<=(liczba/2);i++) {
            if (liczba % i == 0) {
                suma=suma+i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int n = S.nextInt();
        if(n<3) {
            System.out.println("Rozmiar tablicy musi być większy niz 2");
            return;
        }
        int[] ciag = new int[n];
        // obliczenie podzielników dla wszystkich liczb od 1 do n
        for (int i = 1; i < n-1; i++) {
            ciag[i]=SumaPodzielnikow(i);
        }
        //porównanie
        for (int i = 1; i < n-1; i++) {
            for (int j = i +1; j < n; j++) {
                if ( ciag[i] == ciag[j] ) {
                    System.out.println(i + " >=< " + j);
                }
            }
        }

    }
}
