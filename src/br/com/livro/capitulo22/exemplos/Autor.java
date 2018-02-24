package br.com.livro.capitulo22.exemplos;
public class Autor implements Comparable<Autor> {
  private int codigo;
  private String nome;
  
  public Autor() {
    nome = "";
  }
  
  public Autor(int codigo, String nome) {
    setCodigo(codigo);
    setNome(nome);
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String toString() {
    return codigo + " - " + nome;
  }
  
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    if (this == obj) return true;
    
    final Autor outro = (Autor) obj;
    if (codigo != outro.codigo) return false;
    return true;
  }
  
  public int hashCode() {
    return 31 + codigo;
  }

  public int compareTo(Autor outro) {
    return this.nome.compareToIgnoreCase(outro.nome);
  }
}
