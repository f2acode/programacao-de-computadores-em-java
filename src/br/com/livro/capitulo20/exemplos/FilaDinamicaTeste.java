package br.com.livro.capitulo20.exemplos;
import static javax.swing.JOptionPane.*;

public class FilaDinamicaTeste {
  private static FilaDinamica<String> fila;
  
  public static void main(String[] args) throws ListaVaziaException{
    fila = new FilaDinamica<String>();
    
    while (true) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      fila.incluir( str );
    }
    
    String str = "Itens da fila:";
    while(!fila.vazia())
      str += "\n" + fila.excluir();
    showMessageDialog(null, str);
  }
}
