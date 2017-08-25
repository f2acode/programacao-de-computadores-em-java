import java.io.PrintStream;
import java.util.Scanner;

public class AnalisadorDeTexto {
  public static void main(String [] args){
    String artista = "";
    PrintStream saida = System.out;

    Scanner scan = new Scanner(System.in);
    saida.print("\nInforme o nome de um artista:\t");
    artista = scan.nextLine();

    saida.println("\nAnalise do nome:\t\t" + artista);

    saida.print("Conversao para maiusculo:\t");
    saida.println(artista.toUpperCase());

    saida.print("Conversao para minusculo:\t");
    saida.println(artista.toLowerCase());

    saida.print("Substituindo o espaco por '_':\t");
    saida.println(artista.replaceAll(" ", "_"));

    saida.print("Quantidade de caracteres:\t");
    saida.println(artista.length());

    saida.print("A primeira letra:\t\t");
    saida.println(artista.charAt(0));

    saida.print("Posicao da primeira letra 'a':\t");
    saida.println(artista.indexOf("a"));

    saida.print("Posicao da ultima letra 'a':\t");
    saida.println(artista.lastIndexOf("a"));

    saida.print("O primeiro nome:\t\t");
    saida.println(artista.substring(0, artista.indexOf(" ")));

    saida.print("O ultimo sobrenome:\t\t");
    saida.println(artista.substring(artista.lastIndexOf(" ") +1, artista.length()));
  }
}
