package br.com.livro.capitulo19.exemplos;
public class Atleta implements Comparable<Atleta>{
  private int numero;
  private String nome;
  
  public Atleta() {
    nome = "";
  }
  
  public int getNumero() {
    return numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNumero(int numero) throws Exception {
    if (numero <= 0)
      throw new Exception("N�mero inv�lido!");
    
    this.numero = numero;
  }

  public void setNumero(String numero) throws Exception {
    try {
      setNumero( Integer.parseInt(numero) );
    }
    catch(NumberFormatException ex) {
      throw new Exception("N�mero inv�lido!");
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int compareTo(Atleta atleta) {
    if (this.numero < atleta.numero) return -1;
    else if (this.numero > atleta.numero) return 1;
    else return 0;
  }
  
  public String toString() {
    return numero + " - " + nome;
  }
}
