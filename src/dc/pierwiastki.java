package dc;

import java.util.Scanner;

public class pierwiastki {
    public static void main(String[] args) {
        //- Pierwiastki równania kwadratowego y = ax2 + bx + c
        Scanner s = new Scanner(System.in);
        double a, b, c;
        double d;
        double r1, r2, r3;

        System.out.println("Podaj a");
        a = s.nextDouble();
        System.out.println("Podaj b");
        b = s.nextDouble();
        System.out.println("Podaj c");
        c = s.nextDouble();

        d = (b * b) - 4 * a * c;

        if (d < 0) {
            System.out.println("Brak pierwiastków");
        }
        else if (d > 0){

            r1 = (-b - Math.sqrt(d)) / (2 * a);
            r2 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println("x1 wynosi : " + r1);
            System.out.println("x2 wynosi : " + r2);

        }
        else {
            r3 = (-b) / (2 * a);
            System.out.println("x0 wynosi : " + r3);
        }



    }
}
