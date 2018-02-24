package br.com.livro.capitulo13.exemplos;
public class Computador {
  private int codigo;
  private String descricao;
  
  public Computador(int codigo, String descricao) throws Exception {
    if (codigo < 1) 
      throw new Exception("C�digo abaixo do m�nimo!");
    
    if (descricao == null) 
      throw new Exception("Descri��o nula!");
      
    descricao = descricao.trim();
    
    if (descricao.length() < 5 || descricao.length() > 50)
      throw new Exception("Descri��o inv�lida!");
      
    this.codigo = codigo;
    this.descricao = descricao;
  }
  
  public String toString() {
    return "Computador " + codigo + ": " + descricao;
  }
}