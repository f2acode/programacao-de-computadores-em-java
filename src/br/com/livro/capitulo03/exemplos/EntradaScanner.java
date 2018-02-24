package br.com.livro.capitulo03.exemplos;
import java.util.Scanner;

public class EntradaScanner
{
  public static void main(String[] args){
    //System.in faz referência à entrada padrão do sistema
    Scanner scan = new Scanner(System.in);

    System.out.println("\nInforme seu nome: \t");
    String nome = scan.nextLine();
    System.out.println("Informe seu e-mail: \t");
    String email = scan.nextLine();

    System.out.println("\nDados recebidos:");
    System.out.printf("Nome:\t %s \nE-mail:\t %s\n\n", nome, email);
    
    scan.close();
  }
}
