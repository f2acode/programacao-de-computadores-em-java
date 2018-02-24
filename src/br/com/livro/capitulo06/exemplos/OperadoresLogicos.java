package br.com.livro.capitulo06.exemplos;
import java.io.PrintStream;
import java.util.Scanner;

public class OperadoresLogicos{
    public static void main(String[] args){
        PrintStream saida = System.out;
        Scanner entrada = new Scanner(System.in);

        saida.print("\nInforme um valor booleano:\t");
        boolean b1 = entrada.nextBoolean();

        saida.print("Informe outro valor booleano:\t");
        boolean b2 = entrada.nextBoolean();

        saida.println("\nOperacoes logicas");
        saida.println("b1 || b2:\t" + (b1 || b2));
        saida.println("b1 && b2:\t" + (b1 && b2));
        saida.println("b1 ^ b2:\t" + (b1 ^ b2));
        saida.println("!b1:\t\t" + !b1);
        saida.println("!b2:\t\t" + !b2);

        saida.println("\nAtribuicoes:");
        b1 |= b2;
        saida.println("b1 |= b2:\tb1 recebeu " + b1);
        b1 &= !b2;
        saida.println("b1 &= !b2:\tb1 recebeu " + b1);
        b1 ^= b2;
        saida.println("b1 ^= b2:\tb1 recebeu " + b1 + "\n");
        
        entrada.close();
    }
}