public class Item {
  private int idPedido;
  private int idProduto;
  private int quantidade;
  private double unitario;
  
  public Item() {
    this(0,0,0,0);
  }
  
  public Item(int idPedido, int idProduto, int quantidade,
    double unitario) {
    setIdProduto(idProduto);
    setQuantidade(quantidade);
    setUnitario(unitario);
  }

  public int getIdPedido() {
    return idPedido;
  }

  public int getIdProduto() {
    return idProduto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public double getUnitario() {
    return unitario;
  }

  public void setIdPedido(int idPedido) {
    this.idPedido = idPedido;
  }

  public void setIdPedido(String idPedido) {
    this.idPedido = Integer.parseInt(idPedido);
  }

  public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
  }

  public void setIdProduto(String idProduto) {
    this.idProduto = Integer.parseInt(idProduto);
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public void setQuantidade(String quantidade) {
    this.quantidade = Integer.parseInt(quantidade);
  }

  public void setUnitario(double unitario) {
    this.unitario = unitario;
  }
  
  public void setUnitario(String unitario) {
    this.unitario = Double.parseDouble(unitario);
  }

  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) return false;
    if (this == obj) return true;
    final Item outro = (Item)obj;
    if (idProduto == outro.idProduto) return true;
    else return false;
  }
  
  public int hashCode() {
    return 31 + idProduto;
  }
}
