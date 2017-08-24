import java.util.Scanner;
import java.text.NumberFormat;

public class Exercicio0405{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    System.out.print("\nInforme o nome do vendedor: ");
    String nome = scan.nextLine();

    System.out.print("\nInforme o total de vendas realizadas por "+ nome
    + ": ");
    Double valor = scan.nextDouble();

    System.out.print("\nInforme o percentual de comissão de " + nome + ": ");
    Double porcentagemComissao = scan.nextDouble();

    Double valorComissao = (valor * porcentagemComissao)/100;

    System.out.print("Valor da comissão de " + nome + ": "
    + nf.format(valorComissao));

    System.out.println();

  }
}
