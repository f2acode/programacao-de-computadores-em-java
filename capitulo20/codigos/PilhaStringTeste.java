import static javax.swing.JOptionPane.*;

public class PilhaStringTeste {
  private static PilhaGenerica<String> pilha;
  
  public static void main(String[] args) {
    pilha = new PilhaGenerica<String>(50);
    
    while (!pilha.cheia()) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      pilha.incluir( str );
    }
    
    String str = "Itens da pilha:";
    while(!pilha.vazia())
      str += "\n" + pilha.excluir();
    showMessageDialog(null, str);
  }
}
