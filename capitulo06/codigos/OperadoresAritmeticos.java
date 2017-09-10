import java.io.PrintStream;
import java.util.Scanner;

public class OperadoresAritmeticos{
    public static void main(String[] args){
        PrintStream saida = System.out;
        Scanner entrada = new Scanner(System.in);

        saida.print("\nInforme um numero:\t");
        double n1 = entrada.nextDouble();

        saida.print("Informe outro numero:\t");
        double n2 = entrada.nextDouble();

        saida.println("\nOperacoes aritmeticas basicas:");
        saida.printf("Soma (n1 + n2):\t\t\t%f", n1 + n2);
        saida.printf("\nSubtracao (n1 - n1):\t\t%f", n1 - n2);
        saida.printf("\nMultiplicacao (n1 * n2):\t%f", n1 * n2);
        saida.printf("\nDivisao (n1 / n2):\t\t%f", n1 / n2);
        saida.printf("\nModulo (n1 %% n2):\t\t%f", n1 % n2);

        saida.println("\n\nIncremento e decremento:");
        saida.println("Incremento de n1: " + ++n1);
        saida.println("Decremento de n2: " + --n2);

        saida.println("\nOperacoes de atribuicao:");
        saida.printf("Aditiva (n1 += 2):\t\t%f", n1 += 2);
        saida.printf("\nSubtrativa (n1 -= 3):\t\t%f", n1 -= 3);
        saida.printf("\nDe Multiplicacao (n1 *= 2):\t%f", n1 *= 2);
        saida.printf("\nDe divisao (n1 /= 2):\t\t%f", n1 /= 2);
        saida.printf("\nDe modulo (n1 %% 2):\t\t%f\n\n", n1 %= 2);
    }
}