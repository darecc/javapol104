package Java_programowanie_20211128;

import javax.swing.*;
import java.util.Scanner;

/*
 Wyświetlacz czasu składa się z 3 części: G (godziny), M (minuty) oraz S (sekundy).
 G = 0...23, M = 0...59, S = 0...59. Napisz program, który wczytuje G,M,S oraz p, gdzie p to przesunięcie czasowe w sekundach.
 Zadaniem programu jest wyliczyć i wyświetlić właściwy czas po przesunięciu o p sekund.
 Np. dla G = 7, M = 58 i S = 50, p = 135 program ma zwrócić G = 8, M = 1, S = 5.
 */
public class Czas {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Podaj godzinę: ");
        int g = S.nextInt();
        System.out.println("Podaj minutę: ");
        int m = S.nextInt();
        System.out.println("Podaj sekunde: ");
        int s = S.nextInt();
        System.out.println("podaj przesuniecie: ");
        int p = S.nextInt();
        s = p+s;
        if(s >= 60){
            m = m + (s/60);
            s = s % 60;
        }
        if(m >= 60){
            g = g + (m/60);
            m = m % 60;
        }
        if(g >=24){
            g = g%24;
        }
        System.out.println("czas po przesunięciu "+ g + ":" + m + ":" + s);
        JOptionPane.showMessageDialog(null,"czas po przesunięciu "+ g + ":" + m + ":" + s);

    }
}
