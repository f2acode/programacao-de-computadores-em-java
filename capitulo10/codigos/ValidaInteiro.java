import javax.swing.JOptionPane;

public class ValidaInteiro {
  public static void main(String[] args) {
    String str;
    int numero = 0;
    
    while (numero < 1 || numero > 10) {
      str = "Informe um n�mero inteiro";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      
      try {
        numero = Integer.parseInt(str);
        
        if (numero < 1) {
          str = "O n�mero deve ser maior que zero!";
          throw new IllegalArgumentException(str);
        }
        
        if (numero > 10) {
          str = "O n�mero n�o deve ser maior que dez!";
          throw new IllegalArgumentException(str);
        }
      }
      catch (NumberFormatException nfe) {
        str = "N�mero inv�lido: " + str;
        JOptionPane.showMessageDialog(null,str,"Erro",0);
      }
      catch (IllegalArgumentException iae) {
        JOptionPane.showMessageDialog(null,iae.getMessage(),"Erro",0);
      }
    }
    
    JOptionPane.showMessageDialog(null,"N�mero v�lido: " + numero);
    System.exit(0);
  }
}