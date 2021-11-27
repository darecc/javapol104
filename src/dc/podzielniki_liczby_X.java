package dc;

import java.util.Scanner;

/**
 * - Wypisać podzielniki (całkowite) liczby X. Suma podzielników liczby X
 */
public class podzielniki_liczby_X {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scan.nextInt();
        int suma=0;
        for(int i =1; i<=(x/2);i++) {
            if (x % i == 0) {
                System.out.println(i);
                suma=suma+i;
            }
        }
        System.out.println(suma);
    }
}
