package br.com.livro.capitulo20.exemplos;
public class PilhaInteiro {
  private long[] dados;
  private int topo;
  
  public PilhaInteiro(int maximo) {
    dados = new long[maximo];
    topo = -1;
  }
  
  public void incluir(long numero) {
    dados[++topo] = numero;
  }
  
  public long excluir () {
    return dados[topo--];
  }
  
  public long consultar() {
    return dados[topo];
  }
  
  public boolean vazia() {
    return (topo == -1);
  }
  
  public boolean cheia() {
    return (topo == dados.length - 1);
  }
}
