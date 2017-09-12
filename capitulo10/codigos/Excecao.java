import javax.swing.JOptionPane;

public class Excecao {
  public static void main(String[] args) {
    String str = "Informe um n�mero inteiro";
    str = JOptionPane.showInputDialog(null,str,"Informe",3);
       
    int numero = Integer.parseInt(str);
    int resultado = (int)Math.pow(numero,3);
    
    str = "O cubo de " + numero + " � " + resultado;
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
    System.exit(0);
  }
}