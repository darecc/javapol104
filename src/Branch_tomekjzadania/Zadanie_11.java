package Branch_tomekjzadania;

import java.util.Scanner;

/**
 *11. John Smith zna przyszłość więc postanowił wykorzystać to znając ją. Ma do wyboru 3 strategie
 *     - W pierszym roku może pomnożyć zainwestowaną kwotę 100 razy i w każdym następnym roku o połowę mniej (50 razy, 25 razy, 12 razy, 6 razy, 3 razy, 1 raz,...)
 *     - W każdym kolejnym roku zainwestowana kwota rośnie o 2 razy
 *     - W pierwszym roku kwota rośnie o 10 % i w każdym następnym roku przyrost kwoty zwiększa się o 10 %.
 *      Podaj, która strategia jest najlepsza po N latach
 */

public class Zadanie_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę x z której ma być obliczony wynik ");
        int x = scanner.nextInt();
        System.out.println("Podaj zakres lat od 1-7");
        int period = scanner.nextInt();
        if(period>=1 && period<=7){
            System.out.println("Podałeś prawidłową liczbę lat");
        }
        else{
            System.out.println("Zły zakres lat. Program zostanie zakończony");
        }
        int x1=x;
        int x2=x;
        int x3=x;

        int period1=period;
        int period2=period;
        int period3=period;



        System.out.println();
        System.out.println("Strategia nr1.W pierszym roku może pomnożyć zainwestowaną kwotę 100 razy i w każdym następnym roku o połowę mniej\n" +
                "     *     (50 razy, 25 razy, 12 razy, 6 razy, 3 razy, 1 raz,...)");
        System.out.println();
        int mnożnikS1=100;
        System.out.println("Statystyka zmiany kwoty");
        System.out.println();
        for (int i=0;i<period1;i++){
            int wynik=0;
            wynik=x1*mnożnikS1;
            System.out.println("Zmiana kwot w poszczególnych latach");
            System.out.println(wynik);
            int zmniejszczenieMnożnika=mnożnikS1/2;
            mnożnikS1=zmniejszczenieMnożnika;
        }
        System.out.println();
        System.out.println("Strategia nr2.W każdym kolejnym roku zainwestowana kwota rośnie o 2 razy");
        System.out.println();
        System.out.println("Statystyka zmiany kwoty");
        System.out.println();
        for (int i=0;i<period2;i++){
            int wynik=0;
            wynik=x2*2;
            System.out.println("Zmiana kwot w poszczególnych latach");
            System.out.println(wynik);
            x2=wynik;
        }
        System.out.println();
        System.out.println("Strategia nr3.W pierwszym roku kwota rośnie o 10 % i w każdym następnym roku przyrost kwoty zwiększa się o 10 %.");
        System.out.println();
        System.out.println("Statystyka zmiany kwoty");
        System.out.println();
        double percent = 0.1;
        for (int i=0;i<period3;i++){
            double wynik = 0;
            wynik = x3 * percent;// obliczanie procentów
            double nowyWynik; //obliczone procenty
            nowyWynik = wynik + x3;
            System.out.println("Zmiana kwot w poszczególnych latach");
            System.out.println((int) nowyWynik);
            x3 = (int) nowyWynik;

        }
        System.out.println();
        System.out.println("--->Najabrdziej efektywna jest Strategia nr 2 <----");




    }
}
