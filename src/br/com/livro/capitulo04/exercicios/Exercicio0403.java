package br.com.livro.capitulo04.exercicios;
import java.util.Scanner;

public class Exercicio0403{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("\nInforme um numero inteiro: ");
    int numero = scan.nextInt();
    int quadrado = numero * numero;

    System.out.print("O quadrado de " + String.valueOf(numero) + " e "
    + String.valueOf(quadrado));
    
    scan.close();

  }
}
