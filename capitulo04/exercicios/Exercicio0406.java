import java.util.Scanner;

public class Exercicio0406{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("\nInforme o seu peso:\t");
    double peso = scan.nextDouble();

    System.out.print("Informe a sua altura:\t");
    double altura = scan.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("Seu IMC:\t\t" + String.valueOf(imc));

  }
}
