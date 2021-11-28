package Java_programowanie_20211128;

import java.util.Scanner;

/**
 * 6. Mamy obliczyć n-ty wyraz ciągu wyrażonego
 * wzorem F(n) = F(n-1) + 2 * F(n-2) dla n parzystego
 * i F(n) = 2*F(n-1) + F(n-2) dla n nieparzystego.
 * Napisz funkcję wyliczającą F(n) nierekurencyjnie
 * i wersję rekurencyjną. Mamy też F(1) = 1, F(2) = 2
 */
public class N_ty_wyraz_ciagu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę do wyliczeń");
        int n = scan.nextInt();


            int wynik1 =2; //n-1
            int wynik2= 1; //n-2
            int wynik;
            for (int i=3;i<=n;i++){
                if (n % 2 == 0)
                    wynik=wynik1+2*wynik2;
                else {
                    wynik=2*wynik1+wynik2;
                }
                wynik2=wynik1;
                wynik1=wynik;
                System.out.println(i + "+" + wynik1);
            }

            System.out.println("Oto twój wynik " + wynik1);
        }

    }

