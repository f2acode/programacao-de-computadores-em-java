import java.util.Scanner;

public class Exercicio0508{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nInforme um numero:\t");
        int numero = entrada.nextInt();
        System.out.print("\nInforme um expoente:\t");
        int expoente = entrada.nextInt();

        System.out.print("\nResultado:\t" + String.valueOf(Math.pow(numero, expoente)));
    }
}