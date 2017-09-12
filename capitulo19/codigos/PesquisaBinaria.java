public class PesquisaBinaria {
  public static int pesquisar(int[] dados, int qtde, int chave) {
    if (qtde == 0) return -1;
    
    int li = 0;
    int ls = qtde - 1;
    int ia;
    int indice = -1;
    
    while(li <= ls) {
      ia = (li + ls) / 2;
      if(dados[ia] == chave) { indice = ia; break; }
      else if(dados[ia] < chave) li = ia + 1;
      else ls = ia - 1;
    }
    
    return indice;
  }
  
  public static <C extends Comparable<C>> int pesquisar(C[] dados,
    int qtde, C chave) {
    if (qtde == 0) return -1;
    
    int li = 0;
    int ls = qtde - 1;
    int ia;
    int indice = -1;
    
    while(li <= ls) {
      ia = (li + ls) / 2;
      if(dados[ia].compareTo(chave) == 0) { indice = ia; break; }
      else if(dados[ia].compareTo(chave) < 0) li = ia + 1;
      else ls = ia - 1;
    }
    
    return indice;
  }
}
