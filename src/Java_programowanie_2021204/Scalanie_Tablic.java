package Java_programowanie_2021204;

/**
 * 15. Scal dwie posortowane tablice liczb ca³kowitych T1 (rozmiar n1) oraz T2 (o rozmiarze n2). Wynik zapamiêtaj w tablicy T3 (o rozmiarze n1+n2)
 */

public class Scalanie_Tablic {

    public static void main(String[] args) {
        int[] tab1 = {2, 3, 12, 15};
        int[] tab2 = {3, 6, 8};
        // tab3 = 2, 3, 3, 6, 8,
        int i1 = 0;
        int i2 = 0;

        int[] tab3;
        tab3 = new int[tab1.length + tab2.length];
        do { // scalanie
            if (tab1[i1] <= tab2[i2]) {
                tab3[i1 + i2] = tab1[i1];
                i1++;
            } else {
                tab3[i1 + i2] = tab2[i2];
                i2++;
            }
        } while (i1 < tab1.length && i2 < tab2.length);

        if (i1 < tab1.length) {
            for (int i = i1; i < tab1.length; i++) {
                tab3[i + i2] = tab1[i];
            }
        }
        if (i2 < tab2.length) {
            for (int i = i2; i < tab2.length; i++) {
                tab3[i1 + i] = tab2[i];
            }
        }
        for (int i : tab3) {
            System.out.print(i + ", ");
        }
        System.out.println();

    }
}