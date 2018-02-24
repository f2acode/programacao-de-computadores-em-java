package br.com.livro.capitulo13.exemplos;
public class Curso {
  private int codigo;
  private String descricao;
  
  public Curso() {
    descricao = "";
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}