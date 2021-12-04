
    package Java_programowanie_2021204;

    /**
     * 2. Napisz klasę Czas przechowującą czas w postaci: godzina:minuta:sekunda i umożliwiającą
     *   - dodawanie innego czasu
     *   - odejmowanie innego czasu
     *   - dodawanie N sekund do danego czasu
     */
    public class Czas {
        private int godzina;
        private int minuta;
        private int sekunda;
        public Czas (int g, int m, int s){
            godzina = g;
            minuta = m;
            sekunda = s;
        }
        public void dodajCzas(Czas t) {
            int newS = sekunda + t.sekunda;
            int newM = minuta + t.minuta;
            int newG = godzina + t.godzina;
            if (newS >= 60) {
                newM = newM + newS / 60;
                newS = newS % 60;
            }
            if (newM >= 60) {
                newG = newG + newM / 60;
                newM = newM % 60;
            }
            if (newG >= 24) {
                newG = newG % 24;
            }
            sekunda = newS;
            minuta = newM;
            godzina = newG;
        }
        public void dodajCzas(int g, int m, int s){
            int newS = sekunda + s;
            int newM = minuta + m;
            int newG = godzina + g;
            if (newS >= 60){
                newM = newM + newS/60;
                newS = newS % 60;
            }
            if (newM >= 60){
                newG = newG + newM /60;
                newM = newM % 60;
            }
            if (newG >= 24){
                newG = newG % 24;
            }
            sekunda = newS;
            minuta = newM;
            godzina = newG;
        }
        public void odejmijCzas(Czas t){
            int newS = sekunda - t.sekunda;
            int newM = minuta - t.minuta;
            int newG = godzina - t.godzina;
            if (newS < 0){
                newM =newM - 1;
                newS = newS + 60;
            }
            if (newM < 0){
                newG = newG - 1;
                newM = newM + 60;
            }
            if (newG < 0){
                newG += 24;
            }
            sekunda = newS;
            minuta = newM;
            godzina = newG;
        }
        public void odejmijCzas(int g, int m, int s){
            int newS = sekunda - s;
            int newM = minuta - m;
            int newG = godzina - g;
            if (newS < 0){
                newM =newM - 1;
                newS = newS + 60;
            }
            if (newM < 0){
                newG = newG - 1;
                newM = newM + 60;
            }
            if (newG < 0){
                newG += 24;
            }
            sekunda = newS;
            minuta = newM;
            godzina = newG;
        }
        public void dodajIlesCzasu(int s){
            int newS = sekunda + s;
            int newM = minuta ;
            int newG = godzina ;
            if (newS >= 60){
                newM = newM + newS/60;
                newS = newS % 60;
            }
            if (newM >= 60){
                newG = newG + newM/60;
                newM = newM % 60;
            }
            if (newG >= 24){
                newG = newG % 24;
            }
            sekunda = newS;
            minuta = newM;
            godzina = newG;

        }

        @Override
        public String toString() {
            return "Czas{" +
                    "godzina=" + godzina +
                    ", minuta=" + minuta +
                    ", sekunda=" + sekunda +
                    '}';
        }

        public static void main(String[] args) {
            Czas czas = new Czas(15,1,34);
            Czas czas2 = new Czas(14,34,34);
            czas2.dodajCzas(3,45,12);
            System.out.println(czas2.toString());
            czas2.odejmijCzas(3,36,23);
            System.out.println(czas2.toString());
            czas2.dodajIlesCzasu(876);
            System.out.println(czas2.toString());
            czas2.dodajCzas(czas);
            System.out.println(czas2);
            czas2.odejmijCzas(czas);
            System.out.println(czas2);
        }


    }


