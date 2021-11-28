package dc;

//      - UE w 2021 roku wytworzy PKB = 16 bln EUR. Wytworzy tak¿e CO2 równe PKB * 0,01 kg. Ponoæ w 2040 roku emisja
//        CO2 w UE ma byæ mniejsza o 55%. UE zamierza równie¿ rosn¹æ gospodarczo w kategorii PKB o 3% rocznie.
//        Pytanie 1: ile wyniesie PKB UE w 2050 roku w bilionach EUR. I ile to bêdzie emisji CO2 bez redukcji emisji.
//        Pytanie 2: ile UE bêdzie emitowa³o CO2 z redukcj¹ emisji o 55%.

    public class uniaEuropejskaPKB {
        public static void main(String[] args) {
            double aktualnePKB = 16;
            double aktualnaEmisja = aktualnePKB*0.01;
            double nowePKB = aktualnePKB;
            System.out.println("Aktualne PKB: " + aktualnePKB + " bln EUR");
            System.out.println("Aktualna emijsa: " + aktualnaEmisja);
            for(int i=2021; i<=2050;i++) {
                nowePKB = nowePKB + nowePKB*0.03;
            }
            System.out.println("Wartosc PKB w 2040 roku: " + nowePKB + " bln EUR");
            System.out.println("Wartosc emisji z redukcja w 2040 roku: " + nowePKB*0.01*0.45);
            System.out.println("Wartosc emisji bez redukcji w 2040 roku: " + nowePKB*0.01);
        }
    }

