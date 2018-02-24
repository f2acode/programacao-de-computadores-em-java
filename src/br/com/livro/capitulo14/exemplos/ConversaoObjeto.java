package br.com.livro.capitulo14.exemplos;
import javax.swing.JOptionPane;

public class ConversaoObjeto{
  public static void main(String[] args) {
    Veiculo v1 = new Onibus("AAA-3388",2009,46);
    Onibus bus = (Onibus)v1;
    
    String str = "Dados do �nibus: " +
      "\nPlaca: " + v1.getPlaca() +
      "\nAno: " + v1.getAno() +
      "\nAssentos: " + bus.getAssentos();
    JOptionPane.showMessageDialog(null, str);
    
    System.exit(0);
  }
}
