package dc;

import java.util.Scanner;

public class pierwiastki {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        double r1, r2, r3;
        double delta;

        System.out.println("Podaj a:");
        a = s.nextDouble();

        System.out.println("Podaj b:");
        b = s.nextDouble();

        System.out.println("Podaj c:");
        c = s.nextDouble();
        delta = Math.pow(b, 2) - (4*a*c);

        if (a < 0) {
            System.out.println("Brak pierwiastka");
        }
        else if (delta > 0) {
            r1 = -b - Math.sqrt(delta) / (2 * a);
            r2 = -b + Math.sqrt(delta) / (2 * a);
            System.out.println("Wartość r1 wynosi: " + r1 + " a wartość r2 wynosi: " + r2);
        } else {
            r3 = (-b) / (2 * a);
            System.out.println("Wartość r3 wynosi:" + r3);
        }



    }
}
