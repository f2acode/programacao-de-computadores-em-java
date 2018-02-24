package br.com.livro.capitulo06.exercicios;
import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0601{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        saida.print("\nInforme:"+
        "\n- A distancia percorrida (em km):\t");
        double distancia = entrada.nextDouble();

        saida.print("\n- O tempo gasto(em minutos):\t");
        double tempo = entrada.nextDouble();

        double velocidadeMedia = distancia / (tempo / 60);
        saida.print("\n\nVelocidade media (km/h):\t\t" + 
        String.valueOf(velocidadeMedia));

    }
}