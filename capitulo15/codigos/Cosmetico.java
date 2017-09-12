public class Cosmetico extends Produto {
  public double calcularIcms() {
    return super.getPreco() * 0.25;
  }
}
