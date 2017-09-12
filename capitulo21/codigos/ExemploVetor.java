import static javax.swing.JOptionPane.*;
import java.util.Arrays;

public class ExemploVetor {
  private static String[] textos;
  
  public static void main(String[] args) {
    textos = new String[2];
    
    int contador = 0;
    while (true) {
      String str = showInputDialog("Informe um texto");
      if (str == null) break;
      
      if (contador == textos.length)
        textos = Arrays.copyOf(textos, textos.length * 2);
      
      textos[contador++] = str;
    }
    
    textos = Arrays.copyOf(textos, contador);
    Arrays.sort(textos);
    
    String str = "Conte�do do vetor: " + textos.length + " textos";
    for (int i = 0; i < contador; i++)
      str += "\n- " + textos[i];
    showMessageDialog(null, str);
    
    while (true) {
      str = showInputDialog("Informe um texto para pesquisar");
      if (str == null) break;
      
      int i = Arrays.binarySearch(textos, str);
      if (i < 0) showMessageDialog(null, "N�o encontrado: " + str);
      else showMessageDialog(null, "Encontrado na posi��o " + i);
    }
    
    System.exit(0);
  }
}
