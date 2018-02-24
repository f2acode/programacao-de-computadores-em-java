package br.com.livro.capitulo05.exercicios;
import java.util.Scanner;

public class Exercicio0503{
  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o seu CPF (apenas numeros):");
    String cpf = entrada.nextLine();

    cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
    + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

    System.out.println("CPF formatado:\t" + cpf);

    entrada.close();
  }
}
