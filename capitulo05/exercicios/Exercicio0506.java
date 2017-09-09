import java.util.Scanner;

public class Exercicio0506{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu nome completo:\t");
        String nomeCompleto = entrada.nextLine();
        int espacoSegundoNome = nomeCompleto.indexOf(" ");
        String iniciais = String.valueOf(nomeCompleto.charAt(0)) + 
            String.valueOf(nomeCompleto.charAt(espacoSegundoNome+1));
        
        System.out.print("As iniciais do seu nome sao:" + iniciais);

    }
}