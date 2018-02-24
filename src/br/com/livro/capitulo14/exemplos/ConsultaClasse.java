package br.com.livro.capitulo14.exemplos;
import javax.swing.JOptionPane;

public class ConsultaClasse{
  public static void main(String[] args) {
    Veiculo v1 = new Onibus("AAA-3388",2009,46);
    Veiculo v2 = new Caminhao("BBB-3498",2009,2);
    
    JOptionPane.showMessageDialog(null, v1.getClass().getName());
    JOptionPane.showMessageDialog(null, v2.getClass().getName());
    System.exit(0);
  }
}
