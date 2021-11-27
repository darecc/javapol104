package dc;

/**
 * zadanie2: suma liczb parzystych od 2 do m, bez podzielnych przez 3
 */

public class sumaBezpodzielnychPrzez3 {
    /**
     * główna metoda obliczajaca sume liczb
     * @param args argumenty do metody suma
     */
    public static void main(String[] args) {
        double suma =0;
        int m = 7;

        for(int i =2; i<=m; i++) {
            if(i %3 !=0) {
                suma = suma +i;
            }
        }
        System.out.println("Suma liczb od 2 do " + m + " wynosi: " + suma);

        }

}
