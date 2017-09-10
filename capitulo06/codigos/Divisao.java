import java.io.PrintStream;
import java.util.Scanner;

public class Divisao{
    public static void main(String[] args){
        PrintStream saida = System.out;
        Scanner entrada = new Scanner(System.in);

        saida.print("\nInforme o dividendo:\t");
        double n1 = entrada.nextDouble();

        saida.print("Informe o divisor:\t");
        double n2 = entrada.nextDouble();

        String msg = n2 == 0 ? "Erro" : String.valueOf(n1 / n2);

        saida.println("Resultado:\t\t" + msg + "\n");
    }
}