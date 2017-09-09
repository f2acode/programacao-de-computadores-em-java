import java.util.Random;

public class Exercicio0512{
    public static void main(String[] args){

        Random gerador = new Random();

        //Gerando números de 65 à 90
        int numeroGerado = gerador.nextInt(26) + 65;
        char caractereCorrespondente = (char) numeroGerado;

        System.out.println("\nNumero sorteado:\t" + String.valueOf(numeroGerado));
        
        System.out.println("Correspondente na tabela unicode:\t" + 
            String.valueOf(caractereCorrespondente));
    }
}