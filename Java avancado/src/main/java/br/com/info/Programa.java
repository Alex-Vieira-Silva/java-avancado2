package br.com.info;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Programa {
    public static void main(String[] args) {
       /* UnaryOperator<Integer> CalculaValorVezesTrinta = valor -> valor*3; // Conceito do paradigma funcional.
        int valor = 10;
        System.out.println("O resultado é :: " + CalculaValorVezesTrinta.apply(10)); */

         //funcional
        /*int[] valor = {1,2,3,4};
        Arrays.stream(valor)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(System.out::println);*/

        //imutabilidade
        /*int valor = 20;
        UnaryOperator<Integer> retornaDobro = v -> v * 2;
        System.out.println(retornaDobro.apply(valor)); //retorna o dobro do valor
        System.out.println(valor); //valor não sera alterado*/

        //programação funcional
        /*Function<Integer, Object> buscarUsuario = idUsuario ->
                //buscar meu usuário
                new Object();
        System.out.println();*/
        //programação lambda com interface.
        Funcao1 gerarSaldo = valor -> valor;
    }

    @FunctionalInterface
    interface Funcao1{
        String gerarvalor(String valor);
        //Integer geraNumero(String valor);

    }

}
