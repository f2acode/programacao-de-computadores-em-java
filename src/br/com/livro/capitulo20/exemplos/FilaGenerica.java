package br.com.livro.capitulo20.exemplos;
public class FilaGenerica <E>{
  private E[] objetos;
  private int frente;
  private int fim;
  private int nItens;
  
  public FilaGenerica(int maximo) {
    objetos = (E[])new Object[maximo];
    frente = 0;
    fim = -1;
    nItens = 0;
  }
  
  public void incluir(E objeto) {
    if (fim == objetos.length - 1) fim = -1;
    objetos[++fim] = objeto;
    nItens++;
  }
  
  public E excluir () {
    E temp = objetos[frente++];
    if (frente == objetos.length) frente = 0;
    nItens--;
    return temp;
  }
  
  public E consultar() {
    return objetos[frente];
  }
  
  public boolean vazia() {
    return (nItens == 0);
  }
  
  public boolean cheia() {
    return (nItens == objetos.length);
  }
  
  public int tamanho() {
    return nItens;
  }
}