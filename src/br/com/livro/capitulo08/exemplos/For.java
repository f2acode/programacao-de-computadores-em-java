package br.com.livro.capitulo08.exemplos;
public class For {
  public static void main(String[] args) {
    System.out.print("Primeiro la�o:\t");
    for (byte num = 1; num <= 5; num++)
      System.out.print(num + " ");
    
    System.out.print("\nSegundo la�o:\t");
    for(byte num = 5;num >= 1; num--)
      System.out.print(num + " ");
    
    System.out.println();
  }
}