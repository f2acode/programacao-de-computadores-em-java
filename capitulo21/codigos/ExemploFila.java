import static javax.swing.JOptionPane.*;
import java.util.LinkedList;

public class ExemploFila {
  private static LinkedList<String> fila;
  
  public static void main(String[] args) {
    fila = new LinkedList<String>();
    
    while (true) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      fila.add( str );
    }
    
    String str = "Itens da fila:";
    while(!fila.isEmpty())
      str += "\n" + fila.remove();
    showMessageDialog(null, str);
  }
}
