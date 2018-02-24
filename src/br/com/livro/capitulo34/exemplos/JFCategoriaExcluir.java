package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;

public class JFCategoriaExcluir extends JFrame 
  implements ActionListener {
  private JPanel pnSul;
  private JFormattedTextField tfCodigo;
  private JButton btExcluir;
  
  public JFCategoriaExcluir() {
    setTitle("Excluir Categoria");
    setSize(250,100);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    pnSul = new JPanel();
    tfCodigo = new JFormattedTextField(new Integer(0));
    btExcluir = new JButton("Excluir");
    btExcluir.setMnemonic('E');
    pnSul.add(btExcluir);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(tfCodigo,BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width-getWidth())/2,(dm.height-getHeight())/2);
    
    btExcluir.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    try {
      ConexaoComercio c = new ConexaoComercio();
      PreparedStatement pst = c.getConexao().prepareStatement(
        "DELETE FROM CATEGORIA WHERE CODIGO = ?");
      pst.setInt(1, Integer.parseInt( tfCodigo.getText() ));
      pst.executeUpdate();
      c.confirmarTransacao();
      
      if (pst.getUpdateCount() == 0) {
        showMessageDialog(this, "Registro n�o existe!","Erro",
          ERROR_MESSAGE);
        return;
      }
      pst.close();
      
      showMessageDialog(this, "Registro exclu�do!");
      tfCodigo.setValue(null);
      tfCodigo.requestFocus();
    } catch (Exception ex) {
      showMessageDialog(this, ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public static void main(String[] args) {
    new JFCategoriaExcluir().setVisible(true);
  }
}