import javax.swing.JOptionPane;

public class Continue {
  public static void main(String[] args) {
    for (int i = 0; true; i++) {
      String str = "Informe seu nome";
      str = JOptionPane.showInputDialog(null,str);
      
      if (str == null) System.exit(0);
      str = str.trim();
      if (str.length() < 2) continue;
      
      if (i == 0) str = "Bem-vindo,  " + str;
      else str = "Bem-vindo, " + str +
        "\nErros cometidos: " + i;
      
      JOptionPane.showMessageDialog(null,str);
      System.exit(0);
    }
  }
}
