package br.com.livro.capitulo12.exemplos;
import javax.swing.JOptionPane;

public class CadastroEstado {
  public static void main(String[] args) {
    Estado estado = new Estado();
    
    String str = JOptionPane.showInputDialog("Nome do estado");
    if (str == null) System.exit(0);
    estado.nome = str;
    
    str = JOptionPane.showInputDialog("Sigla do estado");
    if (str == null) System.exit(0);
    estado.sigla = str;
    
    estado.exibirDados();
    System.exit(0);
  }
}