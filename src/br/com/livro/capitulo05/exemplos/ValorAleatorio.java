package br.com.livro.capitulo05.exemplos;
import java.io.PrintStream;
import java.util.Random;

public class ValorAleatorio{
  public static void main(String[] args){
    PrintStream saida = System.out;
    Random acaso = new Random();

    saida.println("\nTipo booleano:\t\t" + acaso.nextBoolean());
    saida.println("Qualquer inteiro:\t" + acaso.nextInt());
    saida.println("Inteiro de 0 a 99:\t" + acaso.nextInt(100));
    saida.println("Inteiro longo:\t\t" + acaso.nextLong());
    saida.println("Tipo float:\t\t" + acaso.nextFloat());
    saida.println("Tipo double:\t\t" + acaso.nextDouble());
  }
}
