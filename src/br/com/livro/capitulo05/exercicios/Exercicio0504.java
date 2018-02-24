package br.com.livro.capitulo05.exercicios;
import java.util.Scanner;

public class Exercicio0504{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nInforme a primeira palavra:\t");
        String palavra1 = entrada.nextLine();
        System.out.print("Informe a segunda palavra:\t");
        String palavra2 = entrada.nextLine();

        System.out.println("\nAs palavras sao iguais?\t" + palavra1.equalsIgnoreCase(palavra2));
    }
}