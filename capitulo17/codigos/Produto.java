import java.text.NumberFormat;

public class Produto {
  private String descricao;
  private double valor;
  
  public Produto(String descricao, double valor) {
    this.descricao = descricao;
    this.valor = valor;
  }
  
 public String toString() {
   NumberFormat nf = NumberFormat.getCurrencyInstance();
   return descricao + " - " + nf.format(valor);
 }
}
