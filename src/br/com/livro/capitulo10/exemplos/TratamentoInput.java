package br.com.livro.capitulo10.exemplos;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoInput {
  public static void main(String[] args) {
    byte idade = -1;
    
    while (idade < 0) {
      System.out.print("\nInforme sua idade:\t");
      Scanner scan = new Scanner(System.in);
      
      try {
        idade = scan.nextByte();
      }
      catch (InputMismatchException ime) {
        System.out.println("Idade inv�lida!");
      }
      scan.close();
    }
    
    System.out.println("Sua idade:\t\t" + idade);
  }
}