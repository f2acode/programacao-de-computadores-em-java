package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;

public class ExemploListaInclusao {
  private static List<Contato> lista;
  
  public static void main(String[] args) {
    lista = new ArrayList<Contato>();
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o", 
          "Cadastro de contatos", 0, 3, null, new String[]{
          "Incluir no In�cio","Incluir no Fim","Relat�rio"},
          "Incluir no In�cio");
      if (i == -1) System.exit(0);
      if (i == 0) incluir(0);
      else if (i == 1) incluir(lista.size());
      else if (i == 2) relatorio();
    }
  }
  
  private static void incluir(int posicao) {
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
    
    lista.add(posicao, contato);
  }
  
  private static void relatorio() {
    String str = "Relat�rio de contatos:\n";
    for (Contato contato : lista)
      str += "\n" + contato;
    showMessageDialog(null, str);
  }
}
