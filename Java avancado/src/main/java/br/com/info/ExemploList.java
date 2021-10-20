package br.com.info;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista é adicione sete notas.");
        System.out.println("Notas:");
        List<Double> listaNotas = new ArrayList<Double>();

        // Esse exemplo de lista é para se utilizado no projeto sistema de caixa.
       /* List<String> listatotal = new ArrayList<String>();


        listatotal.add(0,"Alex Vieira da Silva");
        listatotal.add(1,"Lorival Rodrigues da Silva");
        listatotal.add(2,"Redenção");
        listatotal.add(3,"Custódia");

        System.out.println(listatotal);
        System.out.println("Nome: " + listatotal.get(0));
        System.out.println("Endereço: " + listatotal.get(1));
        System.out.println("Bairro: " + listatotal.get(2));
        System.out.println("Cidade: " + listatotal.get(3)); */


        listaNotas.add(8.5);
        listaNotas.add(6.8);
        listaNotas.add(9.6);
        listaNotas.add(5.9);
        listaNotas.add(8.2);
        listaNotas.add(6.5);
        listaNotas.add(7.2);
        System.out.println(listaNotas);

        System.out.println("Exiba a posição de nota 5.9: " + listaNotas.indexOf(5.9d));
        listaNotas.add(3, 10.0);
        System.out.println(listaNotas);

        System.out.println("Substitua nota 5.9 por 6.0");
        listaNotas.set(listaNotas.indexOf(5.9d), 6.0d);
        System.out.println(listaNotas);

        System.out.println("Confira se a nota 5.9 esta na lista: " + listaNotas.contains(5.9d));

       /* System.out.println("Exiba todas as notas na ordem informada: ");
        for (Double lista: listaNotas) System.out.println(lista);*/

        System.out.println("Exiba a terceira nota adicionada: " + listaNotas.get(2).toString());

        System.out.println("Exiba a menor nota: " + Collections.min(listaNotas));

        System.out.println("Exiba a maior nota: " + Collections.max(listaNotas));

        //------------------------------------------------------------------------//
        Iterator<Double> iterator = listaNotas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma );

        System.out.println("Exiba a média das notas: " + (soma / listaNotas.size()));

        System.out.println("Remova a nota 6.5: ");
        listaNotas.remove(6);

        System.out.println(listaNotas);

        System.out.println("Remova as notas menores que 7.0");

        //listaNotas.removeIf(next -> next <= 7.0);

        listaNotas.removeIf(next -> next <= 7.0);
        System.out.println(listaNotas);

        System.out.println("Apague toda a lista.");
        listaNotas.clear();
        System.out.println(listaNotas);

        System.out.println("Confira se a lista esta vazia: " + listaNotas.isEmpty());



    }
}
