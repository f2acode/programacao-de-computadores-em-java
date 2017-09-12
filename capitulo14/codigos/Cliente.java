public class Cliente {
  private String nome;
  private String fone;
  
  public Cliente() {
    this("Sem nome","(00)0000-0000");
  }
  
  public Cliente(String nome, String fone) {
    this.nome = nome;
    this.fone = fone;
  }
  
  public String getNome() {
    return nome;
  }
  
  public String getFone() {
    return fone;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setFone(String fone) {
    this.fone = fone;
  }
}
