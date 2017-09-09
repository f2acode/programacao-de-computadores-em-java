import java.util.Scanner;
import java.lang.Math;

public class Exercicio0509{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nInforme o diametro de um circulo:\t");
        Double diametro = entrada.nextDouble();

        Double raio = diametro / 2;
        Double circunferencia = diametro * Math.PI;
        Double area = Math.PI * Math.pow(raio, 2);

        System.out.print("\n\nRaio do circulo:\t" + String.valueOf(raio));
        System.out.print("\nCircunferencia do circulo:\t" + String.valueOf(circunferencia));
        System.out.println("\nArea do circulo:\t" + String.valueOf(area));
    }
}