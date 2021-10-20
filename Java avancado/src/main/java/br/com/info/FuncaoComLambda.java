package br.com.info;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao ColocarPrefixoNaString = valor -> "Sr. " + valor;
        System.out.println(ColocarPrefixoNaString.gerar("Alex Vieira"));
    }
}
