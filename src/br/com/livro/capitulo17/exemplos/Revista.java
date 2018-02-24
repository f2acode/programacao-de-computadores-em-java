package br.com.livro.capitulo17.exemplos;
public class Revista {
  private String titulo;
  private int numero;
  private int ano;
  private Meses mes;
  
  public Revista(String titulo, int numero, int ano, Meses mes) {
    this.titulo = titulo;
    this.numero = numero;
    this.ano = ano;
    this.mes = mes;
  }
  
  public String toString() {
    return titulo + " n� " + numero + " - " + mes.getAbreviado() + 
      " de " + ano;
  }
}
