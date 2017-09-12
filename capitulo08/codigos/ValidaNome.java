import javax.swing.JOptionPane;

public class ValidaNome {
  public static void main(String[] args) {
    String nome = "";
    
    boolean nome_valido = false;
    while (nome_valido == false) {
      nome = JOptionPane.showInputDialog(null,"Informe seu nome");
      if (nome == null) System.exit(0);
      nome = nome.trim();
      
      if (nome.length() < 5 || nome.length() > 50)
        JOptionPane.showMessageDialog(null,"Nome inv�lido!","Erro",0);
      else nome_valido = true;
    }
    
    JOptionPane.showMessageDialog(null,"Nome v�lido: " + nome);
    System.exit(0);
  }
}