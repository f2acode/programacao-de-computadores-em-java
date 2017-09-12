import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExemploCollection {
  private static Collection<Contato> colecao;
  
  public static void main(String[] args) {
    colecao = new ArrayList<Contato>();
    
    while (true) {
      Contato contato = new Contato();
      
      String str = showInputDialog("Informe o nome do contato");
      if (str == null) break;
      contato.setNome(str);
      
      if (colecao.contains(contato)) {
        showMessageDialog(null, "Contato j� cadastrado!","Erro",
          ERROR_MESSAGE);
        continue;
      }
      
      str = showInputDialog("Informe o e-mail do contato");
      if (str == null) break;
      contato.setEmail(str);
      
      colecao.add( contato );
    }
    
    String str = "Recupera��o com foreach";
    for (Contato contato : colecao)
      str += "\n" + contato;
    showMessageDialog(null, str);
    
    str = "Recupera��o com iterator";
    Iterator<Contato> it = colecao.iterator();
    while(it.hasNext())
      str += "\n" + it.next();
    showMessageDialog(null, str);
    
    exibirEstado();
    colecao.clear();
    exibirEstado();
    
    System.exit(0);
  }
  
  private static void exibirEstado( ) {
    String str = "Estado da cole��o: ";
    str += "\nVazia: " + (colecao.isEmpty() ? "Sim" : "N�o");
    str += "\nTamanho: " + colecao.size();
    showMessageDialog(null, str);
  }
}
