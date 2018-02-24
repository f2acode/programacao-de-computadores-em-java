package br.com.livro.capitulo05.exercicios;
import java.lang.Math;
import java.util.Scanner;

public class Exercicio0507{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nInforme um número para calcular a raiz quadrada:\t");
        Double numero = Double.valueOf(entrada.nextInt());

        System.out.print("A raiz quadrada de " + String.valueOf(numero) + " e " +
            String.valueOf(Math.sqrt(numero)));

        entrada.close();
    }
}