package br.com.info;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Set<Serie> minhasSerie = new HashSet<>(){{
           add(new Serie("Gat", "Fantasia",60));
           add(new Serie("Dark", "Drama",60));
           add(new Serie("that '70s' show", "Comédia",25));
        }};

        for (Serie serie: minhasSerie) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem inserção\t--");

        Set<Serie> minhasSerie1 = new LinkedHashSet<>(){{
            add(new Serie("Gat", "Fantasia",60));
            add(new Serie("Dark", "Drama",60));
            add(new Serie("that '70s' show", "Comédia",25));
        }};

        for (Serie serie: minhasSerie1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");

        Set<Serie> minhasSerie2 = new TreeSet<>(minhasSerie1);

        for (Serie serie: minhasSerie2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Serie> minhasSerie3 = new TreeSet<>(new ComparetoNomeGeneroTempoEpisodio());
        minhasSerie3.addAll(minhasSerie);

        for (Serie serie: minhasSerie3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
            serie.getTempoEpisodio());
        }

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

        if(tempoEpisodio != 0){
            return tempoEpisodio;
        }else{
            return getGenero().compareTo(serie.getGenero());

        }

    }
}

class ComparetoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if(nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if(genero != 0) return genero;

        return serie1.getTempoEpisodio().compareTo(serie2.getTempoEpisodio());

    }
}
