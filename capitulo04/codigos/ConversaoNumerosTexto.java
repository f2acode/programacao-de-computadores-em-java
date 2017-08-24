import java.util.Scanner;

public class ConversaoNumerosTexto{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String string_inteiro, string_decimal;

    double numero_decimal;
    int numero_inteiro;

    System.out.print("\nInforme um número inteiro: ");
    numero_inteiro = scan.nextInt();

    System.out.print("\nInforme um número decimal: ");
    numero_decimal = scan.nextDouble();

    string_inteiro = String.valueOf(numero_inteiro);
    string_decimal = String.valueOf(numero_decimal);

    System.out.println("\nConteúdo das strings: " +
    "\n String inteiro: \t" + string_inteiro +
    "\n String decimal: \t" + string_decimal);

    System.out.println();

  }
}
