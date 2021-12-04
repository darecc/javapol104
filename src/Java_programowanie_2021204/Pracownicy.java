package Java_programowanie_2021204;

public class Pracownicy {
    Pracownik [] pracownicy;

    /**
     *Podnieś pensję o 10% pracownikom na stonowisku 'programista'
     */
    void pensjaProgramistow(){
        for(Pracownik pracownik : pracownicy){
            if(pracownik.stanowiwsko.equals("programista")){
                pracownik.pensja *= 1.1;
            }
        }
    }

    /**
     *Potrąć 5% pensji za każde spóźnienie (ale nie więcej niż 30% pensji)
     */
    void potracenieZaSpoznienie(){
        double procent = 0;
        for(Pracownik pracownik : pracownicy){
            if(pracownik.liczbaSpoznien > 6){
                procent = 0.7;
            }else{
                procent = 1 - (pracownik.liczbaSpoznien*0.1);
            }
            pracownik.pensja *= procent;
        }
    }
    /**
     *Znajdź pracownika o największej pensji, największej liczbie spóźnień
     */
    Pracownik najPensja(){
        double maxPensja = 0;
        Pracownik pracownikMax = null;
        for(Pracownik pracownik : pracownicy){
            if(pracownik.pensja > maxPensja){
                maxPensja = pracownik.pensja;
                pracownikMax = pracownik;
            }
        }
        return pracownikMax;
    }

    /**
     *Największej liczbie spóźnień
     */
    Pracownik najSpoznienia(){
        double maxSpoznien = 0;
        Pracownik pracownikMax = null;
        for(Pracownik pracownik : pracownicy){
            if(pracownik.liczbaSpoznien > maxSpoznien){
                maxSpoznien = pracownik.liczbaSpoznien;
                pracownikMax = pracownik;
            }
        }
        return pracownikMax;
    }
    /**
     *Znajdź miejscowość, z której jest najwięcej pracowników
     */
    String maxMiejscowosc(){
        int liczbaMiejscowosci = 0;
        String [] nazwaMiejscowosci = new String [pracownicy.length];
        int [] liczbaPracownikow = new int[pracownicy.length];
        boolean flag;

        for(Pracownik pracownik : pracownicy){
            flag = false;
            if(liczbaMiejscowosci > 0) {
                for (int i = 0; i < liczbaMiejscowosci; i++) {
                    if (nazwaMiejscowosci[i].equals(pracownik.miejscowosc)) {
                        liczbaPracownikow[i]++;
                        flag = true;
                        break;
                    }
                }
            }
            if(flag == false){
                nazwaMiejscowosci[liczbaMiejscowosci] = pracownik.miejscowosc;
                liczbaPracownikow[liczbaMiejscowosci]++;
                liczbaMiejscowosci++;
            }
        }

        int max = 0;
        String nazwa = null;
        for(int i = 0; i < liczbaMiejscowosci; i++){
            if(liczbaPracownikow[i] >= max){
                max = liczbaPracownikow[i];
                nazwa = nazwaMiejscowosci[i];
            }
        }
        return nazwa;
    }

    /**
     *Znajdź miejscowość, z której pracownik ma najwyższą pensję
     */

    String miejscowoscNajPensja(){
        return najPensja().miejscowosc;
    }

    /**
     *Znajdź miejscowość, z której pracownicy mają najwyższą średnią pensję
     */

    String miejscowowscNajSrednia(){
        int liczbaMiejscowosci = 0;
        String [] nazwaMiejscowosci = new String [pracownicy.length];
        int [] liczbaPracownikow = new int[pracownicy.length];
        double [] sumaPensji = new double[pracownicy.length];
        boolean flag;

        for(Pracownik pracownik : pracownicy) {
            flag = false;
            if (liczbaMiejscowosci > 0) {
                for (int i = 0; i < liczbaMiejscowosci; i++) {
                    if (nazwaMiejscowosci[i].equals(pracownik.miejscowosc)) {
                        liczbaPracownikow[i]++;
                        sumaPensji[i] += pracownik.pensja;
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                nazwaMiejscowosci[liczbaMiejscowosci] = pracownik.miejscowosc;
                liczbaPracownikow[liczbaMiejscowosci]++;
                sumaPensji[liczbaMiejscowosci] += pracownik.pensja;
                liczbaMiejscowosci++;
            }
        }

        String maxSrMiejscowosc = "";
        double maxSrednia = 0;
        for(int i = 0; i < liczbaMiejscowosci; i++){
            double srednia = sumaPensji[i]/liczbaPracownikow[i];
            if(srednia > maxSrednia){
                maxSrednia = srednia;
                maxSrMiejscowosc = nazwaMiejscowosci[i];
            }
        }

        return  maxSrMiejscowosc;
    }

    public static void main(String[] args) {
        Pracownicy prac = new Pracownicy();

        prac.pracownicy = new Pracownik[] {
                new Pracownik("Stefan", "Kowlaski", "Kraków", "mechanik", 1234.78, 2),
                new Pracownik("Mikołaj", "Nowak", "Kraków", "księgowy", 2547.10, 4),
                new Pracownik("Monika", "Duda", "Poznań", "mechanik", 3500.45, 0),
                new Pracownik("Kasia", "Saska", "Warszawa","mechanik", 4500.45,1),
                new Pracownik("Stefan", "Ochucki", "Lublin", "kasjer", 5000.12, 3),
                new Pracownik("Joanna", "Szafer", "Poznań", "programista", 6000.72, 0)
        };

        Pracownik najPensja = prac.najPensja();
        System.out.println("Pracownik o najwiekszej pensji to: " + najPensja.imie + " " + najPensja.nazwisko + " wynosi: " + najPensja.pensja);

        Pracownik najSpoznien = prac.najSpoznienia();
        System.out.println("Pracownik o najwiekszej liczbie spoznien to: " + najSpoznien.imie + " " + najSpoznien.nazwisko
                + " wynosi: " + najSpoznien.liczbaSpoznien);

        System.out.println("Miejscowos o najwiekszej liczbie pracownikow to: " + prac.maxMiejscowosc());

        System.out.println("Miejscowosc o najwiekszej pensji pracownika to: " + prac.miejscowoscNajPensja());

        System.out.println("Miejscowosc o najwiekszej sredniej pensji pracownika to: " + prac.miejscowowscNajSrednia());
    }
}
