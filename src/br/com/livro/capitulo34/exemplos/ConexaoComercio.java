package br.com.livro.capitulo34.exemplos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComercio {
  private static Connection conexao;
  
  public ConexaoComercio() throws Exception {
    try{
      if (conexao != null && !conexao.isClosed()) return;
      Class.forName("com.mysql.jdbc.Driver");
      conexao = DriverManager.getConnection(
        "jdbc:mysql://localhost/comercio","root","root");
      conexao.setAutoCommit(false);
      conexao.setTransactionIsolation(
        Connection.TRANSACTION_READ_COMMITTED);
    }
    catch(ClassNotFoundException cnf) { 
      throw new Exception("Driver n�o encontrado!");
    }
    catch(SQLException sql) {
      throw new Exception("Falha ocorrida: " + sql.getMessage());
    }
  }
  
  public Connection getConexao() {
    return conexao;
  }
  
  public void fechar() throws Exception {
    try{
      if (conexao == null || conexao.isClosed()) return;
      conexao.close();
    }
    catch(SQLException sql) {
      throw new Exception("Falha ocorrida: " + sql.getMessage());
    }
  }
  
  public void confirmarTransacao() throws Exception {
    try{
      if (conexao == null || conexao.isClosed()) return;
      conexao.commit();
    }
    catch(SQLException sql) {
      throw new Exception("Falha ocorrida: " + sql.getMessage());
    }
  }
  
  public void cancelarTransacao() throws Exception {
    try{
      if (conexao == null || conexao.isClosed()) return;
      conexao.rollback();
    }
    catch(SQLException sql) {
      throw new Exception("Falha ocorrida: " + sql.getMessage());
    }
  }
}
