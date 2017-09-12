import javax.swing.JOptionPane;

public class ValidaEmail {
  public static void main(String[] args) {
    String email = "";
    
    do {
      email = JOptionPane.showInputDialog(null,"Informe seu e-mail");
      if (email == null) System.exit(0);
      email = email.trim();
    }
    while (email.length() < 5 || email.indexOf("@") < 1);
    
    JOptionPane.showMessageDialog(null,"E-mail v�lido: " + email);
    System.exit(0);
  }
}
