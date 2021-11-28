package Java_programowanie_2021204;

public class Time {
    private int g;
    private int m;
    private int s;
    public Time(int g, int m, int s) {
        this.g = g;
        this.m = m;
        this.s = s;
    }
    public void shift(int p) {
        s = p+s;
        if(s >= 60){
            m = m + (s/60);
            s = s % 60;
        }
        if(m >= 60){
            g = g + (m/60);
            m = m % 60;
        }
        if(g >=24){
            g = g%24;
        }
    }
    @Override
    public String toString() {
        String napis = "";
        if (g < 10)
            napis = "0";
        napis += g + ":";
        if (m < 10)
            napis += "0";
        napis += m + ":";
        if (s < 10)
            napis += "0";
        napis += s;
        return napis;
    }
}
