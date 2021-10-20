package br.com.info;
import  java.io.IOException ;
import  java.util.Scanner ;
import static java.lang.String.format;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f%n", distancia);
    }
}
