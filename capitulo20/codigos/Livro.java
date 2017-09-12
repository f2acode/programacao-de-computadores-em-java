public class Livro {
  private String autor;
  private String titulo;
  
  public String getAutor() {
    return autor;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public void setAutor(String autor) {
    this.autor = autor;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  public String toString() {
    return autor + " - " + titulo;
  }
}
