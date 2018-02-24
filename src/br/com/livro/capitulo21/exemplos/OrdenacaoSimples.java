package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrdenacaoSimples {
  private static List<String> lista;
  
  public static void main(String[] args) {
    lista = new LinkedList<String>();
    
    while (true) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      
      lista.add(str);
    }
    
    Collections.sort(lista);
    
    String str = "Textos ordenados\n";
    for (String texto : lista)
      str += "\n" + texto;
    showMessageDialog(null, str);
  }
}