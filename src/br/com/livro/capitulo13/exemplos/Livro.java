package br.com.livro.capitulo13.exemplos;
public class Livro {
  private int codigo;
  private String titulo;
  
  public Livro() {
    titulo = "";
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public void setCodigo(int codigo) throws IllegalArgumentException{
    if (codigo < 1)
      throw new IllegalArgumentException("C�digo inv�lido!");
      
    this.codigo = codigo;
  }
  
  public void setTitulo(String titulo) 
    throws NullPointerException, IllegalArgumentException{
    if (titulo == null) 
      throw new NullPointerException("O t�tulo n�o pode ser nulo!");
      
    titulo = titulo.trim();
    
    if (titulo.length() < 5 || titulo.length() > 50)
      throw new IllegalArgumentException("T�tulo inv�lido!");
      
    this.titulo = titulo;
  }
}