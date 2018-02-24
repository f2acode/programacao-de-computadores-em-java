package br.com.livro.capitulo13.exemplos;
public class Atleta {
  private String nome;
  private byte sexo;
  public static final byte SEXO_MASCULINO = 1;
  public static final byte SEXO_FEMININO = 2;
  
  public Atleta(String nome, byte sexo) {
    this.nome = nome;
    this.sexo = sexo;
  }
  
  public String toString() {
    String str = nome + " - ";
    if (sexo == SEXO_MASCULINO) str += "Masculino";
    else if (sexo == SEXO_FEMININO) str += "Feminino";
    return str;
  }
}