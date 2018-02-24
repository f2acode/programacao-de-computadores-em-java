package br.com.livro.capitulo22.exemplos;
public class Capitulo implements Comparable<Capitulo>{
  private int numero;
  private String titulo;
  
  public Capitulo() {
    titulo = "";
  }
  
  public Capitulo(int numero, String titulo) {
    setNumero(numero);
    setTitulo(titulo);
  }
  
  public int getNumero() {
    return numero;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  public String toString() {
    return numero + ") " + titulo;
  }
  
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    if (this == obj) return true;
    
    final Capitulo outro = (Capitulo) obj;
    if (numero != outro.numero) return false;
    return true;
  }
  
  public int hashCode() {
    return 31 + numero;
  }

  public int compareTo(Capitulo outro) {
    return this.numero - outro.numero;
  }
}
