public class PilhaGenerica <E>{
  private E[] objetos;
  private int topo;
  
  public PilhaGenerica(int maximo) {
    objetos = (E[])new Object[maximo];
    topo = -1;
  }
  
  public void incluir(E objeto) {
    objetos[++topo] = objeto;
  }
  
  public E excluir () {
    return objetos[topo--];
  }
  
  public E consultar() {
    return objetos[topo];
  }
  
  public boolean vazia() {
    return (topo == -1);
  }
  
  public boolean cheia() {
    return (topo == objetos.length - 1);
  }
}

