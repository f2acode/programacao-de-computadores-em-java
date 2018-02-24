package br.com.livro.capitulo20.exemplos;
public class FilaInteiro {
  private long[] dados;
  private int frente;
  private int fim;
  private int nItens;
  
  public FilaInteiro(int maximo) {
    dados = new long[maximo];
    frente = 0;
    fim = -1;
    nItens = 0;
  }
  
  public void incluir(long numero) {
    if (fim == dados.length - 1) fim = -1;
    dados[++fim] = numero;
    nItens++;
  }
  
  public long excluir () {
    long temp = dados[frente++];
    if (frente == dados.length) frente = 0;
    nItens--;
    return temp;
  }
  
  public long consultar() {
    return dados[frente];
  }
  
  public boolean vazia() {
    return (nItens == 0);
  }
  
  public boolean cheia() {
    return (nItens == dados.length);
  }
  
  public int tamanho() {
    return nItens;
  }
}
