package br.com.livro.capitulo13.exemplos;
public class Cliente {
  private String nome;
  private boolean inadimplente;
  
  public Cliente(String nome, boolean inadimplente) {
    this.nome = nome;
    this.inadimplente = inadimplente;
  }
  
  public String getNome() {
    return nome;
  }
  
  public boolean isInadimplente( ) {
    return inadimplente;
  }
}