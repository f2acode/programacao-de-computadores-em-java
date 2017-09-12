public class Paciente implements Comparable<Paciente>{
  private int ficha;
  private String nome;
  private Gravidade gravidade;
  
  public void setFicha(int ficha) {
    this.ficha = ficha;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setGravidade(Gravidade gravidade) {
    this.gravidade = gravidade;
  }
  
  public String toString() {
    return "Ficha n� " + ficha + ": " + nome + 
      " (Gravidade " + gravidade.getDescricao() + ")"; 
  }

  public int compareTo(Paciente outro) {
    if (this.gravidade == outro.gravidade) 
      return this.ficha - outro.ficha;
    else return outro.gravidade.getIndicador() - 
      this.gravidade.getIndicador();
  }
}
