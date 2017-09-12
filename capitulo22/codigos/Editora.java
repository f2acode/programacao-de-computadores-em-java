public class Editora {
  private int codigo;
  private String nome;
  
  public Editora() {
    nome = "";
  }
  
  public Editora(int codigo, String nome) {
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
}
