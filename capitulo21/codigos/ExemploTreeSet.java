import static javax.swing.JOptionPane.*;
import java.util.TreeSet;
import java.util.Set;

public class ExemploTreeSet {
  private static Set<String> conjunto;
  
  public static void main(String[] args) {
    conjunto = new TreeSet<String>();
    
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
