package br.com.livro.capitulo04.exemplos;
import java.util.Scanner;

public class ConversaoCaractereNumero{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("\nInforme um caractere:\t");
    String texto = scan.nextLine();
    char caractere = texto.charAt(0);
    int codigo = (int)caractere;

    System.out.println("Codigo do caractere:\t" + codigo);
    System.out.println();

  }
}
