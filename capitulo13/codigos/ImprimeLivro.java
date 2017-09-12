import javax.swing.JOptionPane;

public class ImprimeLivro {
  public static void main(String[] args) {
    Livro brain = new Livro();
    brain.setCodigo(1);
    brain.setTitulo("Brainstorms");
    JOptionPane.showMessageDialog(null,brain);
    
    Livro tripla_corda = new Livro();
    tripla_corda.setCodigo(2);
    tripla_corda.setTitulo("A tripla corda: mente, corpo e mundo");
    JOptionPane.showMessageDialog(null,tripla_corda);
    
    System.exit(0);
  }
}