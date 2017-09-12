public class OrdenacaoTroca {
  public static void ordenar(int[] dados, int qtde) {
    for(int out = qtde - 1; out > 0; out--)
      for(int in = 0; in < out; in++)
        if(dados[in] > dados[in+1]) {
          int temp = dados[in];
          dados[in] = dados[in+1];
          dados[in+1] = temp;
        }
  }
  
  public static void ordenar(String[] dados, int qtde) {
    for(int out = qtde - 1; out > 0; out--)
      for(int in = 0; in < out; in++)
        if(dados[in].compareToIgnoreCase(dados[in+1]) > 0 ) {
          String temp = dados[in];
          dados[in] = dados[in+1];
          dados[in+1] = temp;
        }
  }
  
  public static <C extends Comparable<C>> void ordenar(C[] dados,
    int qtde) {
    for(int out = qtde - 1; out > 0; out--)
      for(int in = 0; in < out; in++)
        if(dados[in].compareTo(dados[in+1]) > 0 ) {
          C temp = dados[in];
          dados[in] = dados[in+1];
          dados[in+1] = temp;
        }
  }
}