package br.com.livro.capitulo20.exemplos;
public class FilaDinamica <E>{
  private Lista<E> lista;
  
  public FilaDinamica() {
    lista = new Lista<E>();
  }
  
  public void incluir(E objeto) {
    lista.incluirNoFim(objeto);
  }
  
  public E excluir() throws ListaVaziaException{
    return lista.excluirDoInicio();
  }
  
  public E consultar() {
    return lista.getPrimeiro();
  }
  
  public boolean vazia() {
    return lista.vazia();
  }
}