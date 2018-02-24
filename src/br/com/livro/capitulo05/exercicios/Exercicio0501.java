package br.com.livro.capitulo05.exercicios;
import java.util.Scanner;
import java.io.PrintStream;

public class Exercicio0501{
  public static void main(String[] args){

    PrintStream saida = System.out;
    Scanner entrada = new Scanner(System.in);

    saida.println("Informe o seu CEP(apenas numeros)");
    String cep = entrada.nextLine();

    cep = cep.substring(0, 5) + "-"+cep.substring(5, cep.length());

    saida.print("CEP formatado:\t"+cep);
    
    entrada.close();
  }
}
