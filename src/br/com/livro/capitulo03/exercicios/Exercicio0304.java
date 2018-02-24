package br.com.livro.capitulo03.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0304 {
  public static void main(String[] args){

    String jogo1 = JOptionPane.showInputDialog(null, "Informe seu 1 jogo preferido:");
    String jogo2 = JOptionPane.showInputDialog(null, "Informe seu 2 jogo preferido:");

    JOptionPane.showMessageDialog(null, "Seus dois jogos preferidos: \n\n1. " + jogo1 + "\n2. " + jogo2);

    System.exit(0);

  }
}
