package br.com.livro.capitulo16.exemplos;
import br.com.livro.capitulo16.exemplos1.Pessoa;
import javax.swing.JOptionPane;

public class CalculoIMC {
  public static void main(String[] args) {
    String str = JOptionPane.showInputDialog("Seu peso");
    if (str == null) System.exit(0);
    double peso = Double.parseDouble(str);
    
    str = JOptionPane.showInputDialog("Sua altura");
    if (str == null) System.exit(0);
    double altura = Double.parseDouble(str);
    
    double imc = Pessoa.calcularIMC(peso,altura);
    
    JOptionPane.showMessageDialog(null,"Seu IMC: " + imc);
    System.exit(0);
  }
}
