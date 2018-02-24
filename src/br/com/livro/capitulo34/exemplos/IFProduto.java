package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.sql.*;
import javax.swing.*;

public class IFProduto extends IFCadastro {
  private JFormattedTextField tfPreco;
  private JComboBox<Categoria> coCategoria;
  
  public IFProduto() {
    super("Cadastro de produtos",300,4);
    
    tfPreco = new JFormattedTextField(new Double(0));
    coCategoria = new JComboBox<Categoria>();
    
    pnRotulos.add(new JLabel(" Pre�o: "));
    pnRotulos.add(new JLabel(" Categoria: "));
    pnCampos.add(tfPreco);
    pnCampos.add(coCategoria);
    
    try {
      coCategoria.setModel(new DefaultComboBoxModel<Categoria>(
        new CategoriaDAO().carregarCombo()));
    }
    catch (Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void atualizarGrade() {
    try {
      ResultSet rs = new ProdutoDAO().carregarGrade();
      tbDados.setModel(new ModeloGrade(rs,new String[]{"C�digo",
        "Descri��o"}));
      tbDados.getColumnModel().getColumn(0).setMaxWidth(50);
    }
    catch (Exception e) {
      showMessageDialog(this, e.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void incluir() {
    Produto p = new Produto();
    p.setDescricao(tfDesc.getText());
    p.setPreco(tfPreco.getText());
    Categoria categoria = (Categoria)coCategoria.getSelectedItem();
    p.setIdCategoria(categoria.getCodigo());
    
    try {
      new ProdutoDAO().incluir(p);
      atualizarGrade();
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void alterar() {
    Produto p = new Produto();
    p.setCodigo(tfCodigo.getText());
    p.setDescricao(tfDesc.getText());
    p.setPreco(tfPreco.getText());
    Categoria categoria = (Categoria)coCategoria.getSelectedItem();
    p.setIdCategoria(categoria.getCodigo());
    
    try {
      new ProdutoDAO().alterar(p);
      atualizarGrade();
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void excluir() {
    try {
      new ProdutoDAO().excluir(Integer.parseInt(tfCodigo.getText()));
      ModeloGrade dtm = (ModeloGrade)tbDados.getModel();
      dtm.removeRow(tbDados.getSelectedRow());
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  protected void carregarRegistro(String codigo) throws Exception {
    Produto p = new ProdutoDAO().pesquisar(codigo);
    tfCodigo.setText(String.valueOf(p.getCodigo()));
    tfDesc.setText(p.getDescricao());
    tfPreco.setText(p.getPrecoFmt());
    coCategoria.setSelectedItem(new CategoriaDAO().pesquisar(
      p.getIdCategoria()));
  }
}
