package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JFCategoriaIncluir extends JFrame
  implements ActionListener {
  private JPanel pnSul;
  private JTextField tfDescricao;
  private JButton btGravar;
  
  public JFCategoriaIncluir() {
    setTitle("Incluir Categoria");
    setSize(300,100);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    pnSul = new JPanel();
    tfDescricao = new JTextField();
    btGravar = new JButton("Gravar");
    btGravar.setMnemonic('G');
    pnSul.add(btGravar);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(tfDescricao,BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width-getWidth())/2, (dm.height-getHeight())/2);
    
    btGravar.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    try {
      ConexaoComercio cc = new ConexaoComercio();
      PreparedStatement pst = cc.getConexao().prepareStatement(
        "INSERT INTO CATEGORIA (DESCRICAO) VALUES(?)",
        Statement.RETURN_GENERATED_KEYS);
      pst.setString(1, tfDescricao.getText());
      pst.executeUpdate();
      cc.confirmarTransacao();
      
      ResultSet rs = pst.getGeneratedKeys();
      rs.next();
      showMessageDialog(this, "Registro gravado: " + rs.getInt(1) +
        " - " + tfDescricao.getText());
      rs.close();
      pst.close();
      
      tfDescricao.setText("");
      tfDescricao.requestFocus();
    } catch (Exception ex) {
      showMessageDialog(this, ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public static void main(String[] args) {
    new JFCategoriaIncluir().setVisible(true);
  }
}
