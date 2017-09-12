import static javax.swing.JOptionPane.*;

public class PilhaDinamicaTeste {
  private static PilhaDinamica<String> pilha;
  
  public static void main(String[] args) throws ListaVaziaException{
    pilha = new PilhaDinamica<String>();
    
    while (true) {
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
