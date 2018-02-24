package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class JFCategoriaConsultar extends JFrame
  implements ActionListener {
  private JPanel pnSul;
  private JTable tbGrade;
  private JButton btConsultar;
  
  public JFCategoriaConsultar() {
    setTitle("Consultar Categoria");
    setSize(400,250);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    pnSul = new JPanel();
    tbGrade = new JTable(new DefaultTableModel());
    btConsultar = new JButton("Consultar");
    btConsultar.setMnemonic('C');
    pnSul.add(btConsultar);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(new JScrollPane(tbGrade),
      BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width-getWidth())/2, (dm.height-getHeight())/2);
    
    btConsultar.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    try {
      ConexaoComercio c = new ConexaoComercio();
      Statement stm = c.getConexao().createStatement();
      ResultSet rs = stm.executeQuery(
        "SELECT * FROM CATEGORIA ORDER BY DESCRICAO");
      
      Vector<String> colunas = new Vector<String>();
      colunas.add("C�digo");
      colunas.add("Descri��o");
      
      Vector<Object> registros = new Vector<Object>();
      while (rs.next()) {
         Vector<Object> linha = new Vector<Object>();
         linha.add( rs.getInt(1) );
         linha.add( rs.getString(2) );
         registros.add( linha );
       }
      rs.close();
      stm.close();
      
      DefaultTableModel dtm = (DefaultTableModel)tbGrade.getModel();
      dtm.setDataVector(registros, colunas);
    }
    catch (Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public static void main(String[] args) {
    new JFCategoriaConsultar().setVisible(true);
  }
}
