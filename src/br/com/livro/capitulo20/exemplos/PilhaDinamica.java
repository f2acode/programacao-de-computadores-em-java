package br.com.livro.capitulo20.exemplos;
public class PilhaDinamica <E>{
  private Lista<E> lista;
  
  public PilhaDinamica() {
    lista = new Lista<E>();
  }
  
  public void incluir(E objeto) {
    lista.incluirNoFim(objeto);
  }
  
  public E excluir() throws ListaVaziaException{
    return lista.excluirDoFim();
  }
  
  public E consultar() {
    return lista.getUltimo();
  }
  
  public boolean vazia() {
    return lista.vazia();
  }
}

