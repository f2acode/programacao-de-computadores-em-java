import javax.swing.JOptionPane;

public class TestaAssunto {
  public static void main(String[] args) {
    Assunto alg = new Assunto(1,"Algoritmos");
    JOptionPane.showMessageDialog(null,alg);
    
    Assunto ed = new Assunto(2,"Estrutura de dados");
    JOptionPane.showMessageDialog(null,ed);
    
    System.exit(0);
  }
}