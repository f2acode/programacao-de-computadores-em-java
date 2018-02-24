package br.com.livro.capitulo34.exemplos;
import java.sql.*;
import java.util.Vector;

public class ClienteDAO {
  private ConexaoComercio cc;
  
  public ClienteDAO() throws Exception {
    cc = new ConexaoComercio();
  }
  
  public void incluir(Cliente c) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "INSERT INTO CLIENTE (NOME,CPF,NASCIMENTO) VALUES(?,?,?)",
      Statement.RETURN_GENERATED_KEYS);
    pst.setString(1, c.getNome());
    pst.setString(2, c.getCpf());
    pst.setDate(3, new Date(c.getNascimento().getTime()));
    pst.executeUpdate();
    cc.confirmarTransacao();
    
    ResultSet rs = pst.getGeneratedKeys();
    if (rs.next()) c.setCodigo(rs.getInt(1));
    rs.close();
    pst.close();
  }
  
  public void alterar(Cliente c) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "UPDATE CLIENTE SET NOME = ?, CPF = ?, NASCIMENTO = ? " +
      "WHERE CODIGO = ?");
    pst.setString(1, c.getNome());
    pst.setString(2, c.getCpf());
    pst.setDate(3, new Date(c.getNascimento().getTime()));
    pst.setInt(4, c.getCodigo());
    pst.executeUpdate();
    pst.close();
    cc.confirmarTransacao();
  }
  
  public void excluir(int codigo) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
      "DELETE FROM CLIENTE WHERE CODIGO = ?");
    pst.setInt(1, codigo);
    pst.executeUpdate();
    pst.close();
    cc.confirmarTransacao();
  }
  
  public ResultSet carregarGrade( ) throws Exception {
    Statement stm = cc.getConexao().createStatement();
    return stm.executeQuery(
      "SELECT CODIGO,NOME FROM CLIENTE ORDER BY NOME");
  }
  
  public Vector<Cliente> carregarCombo( ) throws Exception {
    Statement stm = cc.getConexao().createStatement();
    ResultSet rs = stm.executeQuery(
      "SELECT CODIGO,NOME FROM CLIENTE ORDER BY NOME");
    Vector<Cliente> v = new Vector<Cliente>();
    while(rs.next())
      v.add(new Cliente(rs.getInt("CODIGO"),rs.getString("NOME")));
    return v;
  }
  
  public Cliente pesquisar(int codigo) throws Exception {
    PreparedStatement pst = cc.getConexao().prepareStatement(
        "SELECT * FROM CLIENTE WHERE CODIGO = ?");
    pst.setInt(1, codigo);
    ResultSet rs = pst.executeQuery();
    if (!rs.next()) return null;
    return new Cliente(rs.getInt("CODIGO"),rs.getString("NOME"),
        rs.getString("CPF"),rs.getDate("NASCIMENTO"));
  }
  
  public Cliente pesquisar(String codigo) throws Exception {
    return pesquisar(Integer.parseInt(codigo));
  }
}
