package br.com.livro.capitulo20.exemplos;
import static javax.swing.JOptionPane.*;

public class FilaStringTeste {
  private static FilaGenerica<String> fila;

  public static void main(String[] args) {
    fila = new FilaGenerica<String>(50);

    while (!fila.cheia()) {
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
