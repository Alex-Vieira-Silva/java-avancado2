package br.com.info;

import java.lang.reflect.Array;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto é adicione as notas: ");

        Set<Double> notas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //-----------------------------------------------------------------
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 é exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();

            if(next < 7){
                iterator1.remove();;
            }
        }

        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");

        Set<Double> notas2 = new LinkedHashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas2);

        System.out.println("Exiba todas notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<Double>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");

        notas.clear();
        notas2.clear();
        notas3.clear();

        System.out.println("Confira se o conjunto 1 esta vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 esta vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 esta vazio: " + notas3.isEmpty());

    }
}
