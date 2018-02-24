package br.com.livro.capitulo06.exercicios;
import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0606{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        saida.print("\nInforme o salario:\t");
        double salario = entrada.nextDouble();

        double classificacao = (salario / 1434) + 1.0;
        double aliquota = (classificacao < 4) ? (int)classificacao * 7.5 : 27.5;
        double imposto = (salario * aliquota)/100;

        saida.print("- Aliquota:\t\t" + String.valueOf(aliquota));
        saida.print("\n- Imposto devido:\t R$ " + String.valueOf(imposto) + "\n");
        
        entrada.close();
    }
}