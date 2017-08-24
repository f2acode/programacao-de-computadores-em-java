import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio0402{
  public static void main(String[] args){

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    String nome = JOptionPane.showInputDialog(null, "Informe o seu nome completo:");
    char sexo = JOptionPane.showInputDialog(null, "Informe o seu sexo:").charAt(0);
    double renda = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua renda familiar:"));

    JOptionPane.showMessageDialog(null, "DADOS GRAVADOS:\nNome: " + nome
    + "\nSexo: " + String.valueOf(sexo) + "\nRenda: " + nf.format(renda));

  }
}
