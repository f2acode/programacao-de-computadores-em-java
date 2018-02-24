package br.com.livro.capitulo20.exemplos;
public class Nodo <E>{
  private E objeto;
  private Nodo<E> anterior;
  private Nodo<E> proximo;
  
  public Nodo(E objeto) {
    this.objeto = objeto;
  }
  
  public E getObjeto() {
    return objeto;
  }
  
  public Nodo<E> getAnterior() {
    return anterior;
  }
  
  public Nodo<E> getProximo() {
    return proximo;
  }
  
  public void setAnterior(Nodo<E> anterior) {
    this.anterior = anterior;
  }
  
  public void setProximo(Nodo<E> proximo) {
    this.proximo = proximo;
  }
}
