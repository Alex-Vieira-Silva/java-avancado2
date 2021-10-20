package br.com.info;

public class FatorialRecursivo {
    public static void main(String[] args) {

        System.out.println(Fatorial(5));

    }

    public static int Fatorial(int value){
        if(value == 1){
            return value;
        }else {
            return value * Fatorial((value - 1));
        }
    }
}


