package br.com.livro.capitulo06.exercicios;
import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0604{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        saida.print("\nInforme um numero:\t");
        double resto = entrada.nextInt() % 2;        

        saida.print("Analise do numero:\t" + 
            String.valueOf((resto == 0) ? "Numero par" : "Numero impar") + "\n");

    }
}