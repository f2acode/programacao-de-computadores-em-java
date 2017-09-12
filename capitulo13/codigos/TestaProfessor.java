import javax.swing.JOptionPane;

public class TestaProfessor {
  public static void main(String[] args) {
    Professor pro = new Professor();
    
    String str = "Dados do professor: ";
    str += "\n" + pro.matricula + ": " + pro.nome;
    JOptionPane.showMessageDialog(null,str);
    
    pro.matricula = -15;
    pro.nome = "";
    
    str = "Dados do professor: ";
    str += "\n" + pro.matricula + ": " + pro.nome;
    JOptionPane.showMessageDialog(null,str);
    
    System.exit(0);
  }
}