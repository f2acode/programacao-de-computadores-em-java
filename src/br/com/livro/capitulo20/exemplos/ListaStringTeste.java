package br.com.livro.capitulo20.exemplos;
import static javax.swing.JOptionPane.*;

public class ListaStringTeste {
  private static Lista<String> lista;
  
  public static void main(String[] args) throws ListaVaziaException{
    lista = new Lista<String>();
    
    while (true) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      lista.incluirNoFim( str );
    }
    
    String str = "Itens da lista:";
    while(!lista.vazia())
      str += "\n" + lista.excluirDoInicio();
    showMessageDialog(null, str);
  }
}
