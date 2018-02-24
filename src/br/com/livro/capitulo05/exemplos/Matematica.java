package br.com.livro.capitulo05.exemplos;
public class Matematica {
  public static void main(String[] args){
    System.out.println();

    System.out.println("Valor de E:\t" + Math.E);
    System.out.println("Valor de PI:\t" + Math.PI);

    System.out.println("\nNumero aleatorio:\t" + Math.random());
    System.out.println("Raiz quadrada:\t\t" + Math.sqrt(16));
    System.out.println("Potencia:\t\t" + Math.pow(2, 4));

    System.out.println("\nProximo inteiro:\t" + Math.ceil(4.1));
    System.out.println("Inteiro anterior:\t" + Math.floor(4.9));

    System.out.println("\nArredondamento:");
    System.out.println("Com rint( ):\t" + Math.rint(4.6));
    System.out.println("Com round( ):\t" + Math.round(4.6));

    System.out.println();
  }
}
