package br.com.livro.capitulo34.exemplos;
import java.sql.*;

public class ItemDAO {
  private ConexaoComercio cc;
  
  public ItemDAO() throws Exception {
    cc = new ConexaoComercio();
  }
  
  public void incluir(Item item) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "INSERT INTO ITEM VALUES(?,?,?,?)");
    pst.setInt(1, item.getIdPedido());
    pst.setInt(2, item.getIdProduto());
    pst.setInt(3, item.getQuantidade());
    pst.setDouble(4, item.getUnitario());
    pst.executeUpdate();
    pst.close();
  }
}
