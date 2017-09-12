import javax.swing.JOptionPane;

public class Break {
  public static void main(String[] args) {
    String str;
    while (true) {
      str = "Informe seu nome";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      str = str.trim();
      if (str.length() >= 2) break;
    }
    str = "Nome informado: " + str;
    JOptionPane.showMessageDialog(null,str);
    System.exit(0);
  }
}