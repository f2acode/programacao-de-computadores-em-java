package br.com.livro.capitulo34.exemplos;
import java.sql.*;

public class PedidoDAO {
  private ConexaoComercio cc;
  
  public PedidoDAO() throws Exception {
    cc = new ConexaoComercio();
  }
  
  public void incluir(Pedido p) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "INSERT INTO PEDIDO(DATA,HORARIO,ID_CLIENTE,STATUS) " +
      "VALUES(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
    pst.setDate(1,new java.sql.Date(new java.util.Date().getTime()));
    pst.setTime(2,new java.sql.Time(new java.util.Date().getTime()));
    pst.setInt(3,p.getIdCliente());
    pst.setString(4,String.valueOf(p.getStatus()));
    pst.executeUpdate();
    
    ResultSet rs = pst.getGeneratedKeys();
    if (rs.next()) p.setNumero(rs.getInt(1));
    rs.close();
    pst.close();
    
    for (Item i : p.getItens()) {
      i.setIdPedido(p.getNumero());
      new ItemDAO().incluir(i);
    }
    
    cc.confirmarTransacao();
  }
}
