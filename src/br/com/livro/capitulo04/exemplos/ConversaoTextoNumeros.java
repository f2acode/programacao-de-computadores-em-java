package br.com.livro.capitulo04.exemplos;
import java.util.Scanner;

public class ConversaoTextoNumeros{
  public static void main(String[] args){

    System.out.print("\nInforme um numero: ");
    Scanner scan = new Scanner(System.in);
    String texto = scan.nextLine();

    double db = Double.parseDouble(texto);
    float fl = Float.parseFloat(texto);
    long lg = Long.parseLong(texto);
    int it = Integer.parseInt(texto);
    short sh = Short.parseShort(texto);
    byte bt = Byte.parseByte(texto);
    char ch = (char) Integer.parseInt(texto);

    System.out.printf("\nConteudo das variaveis:" +
    "\n db = \t %f \n f1 = \t %f \n lg = \t %d \n it = \t %d" +
    "\n sh = \t %d \n bt = \t %d \n ch = \t %c \n\n",
    db, fl, lg, it, sh, bt, ch);
  }
}
