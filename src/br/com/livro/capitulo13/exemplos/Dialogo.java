package br.com.livro.capitulo13.exemplos;
import javax.swing.JOptionPane;

public class Dialogo {
  public static String captar(String mensagem) {
    String str = JOptionPane.showInputDialog(null,mensagem);
    return str;
  }
  
  public static void exibir(String texto) {
    JOptionPane.showMessageDialog(null,texto,"Mensagem",1);
  }
}