import java.util.Scanner;
import java.lang.Math;

public class Exercicio0510{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nInforme um limite para o sorteio:\t");
        int limite = entrada.nextInt();
        long numeroSorteado = Math.round(Math.random() * limite);

        System.out.println("\nNumero sorteado:\t" + String.valueOf(numeroSorteado));

    }
}