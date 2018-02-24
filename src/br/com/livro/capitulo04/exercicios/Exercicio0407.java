package br.com.livro.capitulo04.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0407{
  public static void main(String[] args){

    char caractere = JOptionPane.showInputDialog(null,
    "Informe um caractere:").charAt(0);

    int numeroCaractere = (int)caractere + 1;
    char proximoCaractere = (char)numeroCaractere;

    JOptionPane.showMessageDialog(null, "Proximo caractere: "
    + String.valueOf(proximoCaractere));

  }
}
