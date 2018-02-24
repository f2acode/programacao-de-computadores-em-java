package br.com.livro.capitulo13.exemplos;
public class Doenca {
  private int codigo;
  private String descricao;
  private static int quantidade;
  
  public Doenca(int codigo, String descricao) {
    this.codigo = codigo;
    this.descricao = descricao;
    quantidade++;
  }
  
  public static int getQuantidade() {
    return quantidade;
  }
  
  public String toString() {
    return "Doen�a " + codigo + ": " + descricao;
  }
}