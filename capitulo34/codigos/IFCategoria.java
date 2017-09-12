import static javax.swing.JOptionPane.*;
import java.sql.*;

public class IFCategoria extends IFCadastro {
  public IFCategoria() {
    super("Cadastro de categorias",300,2);
  }
  
  protected void atualizarGrade() {
    try {
      ResultSet rs = new CategoriaDAO().carregarGrade();
      tbDados.setModel( new ModeloGrade(rs,
        new String[]{"C�digo","Descricao"}));
      tbDados.getColumnModel().getColumn(0).setMaxWidth(50);
    }
    catch (Exception e) {
      showMessageDialog(this, e.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  protected void incluir() {
    Categoria c = new Categoria();
    c.setDescricao(tfDesc.getText());
    
    try {
      new CategoriaDAO().incluir(c);
      atualizarGrade();
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  protected void alterar() {
    Categoria c = new Categoria();
    c.setCodigo(tfCodigo.getText());
    c.setDescricao(tfDesc.getText());
    
    try {
      new CategoriaDAO().alterar(c);
      atualizarGrade();
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  protected void excluir() {
    try {
      int codigo = Integer.parseInt(tfCodigo.getText());
      new CategoriaDAO().excluir(codigo);
      ModeloGrade dtm = (ModeloGrade)tbDados.getModel();
      dtm.removeRow(tbDados.getSelectedRow());
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  protected void carregarRegistro(String codigo) throws Exception {
    Categoria c = new CategoriaDAO().pesquisar(codigo);
    tfCodigo.setText(String.valueOf(c.getCodigo()));
    tfDesc.setText(c.getDescricao());
  }
}
