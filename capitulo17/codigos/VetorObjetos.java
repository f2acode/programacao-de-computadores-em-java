public class VetorObjetos <E> {
  private E[] objetos;
  private int quantidade;
  
  public VetorObjetos(int maximo) {
    objetos = (E[])new Object[maximo];
  }
  
  public void incluirObjeto(E objeto) {
    objetos[quantidade++] = objeto; 
  }
  
  public E excluirUltimo() {
    E elemento = objetos[--quantidade];
    objetos[quantidade] = null;
    return elemento;
  }
  
  public void excluirTodos() {
    while(quantidade > 0) 
      objetos[--quantidade] = null;
  }
  
  public E verUltimo() {
    return objetos[quantidade - 1];
  }
  
  public String listarObjetos() {
    String str = "";
    for (E elemento : objetos) {
      if (elemento == null) break;
      str += "\n" + elemento;
    }
    return str;
  }
  
  public boolean cheio() {
    return objetos.length == quantidade;
  }
  
  public boolean vazio() {
    return quantidade == 0;
  }
}
