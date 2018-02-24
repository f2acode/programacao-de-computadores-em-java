package br.com.livro.capitulo09.exemplos;
import javax.swing.JOptionPane;

public class Contatos {
  public static void main(String[] args) {
    int numero = 0;
    while(numero <= 0) {
      String str = "N�mero de contatos";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      numero = Integer.parseInt(str);
    }
    
    String[][] lista = new String[numero][2];
    
    String str = "";
    for (int i = 1; i <= lista.length; i++) {
      
      while (true) {
        str = "Contato " + i + ": nome";
        str = JOptionPane.showInputDialog(null,str);
        if (str == null) break;
        str = str.trim();
        if (str.length() >= 2 && str.length() <= 50) {
          lista[i - 1][0] = str;
          break;
        }
      }
      if (str == null) break;
      
      while (true) {
        str = "Contato " + i + ": e-mail";
        str = JOptionPane.showInputDialog(null,str);
        if (str == null) break;
        str = str.trim();
        if (str.length() >= 5 && str.length() <= 50) {
          lista[i - 1][1] = str;
          break;
        }
      }
      if (str == null) break;
      
    }
    
    str = "Lista de contatos:";
    for (int i = 0; i < lista.length; i++) {
      if (lista[i][1] == null) break;
      str += "\n" + lista[i][0] + " - " + lista[i][1];
    }
    
    JOptionPane.showMessageDialog(null,str);
    System.exit(0);
  }
}