package br.com.livro.capitulo05.exemplos;
import java.io.PrintStream;

public class Caractere{
  public static void main(String[] args){
    PrintStream saida = System.out;

    saida.println("\nCodigos de caracteres:");
    saida.println("A =\t" + Character.getNumericValue('A'));
    saida.println("B =\t" + Character.getNumericValue('B'));
    saida.println("C =\t" + Character.getNumericValue('C'));

    saida.println("\nTestes diversos:\n");
    saida.print("\"5\" e um digito?\t\t");
    saida.println(Character.isDigit('5'));
    saida.print("\"5\" e uma letra?\t\t");
    saida.println(Character.isLetter('5'));
    saida.print("\"5\" e um digito ou uma letra?\t");
    saida.println(Character.isLetterOrDigit('5'));
    saida.print("\"-\" e um espaco em branco?\t");
    saida.println(Character.isWhitespace('-'));

    saida.print("\"A\" é uma letra minúscula?\t");
    saida.println(Character.isLowerCase('A'));
    saida.print("\"A\" é uma letra maiuscula?\t");
    saida.println(Character.isUpperCase('A'));

    saida.print("\nConversao de \"A\" para minusculo:\t");
    saida.println(Character.toLowerCase('A'));
    saida.print("\nConversao de \"b\" para maiusculo:\t");
    saida.println(Character.toUpperCase('b'));
  }
}
