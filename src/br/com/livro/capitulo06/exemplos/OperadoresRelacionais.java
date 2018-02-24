package br.com.livro.capitulo06.exemplos;
import java.io.PrintStream;
import java.util.Scanner;

public class OperadoresRelacionais{
    public static void main(String[] args){
        PrintStream saida = System.out;
        Scanner entrada = new Scanner(System.in);

        saida.print("\nInforme um numero:\t");
        int n1 = entrada.nextInt();

        saida.print("Informe outro numero:\t");
        int n2 = entrada.nextInt();

        saida.println("\nComparacoes:");
        saida.println("n1 == n2:\t" + (n1 == n2));
        saida.println("n1 != n2:\t" + (n1 != n2));
        saida.println("n1 > n2:\t" + (n1 > n2));
        saida.println("n1 < n2:\t" + (n1 < n2));
        saida.println("n1 >= n2:\t" + (n1 >= n2));
        saida.println("n1 <= n2:\t" + (n1 <= n2) + "\n");
    }
}