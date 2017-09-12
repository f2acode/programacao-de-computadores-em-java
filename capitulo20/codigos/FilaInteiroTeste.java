import java.util.Random;

public class FilaInteiroTeste {
  private static FilaInteiro fila;
  
  public static void main(String[] args) {
    fila = new FilaInteiro(10);
    Random sorteador = new Random();
    
    System.out.print("N�meros inseridos: ");
    while (fila.tamanho() < 8) {
      int numero = sorteador.nextInt(50);
      fila.incluir( numero );
      System.out.print(numero + " ");
    }
    
    System.out.print("\nN�meros removidos: ");
    while(fila.tamanho() > 5) 
      System.out.print( fila.excluir() + " ");
    
    System.out.print("\nN�meros inseridos: ");
    while (!fila.cheia()) {
      int numero = sorteador.nextInt(50);
      fila.incluir( numero );
      System.out.print(numero + " ");
    }
    
    System.out.print("\nN�meros removidos: ");
    while(!fila.vazia()) 
      System.out.print( fila.excluir() + " ");
  }
}
