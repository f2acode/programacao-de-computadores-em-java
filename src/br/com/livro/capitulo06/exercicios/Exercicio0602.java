package br.com.livro.capitulo06.exercicios;
import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0602{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        saida.print("\nInforme:"+
        "\n- O faturamento da empresa:\t");
        double faturamento = entrada.nextDouble();

        saida.print("\n- O valor dos impostos pagos:\t");
        double impostos = entrada.nextDouble();

        double percentualImpostos = (100*impostos)/faturamento;
        
        saida.print("\n\nPercentual de impostos:\t" + 
        String.valueOf(percentualImpostos));
        
        entrada.close();
    }
}