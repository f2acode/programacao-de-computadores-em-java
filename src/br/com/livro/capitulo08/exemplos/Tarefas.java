package br.com.livro.capitulo08.exemplos;
import javax.swing.JOptionPane;

public class Tarefas {
  public static void main(String[] args) {
    String tarefas = "Lista de tarefas:";
    for (int numero = 1; numero <= 10; numero++) {
      String str = "Tarefa n�mero " + numero;
      str = JOptionPane.showInputDialog(null,str);
      if (str == null) break;
      str = str.trim();
      tarefas += "\nTarefa " + numero + ": " + str;
    }
    
    JOptionPane.showMessageDialog(null,tarefas);
    System.exit(0);
  }
}