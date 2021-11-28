package Java_programowanie_20211128;

public class liczbyBlizniacze {
    /**
     * 3. Dla ka¿dej liczby z przedzia³u od 100 do 999 znajdŸ wszystkie liczby bliŸniacze. Za liczbê bliŸniacz¹ rozumiemy tu liczbê sk³adaj¹c¹ siê z takich samych cyfr.
     * 4. Dla ka¿dej liczby z przedzia³u od 100 do 999 znajdŸ wszystkie liczby o takiej samej sumie podzielników ca³kowitych.
     */
    public static void main(String[] args) {
        int[][] ciag = new int[1000][3];

        for (int i = 100; i <= 999; i++) {
            int c1 = i / 100;
            int c2 = (i - c1 * 100) / 10;
            int c3 = (i - c1 * 100 - c2 * 10);
            //sortowanie
            if (c2 < c1) {
                int temp1 = c1;
                c1 = c2;
                c2 = temp1;
            }
            if (c3 < c1) {
                int temp2 = c1;
                c1 = c3;
                c3 = temp2;
            }
            if (c3 < c2) {
                int temp3 = c2;
                c2 = c3;
                c3 = temp3;
            }
            ciag[i][0] = c1;
            ciag[i][1] = c2;
            ciag[i][2] = c3;
        }
        //porównanie i=100-998 / j=i+1 - 999
        for (int i = 100; i <= 998; i++) {
            for (int j = i + 1; j <= 999; j++) {
                if (ciag[i][0] == ciag[j][0] && ciag[i][1] == ciag[j][1] && ciag[i][2] == ciag[j][2]) {
                    System.out.println(i + " >=< " + j);
                }
            }
        }
    }
}