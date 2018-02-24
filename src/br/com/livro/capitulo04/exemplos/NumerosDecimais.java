package br.com.livro.capitulo04.exemplos;
import javax.swing.JOptionPane;

public class NumerosDecimais {
  public static void main(String[] args){

    float float_1 = 1.02F, float_2 = 2.0F;
    double double_1 = 5.123456789, double_2 = 10.0;

    String mensagem = "Conteudo das variaveis:" +
    "\nfloat_1 = " + float_1 + "\nfloat_2 = " + float_2 +
    "\ndouble_1 = " + double_1 + "\ndouble_2 = " + double_2;

    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);
  }
}
