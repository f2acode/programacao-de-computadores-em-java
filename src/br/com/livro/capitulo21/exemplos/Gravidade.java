package br.com.livro.capitulo21.exemplos;
public enum Gravidade {
  MINIMA (1,"M�nima"),
  PEQUENA (2,"Pequena"),
  MEDIA (3,"M�dia"),
  ALTA (4,"Alta"),
  ALTISSIMA (5,"Alt�ssima");
  
  private int indicador;
  private String descricao;
  
  Gravidade(int indicador, String descricao) {
    this.indicador = indicador;
    this.descricao = descricao;
  }

  public int getIndicador() {
    return indicador;
  }

  public String getDescricao() {
    return descricao;
  }
}
