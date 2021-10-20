package br.com.info;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {

        Calcular soma = Integer::sum;
        Calcular subtracao = (a,b) ->  a - b;
        Calcular multiplicacao = (a,b) ->  a * b;
        Calcular divisao = (a,b) ->  a / b;
        System.out.println(execultarOperacao(soma, 1, 3));
        System.out.println(execultarOperacao(subtracao , 4, 3));
        System.out.println(execultarOperacao(multiplicacao, 4, 3));
        System.out.println(execultarOperacao(divisao, 6, 2));

    }

    public static int execultarOperacao(Calcular calculo, int a, int b){
        return  calculo.calculo(a,b);
    }
}

@FunctionalInterface
interface Calcular{
    public int calculo(int a, int b);
}
