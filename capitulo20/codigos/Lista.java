public class Lista <E>{
  private Nodo<E> primeiro;
  private Nodo<E> ultimo;
  
  public E getPrimeiro() {
    return primeiro.getObjeto();
  }
  
  public E getUltimo() {
    return ultimo.getObjeto();
  }
  
  public void incluirNoFim(E objeto) {
    Nodo<E> novo_nodo = new Nodo<E>(objeto);
    if (vazia()) primeiro = ultimo = novo_nodo;
    else {
      ultimo.setProximo(novo_nodo);
      novo_nodo.setAnterior(ultimo);
      ultimo = novo_nodo;
    }
  }
  
  public void incluirNoInicio(E objeto) {
    Nodo<E> novo_nodo = new Nodo<E>(objeto);
    if (vazia()) primeiro = ultimo = novo_nodo;
    else {
      novo_nodo.setProximo(primeiro);
      primeiro.setAnterior(novo_nodo);
      primeiro = novo_nodo;
    }
  }
  
  public E excluirDoInicio() throws ListaVaziaException {
    if (vazia()) throw new ListaVaziaException();
    E objeto_excluido = primeiro.getObjeto();
    
    if (primeiro == ultimo) primeiro = ultimo = null;
    else primeiro = primeiro.getProximo();
    
    return objeto_excluido;
  }
  
  public E excluirDoFim() throws ListaVaziaException {
    if (vazia()) throw new ListaVaziaException();
    E objeto_excluido = ultimo.getObjeto();
    
    if (primeiro == ultimo) primeiro = ultimo = null;
    else ultimo = ultimo.getAnterior();
    
    return objeto_excluido;
  }
  
  public boolean vazia() {
    return primeiro == null;
  }
}
