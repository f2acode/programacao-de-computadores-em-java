import javax.swing.JOptionPane;

public class TestaMatematico {
  public static void main(String[] args) {
    String str = "";
    double n1 = 0,n2 = 0;
    
    try {
      str = "Informe um n�mero";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      n1 = Double.parseDouble(str);
      
      str = "Informe outro n�mero";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      n2 = Double.parseDouble(str);
    }
    catch(NumberFormatException nfe) {
      str = "N�mero inv�lido: " + str;
      JOptionPane.showMessageDialog(null,str,"Erro",0);
      System.exit(0);
    }
    
    Matematico mat = new Matematico();
    
    str = "Valores informados: " + n1 + " e " + n2;
    str += "\nSoma: "          + mat.somar(n1,n2);
    str += "\nSubtra��o: "     + mat.subtrair(n1,n2);
    str += "\nMultiplica��o: " + mat.multiplicar(n1,n2);
    str += "\nDivis�o: "       + mat.dividir(n1,n2);
    str += "\nFatorial de " + n1 + ": " + mat.fatorial((byte)n1);
    str += "\nFatorial de " + n2 + ": " + mat.fatorial((byte)n2);
    
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
    System.exit(0);
  }
}