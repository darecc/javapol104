package Java_programowanie_2021204;

import java.util.Arrays;

/**
 * 4. Zaimplementu stos liczb przy pomocy napisanej przez siebie
 * klasy Stack z polem będącym tablicą (np. 20 liczb int).
 * Próba wstawienia elementu 21-go powinna być
 * ignorowana i powinna wyświetlać informację o tym, że została zignorowana.
 */

public class Stos {
    private static final int maxSIZE = 100;
    private int[] stos = new int [maxSIZE];
    private int size;

    public Stos() {
        this.size = 0;
    }

    boolean push(int n){
        if(size<maxSIZE){
            stos[size]=n;
            size++;
            return true;
        } else {
            return false;
        }
    }
    //var args
    boolean push(int ... args){
        for (int i=0;i<args.length;i++){
            boolean result = push(args[i]);
            if (result == false){
                return false;
            }
        }
        return true;
    }

    int pop(){
        if(size>0) {
            int result = stos[size-1];
            size--;
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    //podejrzenie ostatniego elementu na stosie
    int peek(){
        if(size>0) {
            int result = stos[size-1];
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
         String S = "{";
         for (int i=0; i<size;i++){
             if (i<size-1) {
                 S += stos[i] + "," + " ";
             }
             else {
                 S += stos[i];
             }

         }
         return S+= "}";
    }

    public static void main(String[] args) {

        Stos stos1 = new Stos();
        stos1.push(55);
        stos1.push(25,36,14,15);
        System.out.println(stos1.peek());
        System.out.println(stos1);
        while (stos1.getSize() > 0){
            int x= stos1.pop();
            System.out.println("Zdejmowany element = " + x);
        }







    }
}
