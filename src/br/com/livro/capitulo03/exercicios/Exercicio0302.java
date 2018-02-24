package br.com.livro.capitulo03.exercicios;
import java.io.IOException;

public class Exercicio0302 {
  public static void main(String[] args) throws IOException{

    byte[] btName = new byte[50];
    byte[] btEmail = new byte[50];

    System.out.print("Informe seu nome:\t");
    System.in.read(btName);
    String name = new String(btName).trim();

    System.out.print("Informe seu e-mail:\t");
    System.in.read(btEmail);
    String email = new String(btEmail).trim();

    System.out.println("\nCadastro confirmado!");
    System.out.printf("Nome:\t %s\n", name);
    System.out.printf("E-mail:\t %s\n", email);

  }
}
