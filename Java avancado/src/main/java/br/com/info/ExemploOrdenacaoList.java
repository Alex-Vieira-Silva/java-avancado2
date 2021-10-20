package br.com.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preta"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("---\tOrdem de inserção\t---");

        System.out.println(meusGatos.toString());

        System.out.println("---\tOrdem de aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem natural de (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem da idade\t---");
        //Collections.sort(meusGatos, new ComparetorIdade());
        meusGatos.sort(new ComparetorIdade());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por cor\t---");
        meusGatos.sort(new ComparetorCor());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por Nome/Idade/Cor\t---");
        meusGatos.sort(new ComparetorNomeIdadeCor());
        System.out.println(meusGatos);
    }

}

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

     public Gato(String nome, Integer idade, String cor){
         this.nome = nome;
         this.idade = idade;
         this.cor = cor;
     }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {

        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparetorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}
class ComparetorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparetorNomeIdadeCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if(nome != 0){
            return  nome;
        }

        if(cor != 0){
            return cor;
        }

      return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
