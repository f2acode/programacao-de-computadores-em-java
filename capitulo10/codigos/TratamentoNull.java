import javax.swing.JOptionPane;

public class TratamentoNull {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Informe seu nome");
    if (nome == null) System.exit(0);
    nome = nome.toUpperCase();
    JOptionPane.showMessageDialog(null,"Seu nome: " + nome);
    System.exit(0);
  }
}