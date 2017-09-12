import static javax.swing.JOptionPane.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ExemploHashMap {
  private static Map<String,String> mapa;
  
  public static void main(String[] args) {
    mapa = new HashMap<String,String>();
    
    while (true) {
      String x = showInputDialog("Digite uma sigla");
      if (x == null) break;
      
      String y = showInputDialog("Digite o significado de " + x);
      if (y == null) break;
      
      mapa.put(x,y);
    }
    
    TreeSet<String> chaves = new TreeSet<String>(mapa.keySet());
    
    String str = "Dicion�rio (" + mapa.size() + " siglas)\n";
    for (String chave : chaves)
      str += "\n" + chave + ": " + mapa.get(chave);
    showMessageDialog(null, str);
  }
}
