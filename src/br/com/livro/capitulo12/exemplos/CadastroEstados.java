package br.com.livro.capitulo12.exemplos;
import javax.swing.JOptionPane;

public class CadastroEstados {
  public static void main(String[] args) {
    Estado[] registros = new Estado[26];
    
    for (int indice = 0; indice < registros.length; indice++) {
      Estado estado = new Estado();
      
      String str = JOptionPane.showInputDialog("Nome do estado");
      if (str == null) break;
      estado.nome = str;
      
      str = JOptionPane.showInputDialog("Sigla do estado");
      if (str == null) break;
      estado.sigla = str;
      
      registros[indice] = estado;
    }
    
    String relatorio = "Relat�rio de estados:";
    for (int posicao = 0; posicao < registros.length; posicao++) {
      Estado estado = registros[posicao];
      if (estado == null) break;
      relatorio += "\n" + estado.recuperarDados();
    }
    
    JOptionPane.showMessageDialog(null,relatorio);
    System.exit(0);
  }
}