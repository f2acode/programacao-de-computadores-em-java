import static java.lang.Math.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ImportacaoEstatica {
  public static void main(String[] args) {
    String str = showInputDialog("Informe um n�mero");
    if (str == null) System.exit(0);
    double numero = Double.parseDouble(str);
    
    str = "N�mero: " + numero + "\nSeno: " + sin(numero) + 
      "\nCosseno: " + cos(numero);
    showMessageDialog(null, str);
    System.exit(0);
  }
}
