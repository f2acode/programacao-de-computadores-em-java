package br.com.livro.capitulo04.exercicios;
import java.util.Scanner;
import java.text.NumberFormat;

public class Exercicio0401{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    System.out.print("\nInforme o seu nome completo:\t");
    String nome = scan.nextLine();
    System.out.print("\nInforme o seu sexo:\t");
    char sexo = scan.nextLine().charAt(0);
    System.out.print("\nInforme sua renda familiar:\t");
    double renda = scan.nextDouble();

    System.out.println("\nDADOS GRAVADOS:");
    System.out.println("Nome:\t" + nome);
    System.out.println("Sexo:\t" + String.valueOf(sexo));
    System.out.println("Renda:\t" + nf.format(renda));
    System.out.println();

  }
}
