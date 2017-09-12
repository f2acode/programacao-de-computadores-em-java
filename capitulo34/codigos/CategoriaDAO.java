import java.sql.*;
import java.util.*;

public class CategoriaDAO {
  private ConexaoComercio cc;
  
  public CategoriaDAO() throws Exception {
    cc = new ConexaoComercio();
  }
  
  public void incluir(Categoria c) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "INSERT INTO CATEGORIA (DESCRICAO) VALUES(?)",
      Statement.RETURN_GENERATED_KEYS);
    pst.setString(1, c.getDescricao());
    pst.executeUpdate();
    cc.confirmarTransacao();
    
    ResultSet rs = pst.getGeneratedKeys();
    if (rs.next()) c.setCodigo(rs.getInt(1));
    rs.close();
    pst.close();
  }
  
  public void alterar(Categoria c) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "UPDATE CATEGORIA SET DESCRICAO = ? WHERE CODIGO = ?");
    pst.setString(1, c.getDescricao());
    pst.setInt(2, c.getCodigo());
    pst.executeUpdate();
    pst.close();
    cc.confirmarTransacao();
  }
  
  public void excluir(int codigo) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "DELETE FROM CATEGORIA WHERE CODIGO = ?");
    pst.setInt(1, codigo);
    pst.executeUpdate();
    pst.close();
    cc.confirmarTransacao();
  }
  
  public ResultSet carregarGrade( ) throws Exception {
    Statement stm = cc.getConexao().createStatement();
    return stm.executeQuery(
      "SELECT * FROM CATEGORIA ORDER BY DESCRICAO");
  }
  
  public Vector<Categoria> carregarCombo( ) throws Exception {
    Statement stm = cc.getConexao().createStatement();
    ResultSet rs = stm.executeQuery(
      "SELECT * FROM CATEGORIA ORDER BY DESCRICAO");
    Vector<Categoria> v = new Vector<Categoria>();
    while(rs.next())
      v.add(new Categoria(rs.getInt("CODIGO"),
        rs.getString("DESCRICAO")));
    return v;
  }
  
  public Categoria pesquisar(int codigo) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "SELECT * FROM CATEGORIA WHERE CODIGO = ?");
    pst.setInt(1, codigo);
    ResultSet rs = pst.executeQuery();
    if (!rs.next()) return null;
    return new Categoria(rs.getInt("CODIGO"),
      rs.getString("DESCRICAO"));
  }
  
  public Categoria pesquisar(String codigo) throws Exception {
    return pesquisar(Integer.parseInt(codigo));
  }
}
