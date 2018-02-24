package br.com.livro.capitulo06.exercicios;
import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0603{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        saida.print("\nInforme os dados da venda:"+
        "\n- O preco original:\t");
        double precoOriginal = entrada.nextDouble();        

        saida.print("- O numero de parcelas:\t");
        int parcelas = entrada.nextInt();

        saida.print("- O valor das parcelas:\t");
        double valorParcelas = entrada.nextDouble();

        double jurosPagos = (parcelas * valorParcelas) - precoOriginal;
        double totalPago = parcelas * valorParcelas;
        double percentualJuros = (jurosPagos * 100)/precoOriginal;
        
        saida.print("\n\nCálculos realizados:" + 
        "\n- Juros pagos:\t\t R$ " + String.valueOf(jurosPagos) +
        "\n- Total pago:\t\t R$ " + String.valueOf(totalPago) + 
        "\n- Percentual de juros:\t" + String.valueOf(percentualJuros));
        
        entrada.close();

    }
}