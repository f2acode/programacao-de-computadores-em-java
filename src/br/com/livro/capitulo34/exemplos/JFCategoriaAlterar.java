package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;

public class JFCategoriaAlterar extends JFrame 
  implements ActionListener {
  private JPanel pnSul;
  private JPanel pnOeste;
  private JPanel pnCentro;
  private JFormattedTextField tfCodigo;
  private JTextField tfDescricao;
  private JButton btAlterar;
  
  public JFCategoriaAlterar() {
    setTitle("Alterar Categoria");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    pnSul = new JPanel();
    pnOeste = new JPanel();
    pnCentro = new JPanel();
    tfCodigo = new JFormattedTextField(new Integer(0));
    tfDescricao = new JTextField();
    btAlterar = new JButton("Alterar");
    
    btAlterar.setMnemonic('A');
    
    pnOeste.setLayout(new GridLayout(2,1));
    pnOeste.add(new JLabel("C�digo: "));
    pnOeste.add(new JLabel("Descri��o: "));
    pnCentro.setLayout(new GridLayout(2,1));
    pnCentro.add(tfCodigo);
    pnCentro.add(tfDescricao);
    pnSul.add(btAlterar);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(pnOeste,BorderLayout.WEST);
    getContentPane().add(pnCentro,BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width-getWidth())/2, (dm.height-getHeight())/2);
    
    btAlterar.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    try {
      ConexaoComercio c = new ConexaoComercio();
      PreparedStatement pst = c.getConexao().prepareStatement(
        "UPDATE CATEGORIA SET DESCRICAO = ? WHERE CODIGO = ?");
      pst.setString(1, tfDescricao.getText());
      pst.setInt(2, Integer.parseInt(tfCodigo.getText()) );
      pst.executeUpdate();
      c.confirmarTransacao();
      
      if (pst.getUpdateCount() == 0) {
        showMessageDialog(this, "Registro n�o existe!","Erro",
          ERROR_MESSAGE);
        return;
      }
      pst.close();
      
      showMessageDialog(this, "Registro alterado!");
      tfCodigo.setValue(null);
      tfDescricao.setText("");
      tfCodigo.requestFocus();
    } catch (Exception ex) {
      showMessageDialog(this, ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public static void main(String[] args) {
    new JFCategoriaAlterar().setVisible(true);
  }
}
