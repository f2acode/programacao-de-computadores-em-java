package br.com.livro.capitulo10.exemplos;
import javax.swing.JOptionPane;

public class Try {
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
    catch (Exception ex){
      str = "Ocorreu uma exce��o!" +
        "\nTipo: " + ex.getClass() +
        "\nMensagem: " + ex.getMessage();
      JOptionPane.showMessageDialog(null,str,"Erro",0);
      System.exit(0);
    }
    
    JOptionPane.showMessageDialog(null,"Resultado: " + quociente);
  }
}