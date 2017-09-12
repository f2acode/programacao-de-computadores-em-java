import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
  private static List<Contato> lista;
  
  public static void main(String[] args) {
    lista = new ArrayList<Contato>();
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o", 
        "Cadastro de contatos", 0, 3, null, new String[]{"Incluir",
        "Excluir","Alterar","Consultar","Relat�rio"},"Incluir");
      if (i == -1) System.exit(0);
      if (i == 0) incluir();
      else if (i == 1) excluir();
      else if (i == 2) alterar();
      else if (i == 3) consultar();
      else if (i == 4) relatorio();
    }
  }
  
  private static void incluir() {
    Contato contato = new Contato();
    
    String str = showInputDialog("Informe o nome");
    if (str == null) return;
    contato.setNome(str);
    
    if (lista.contains(contato)) {
      showMessageDialog(null, "Contato j� cadastrado!","Erro",
        ERROR_MESSAGE);
      return;
    }
    
    str = showInputDialog("Informe o e-mail");
    if (str == null) return;
    contato.setEmail(str);
    
    lista.add( contato );
  }
  
  private static void excluir() {
    Contato contato = new Contato();
    
    String str = showInputDialog("Informe o nome");
    if (str == null) return;
    contato.setNome(str);
    
    int posicao = lista.indexOf(contato);
    
    if (posicao == -1) {
      showMessageDialog(null, "N�o h� contato chamado " + 
        contato.getNome(),"Erro",ERROR_MESSAGE);
      return;
    }
    
    showMessageDialog(null, "Removido: " + lista.remove(posicao));
  }
  
  private static void alterar() {
    Contato contato = new Contato();
    
    String str = showInputDialog("Informe o nome");
    if (str == null) return;
    contato.setNome(str);
    
    int posicao = lista.indexOf(contato);
    
    if (posicao == -1) {
      showMessageDialog(null, "N�o h� contato chamado " + 
        contato.getNome(),"Erro",ERROR_MESSAGE);
      return;
    }
    
    str = showInputDialog("Informe o novo e-mail");
    if (str == null) return;
    contato.setEmail(str);
    
    lista.set(posicao, contato);
    showMessageDialog(null, "Cadastro atualizado:\n" + contato);
  }
  
  private static void consultar() {
    Contato contato = new Contato();
    
    String str = showInputDialog("Informe o nome");
    if (str == null) return;
    contato.setNome(str);
    
    int posicao = lista.indexOf(contato);
    
    if (posicao == -1) {
      showMessageDialog(null, "N�o h� contato chamado " + 
        contato.getNome(),"Erro",ERROR_MESSAGE);
      return;
    }
    
    showMessageDialog(null,"Dados do contato:\n"+lista.get(posicao));
  }
  
  private static void relatorio() {
    String str = "Relat�rio de contatos:\n";
    for (Contato contato : lista)
      str += "\n" + contato;
    showMessageDialog(null, str);
  }
}
