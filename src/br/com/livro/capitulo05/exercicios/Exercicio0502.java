package br.com.livro.capitulo05.exercicios;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio0502{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    PrintStream saida = System.out;

    saida.print("\nInforme o seu CEP no formato 99999-999:\t");
    String cep = scan.nextLine();

    cep = cep.replaceAll("-", "");

    saida.println("CEP formatado:\t" + cep);
  }
}
