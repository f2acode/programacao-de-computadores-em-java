package br.com.livro.capitulo21.exemplos;
public class Contato {
  private String nome;
  private String email;
  
  public Contato() {
    nome ="";
    email ="";
  }
  
  public Contato(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return nome + " - " + email;
  }

  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    if (this == obj) return true;
    
    final Contato other = (Contato) obj;
    if (nome == null && other.nome != null) return false;
    if (nome != null && other.nome == null) return false;
    if (!nome.equals(other.nome)) return false;
    return true;
  }
  
  public int hashCode() {
    return 31 + ((nome == null) ? 0 : nome.hashCode());
  }
}
