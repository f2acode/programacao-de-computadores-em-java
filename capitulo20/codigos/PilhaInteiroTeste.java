import java.util.Random;

public class PilhaInteiroTeste {
  private static PilhaInteiro pilha;
  
  public static void main(String[] args) {
    pilha = new PilhaInteiro(5);
    Random sorteador = new Random();
    
    while (!pilha.cheia())
      pilha.incluir( sorteador.nextLong() );
    
    while(!pilha.vazia())
      System.out.println( pilha.excluir() );
  }
}
