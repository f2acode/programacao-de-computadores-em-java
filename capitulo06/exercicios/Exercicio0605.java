import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0605{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        saida.print("\nInforme um numero inteiro:\t");
        int numero = Integer.parseInt(entrada.nextLine());

        saida.print("\nO numero e maior que zero?:\t");
        String resposta = entrada.nextLine();

        boolean maiorZeroUsuario = (resposta.equalsIgnoreCase("sim")) ? true : false;
        boolean maiorZeroComputador = numero > 0;
        boolean conclusao = maiorZeroComputador && maiorZeroUsuario;

        saida.print("\nA sua resposta e:\t" +  
            String.valueOf(conclusao ? "Verdadeira":"Falsa"));

    }
}