package Java_programowanie_2021204;

public class Pracownik {

    String imie;
    String nazwisko;
    String miejscowosc;
    String stanowiwsko;
    double pensja;
    int liczbaSpoznien;

    public Pracownik(String imie, String nazwisko, String miejscowosc, String stanowiwsko, double pensja, int liczbaSpoznien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.stanowiwsko = stanowiwsko;
        this.pensja = pensja;
        this.liczbaSpoznien = liczbaSpoznien;
    }
}