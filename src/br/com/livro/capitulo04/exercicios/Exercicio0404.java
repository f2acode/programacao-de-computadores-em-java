package br.com.livro.capitulo04.exercicios;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio0404{
  public static void main(String[] args){

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    int numero = Integer.parseInt(JOptionPane.showInputDialog(null,
    "Informe um numero inteiro:"));
    int quadrado = numero * numero * numero;

    JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " e "
    + quadrado);

  }
}
