package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
  private static Set<String> conjunto;
  
  public static void main(String[] args) {
    conjunto = new HashSet<String>();
    
    while (true) {
      String str = showInputDialog("Item de compra");
      if (str == null) break;
      conjunto.add( str );
    }
    
    String str = "Lista de compras:";
    for (String s : conjunto)
      str += "\n" + s;
    showMessageDialog(null, str);
  }
}
