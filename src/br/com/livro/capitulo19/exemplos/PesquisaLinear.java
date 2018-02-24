package br.com.livro.capitulo19.exemplos;
public class PesquisaLinear {
  public static int pesquisar(int[] dados, int qtde, int chave) {
    if (qtde == 0) return -1;
    
    int indice;
    for(indice = 0; indice < qtde; indice++)
      if(dados[indice] == chave) break;
    
    if(indice == qtde) return -1;
    else return indice;
  }
  
  public static <C extends Comparable<C>> int pesquisar(C[] dados,
    int qtde, C chave) {
    if (qtde == 0) return -1;
    
    int indice;
    for(indice = 0; indice < qtde; indice++)
      if(dados[indice].compareTo(chave) == 0) break;
    
    if(indice == qtde) return -1;
    else return indice;
  }
}
