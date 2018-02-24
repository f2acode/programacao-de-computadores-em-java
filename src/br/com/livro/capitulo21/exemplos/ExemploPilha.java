package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.LinkedList;

public class ExemploPilha {
  private static LinkedList<String> pilha;
  
  public static void main(String[] args) {
    pilha = new LinkedList<String>();
    
    while (true) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      pilha.push( str );
    }
    
    String str = "Itens da pilha:";
    while(!pilha.isEmpty())
      str += "\n" + pilha.pop();
    showMessageDialog(null, str);
  }
}
