package br.com.livro.capitulo19.exemplos;
public class OrdenacaoSelecao {
  public static void ordenar(int[] dados, int qtde) {
    for(int out = 0; out < qtde - 1; out++) {
      int min = out;
      
      for(int in = out + 1; in < qtde; in++)
        if(dados[in] < dados[min] )
          min = in;
      
      int temp = dados[out];
      dados[out] = dados[min];
      dados[min] = temp;
    }
  }
  
  public static void ordenar(String[] dados, int qtde) {
    for(int out = 0; out < qtde - 1; out++) {
      int min = out;
      
      for(int in = out + 1; in < qtde; in++)
        if(dados[in].compareToIgnoreCase(dados[min]) > 0)
          min = in;
     
      String temp = dados[out];
      dados[out] = dados[min];
      dados[min] = temp;
    }
  }
  
  public static <C extends Comparable<C>> void ordenar(C[] dados,
    int qtde) {
    for(int out = 0; out < qtde - 1; out++) {
      int min = out;
      
      for(int in = out + 1; in < qtde; in++)
        if(dados[in].compareTo(dados[min]) > 0)
          min = in;
     
      C temp = dados[out];
      dados[out] = dados[min];
      dados[min] = temp;
    }
  }
}
