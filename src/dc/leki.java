package dc;

/**
 * - Mamy 3 opakowania z lekami. L1 = 10 pastylek, L2 = 16 pastylek, L3 = 21 pastylek. Kiedy skończą się wszystkie 3 opakowania
 */
public class leki {
    public static void main(String[] args){

        int a = 10;
        int b = 16;
        int c = 21;

        int a1 = 8;  //a1=a poprzednia wersja
        int b1 = b;
        int c1 = c;

        int sumaDni = 0;

        boolean koniec = false;
        do {
            sumaDni++;
            a1--;
            b1--;
            c1--;
//            if (sumaDni==840)
//                System.out.println("a= " + a1 + "b= " + b1 + "c= " + c1);

            if(a1 == 0 & b1==0 & c1==0){
                koniec=true;
            } else {
                if (a1==0){
                    a1=a;
                }
                if (b1==0){
                    b1=b;
                }
                if (c1==0){
                    c1=c;
                }
            }

        } while (koniec == false);

        System.out.println("Za tyle dni skończą się " +
                "leki we wszystkich opakowaniach " + sumaDni);

    }
}
