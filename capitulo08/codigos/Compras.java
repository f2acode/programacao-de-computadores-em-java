import javax.swing.JOptionPane;

public class Compras {
  public static void main(String[] args) {
    String lista = "Lista de compras:";
    for (byte nr_item = 1; nr_item <= 5; nr_item++) {
      String str = "Informe o item n�mero " + nr_item;
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      str = str.trim();
      lista += "\nItem " + nr_item + ": " + str;
    }
    
    JOptionPane.showMessageDialog(null,lista);
    System.exit(0);
  }
}