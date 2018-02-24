package br.com.livro.capitulo17.exemplos;
import javax.swing.JOptionPane;

public class Fila {
  private int ficha;
  private String nome;
  
  public Fila(int ficha, String nome) {
    this.ficha = ficha;
    this.nome = nome;
  }
  
  public void exibirDados() {
    String st = "Ficha " + ficha + ": " + nome;
    JOptionPane.showMessageDialog(null,st,"Mensagem",1);
  }
  
  public static void main(String[] args) {
    new Fila(10,"Adriana").exibirDados();
    new Fila(11,"Rui").exibirDados();
    System.exit(0);
  }
}
