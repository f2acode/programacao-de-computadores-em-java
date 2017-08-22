import java.util.Scanner;

public class Exercicio0303 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("Informe seu nome:\t");
    String nome = scan.nextLine();
    System.out.print("Informe sua nacionalidade:\t");
    String nacionalidade = scan.nextLine();
    System.out.print("Informe seu telefone:\t");
    String telefone = scan.nextLine();

    System.out.println("\nCadastro confirmado!");
    System.out.printf("Nome:\t %s\n", nome);
    System.out.printf("Nacionalidade:\t %s\n", nacionalidade);
    System.out.printf("Telefone:\t %s\n", telefone);

  }
}
