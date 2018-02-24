package br.com.livro.capitulo03.exemplos;
import javax.swing.JOptionPane;

public class DialogoGrafico
{
  public static void main(String[] args){

    //O primeiro argumento representa a janela que esse dialogo seria vinculado
    String nm = JOptionPane.showInputDialog(null, "Informe seu nome");
    JOptionPane.showMessageDialog(null, nm + ": seja bem-vindo!");
    System.exit(0);

  }
}
