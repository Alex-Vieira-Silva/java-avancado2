package br.com.info;

public class FatorialTailCall {
    public static void main(String[] args) {

        System.out.println(FatorialA(100));

    }

    public static double FatorialA(double valor){

        return FatorialComtailCall(valor,  1);

    }

    public static double FatorialComtailCall(double valor, double numero){
        if(valor == 0){
            return numero;
        }else{
            return FatorialComtailCall(valor - 1, numero * valor);
        }


    }
}
