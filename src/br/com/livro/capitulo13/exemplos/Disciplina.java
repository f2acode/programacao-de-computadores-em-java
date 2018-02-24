package br.com.livro.capitulo13.exemplos;
public class Disciplina {
  private int codigo;
  private String descricao;
  
  public Disciplina() {
    descricao = "";
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public void setCodigo(int codigo) {
    if (codigo < 1) return;
    this.codigo = codigo;
  }
  
  public void setDescricao(String descricao) {
    if (descricao == null) return;
    descricao = descricao.trim();
    if (descricao.length() < 5 || descricao.length() > 50) return;
    this.descricao = descricao;
  }
}