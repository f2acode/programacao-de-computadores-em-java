import static javax.swing.JOptionPane.*;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.*;

public class IFCliente extends IFCadastro {
  private JFormattedTextField tfCpf;
  private JFormattedTextField tfNascimento;
  
  public IFCliente() {
    super("Cadastro de clientes",300,4);
    
    try {
      MaskFormatter fmtCpf = new MaskFormatter("###.###.###-##");
      fmtCpf.setPlaceholderCharacter('_');
      MaskFormatter fmtData = new MaskFormatter("##/##/####");
      fmtData.setPlaceholderCharacter('_');
      
      tfCpf = new JFormattedTextField(fmtCpf);
      tfNascimento = new JFormattedTextField(fmtData);
    }
    catch(ParseException pe) {}
    
    ((JLabel)pnRotulos.getComponent(1)).setText("Nome");
    pnRotulos.add(new JLabel(" CPF: "));
    pnRotulos.add(new JLabel(" Nascimento: "));
    pnCampos.add(tfCpf);
    pnCampos.add(tfNascimento);
  }
  
  public void atualizarGrade() {
    try {
      ResultSet rs = new ClienteDAO().carregarGrade();
      tbDados.setModel(new ModeloGrade(rs,new String[]{"C�digo",
        "Nome"}));
      tbDados.getColumnModel().getColumn(0).setMaxWidth(50);
    }
    catch (Exception e) {
      showMessageDialog(this, e.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void incluir() {
    Cliente c = new Cliente();
    c.setNome(tfDesc.getText());
    c.setCpf(tfCpf.getText());
    c.setNascimento(tfNascimento.getText());
    
    try {
      new ClienteDAO().incluir(c);
      atualizarGrade();
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void alterar() {
    Cliente c = new Cliente();
    c.setCodigo(tfCodigo.getText());
    c.setNome(tfDesc.getText());
    c.setCpf(tfCpf.getText());
    c.setNascimento(tfNascimento.getText());
    
    try {
      new ClienteDAO().alterar(c);
      atualizarGrade();
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void excluir() {
    try {
      new ClienteDAO().excluir(Integer.parseInt(tfCodigo.getText()));
      ModeloGrade dtm = (ModeloGrade)tbDados.getModel();
      dtm.removeRow(tbDados.getSelectedRow());
      tpAbas.setSelectedIndex(0);
    }
    catch(Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  protected void carregarRegistro(String codigo) throws Exception{
    Cliente c = new ClienteDAO().pesquisar(codigo);
    tfCodigo.setText(String.valueOf(c.getCodigo()));
    tfDesc.setText(c.getNome());
    tfCpf.setText(c.getCpf());
    tfNascimento.setText(c.getNascimentoFmt());
  }
}
