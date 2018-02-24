package br.com.livro.capitulo09.exemplos;
import javax.swing.JOptionPane;

public class Convidados {
  public static void main(String[] args) {
    String[] convidados = new String[20];
    
    for (int numero = 1; numero <= convidados.length; numero++) {
      String str = "Convidado " + numero;
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) break;
      str = str.trim();
      convidados[numero - 1] = str;
    }
    
    String mensagem = "Rela��o de convidados:";
    for (int posicao = 0; posicao < convidados.length; posicao++) {
      if (convidados[posicao] == null) break;
      mensagem += "\n- " + convidados[posicao];
    }
    
    JOptionPane.showMessageDialog(null,mensagem);
    System.exit(0);
  }
}