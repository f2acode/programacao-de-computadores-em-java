public class OrdenacaoInsercao {
  public static void ordenar(int[] dados, int qtde) {
    for(int out = 1; out < qtde; out++) {
      int temp = dados[out];
      int in = out;
      
      while(in > 0 && dados[in-1] >= temp) {
        dados[in] = dados[in-1]; 
        in--;
      }
      
      dados[in] = temp;
    }
  }
  
  public static void ordenar(String[] dados, int qtde) {
    for(int out = 1; out < qtde; out++) {
      String temp = dados[out];
      int in = out;
      
      while(in > 0 && dados[in-1].compareToIgnoreCase(temp) > 0) {
        dados[in] = dados[in-1]; 
        in--;
      }
      
      dados[in] = temp;
    }
  }
  
  public static <C extends Comparable<C>> void ordenar(C[] dados,
    int qtde) {
    for(int out = 1; out < qtde; out++) {
      C temp = dados[out];
      int in = out;
      
      while(in > 0 && dados[in-1].compareTo(temp) > 0) {
        dados[in] = dados[in-1]; 
        in--;
      }
      
      dados[in] = temp;
    }
  }
}
