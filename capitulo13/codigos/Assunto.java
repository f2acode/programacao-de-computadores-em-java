public class Assunto {
  private int codigo;
  private String descricao;
  
  public Assunto(int codigo, String descricao) {
    this.codigo = codigo;
    this.descricao = descricao;
  }
  
  public String toString() {
    return "Assunto " + codigo + ": " + descricao;
  }
}