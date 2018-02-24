package br.com.livro.capitulo09.exemplos;
import javax.swing.JOptionPane;

public class Notas {
  public static void main(String[] args) {
    int nr_alunos = 0;
    while(nr_alunos <= 0) {
      String str = "N�mero de alunos";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      nr_alunos = Integer.parseInt(str);
    }
    
    int nr_notas = 0;
    while(nr_notas <= 0) {
      String str = "N�mero de notas";
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) System.exit(0);
      nr_notas = Integer.parseInt(str);
    }
    
    double[][] notas = new double[nr_alunos][nr_notas];
    
    for (int lin = 0; lin < notas.length; lin++)
      for (int col = 0; col < notas[lin].length; col++)
        notas[lin][col] = -1;
    
    String str = "";
    for (int lin = 0; lin < notas.length; lin++) {
      for (int col = 0; col < notas[lin].length; col++) {
        while (true) {
          str = "Aluno " + (lin + 1) + ": nota " + (col + 1);
          str = JOptionPane.showInputDialog(null,str);
          if (str == null) break;
          double n = Double.parseDouble(str);
          if (n >= 0 && n <= 10) {
            notas[lin][col] = n;
            break;
          }
        }
        if (str == null) break;
      }
      if (str == null) break;
    }
    
    str = "Quadro de notas:";
    for (int lin = 0; lin < notas.length; lin++) {
      if (notas[lin][nr_notas - 1] == -1) break;
      double soma = 0;
      str += "\nAluno " + (lin + 1) + ":   ";
      for (int col = 0; col < notas[lin].length; col++) {
        soma += notas[lin][col];
        str += notas[lin][col] + "  ";
      }
      str += "   =   " + (soma / nr_notas);
    }
    
    JOptionPane.showMessageDialog(null,str);
    System.exit(0);
  }
}