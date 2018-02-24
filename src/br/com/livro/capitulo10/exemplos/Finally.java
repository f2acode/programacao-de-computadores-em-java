package br.com.livro.capitulo10.exemplos;
import javax.swing.JOptionPane;

public class Finally {
  public static void main(String[] args){
    String str = "Informe um n�mero";
    str = JOptionPane.showInputDialog(null,str);
    if (str == null) System.exit(0);
       
    try {
      Integer.parseInt(str);
      JOptionPane.showMessageDialog(null,"N�mero v�lido!");
    }
    catch (NumberFormatException nfe) {
      JOptionPane.showMessageDialog(null,"Dado inv�lido!","Erro",0);
    }
    finally {
      JOptionPane.showMessageDialog(null,"Opera��o encerrada!");
      System.exit(0);
    }
  }
}