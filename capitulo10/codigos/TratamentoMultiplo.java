import javax.swing.JOptionPane;

public class TratamentoMultiplo {
  public static void main(String[] args) {
    String str;
    int quociente = 0;
    
    try {
      str = JOptionPane.showInputDialog(null,"Informe o dividendo");
      int dividendo = Integer.parseInt(str);
      
      str = JOptionPane.showInputDialog(null,"Informe o divisor");
      int divisor = Integer.parseInt(str);
      
      quociente = dividendo / divisor;
    }
    catch (NumberFormatException nf){
      str = "N�mero inv�lido!";
      JOptionPane.showMessageDialog(null,str,"Erro",0);
      System.exit(0);
    }
    catch (ArithmeticException ae){
      str = "O divisor n�o pode ser zero!";
      JOptionPane.showMessageDialog(null,str,"Erro",0);
      System.exit(0);
    }
    
    JOptionPane.showMessageDialog(null,"Resultado: " + quociente);
    System.exit(0);
  }
}