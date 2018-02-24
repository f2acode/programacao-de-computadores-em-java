package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;

public class DBExplorer extends JFrame
  implements ListSelectionListener, ItemListener, ActionListener {
  private JList<String> liBancos;
  private JComboBox<String> coTabs;
  private JComboBox<String> coCpos;
  private JButton btConsultar;
  private JTable tbGrade;
  private JPanel pnCombos;
  private JPanel pnCentro;
  private Connection conexao;
  
  public DBExplorer() {
    setTitle("DBExplorer");
    setSize(750,250);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    liBancos = new JList<String>(new DefaultListModel<String>());
    liBancos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    coTabs=new JComboBox<String>(new DefaultComboBoxModel<String>());
    coCpos=new JComboBox<String>(new DefaultComboBoxModel<String>());
    
    btConsultar = new JButton("Consultar");
    btConsultar.setMnemonic('C');
    
    tbGrade = new JTable(new ModeloGrade());
    
    pnCombos = new JPanel(new FlowLayout(FlowLayout.LEFT));
    pnCombos.add(coTabs);
    pnCombos.add(coCpos);
    pnCombos.add(btConsultar);
    
    pnCentro = new JPanel(new BorderLayout());
    pnCentro.add(pnCombos,BorderLayout.NORTH);
    pnCentro.add(new JScrollPane(tbGrade,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS),BorderLayout.CENTER);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(new JScrollPane(liBancos),
      BorderLayout.WEST);
    getContentPane().add(pnCentro,BorderLayout.CENTER);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width-getWidth())/2, (dm.height-getHeight())/2);
    
    liBancos.addListSelectionListener(this);
    coTabs.addItemListener(this);
    btConsultar.addActionListener(this);
    
    try {
      abrirConexao("");
      DatabaseMetaData dbmd = conexao.getMetaData();
      ResultSet bancos = dbmd.getCatalogs();
      
      DefaultListModel<String> dlm = (DefaultListModel<String>)
          liBancos.getModel();
      while(bancos.next())
        dlm.addElement(bancos.getString("TABLE_CAT"));
    }
    catch(Exception ex) {
      showMessageDialog(this,"Erro ocorrido: " + ex.getMessage(),
        "Erro",ERROR_MESSAGE);
    }
  }
  
  public void abrirConexao(String banco){
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conexao = DriverManager.getConnection(
        "jdbc:mysql://localhost/" + banco,"root","root");
    }
    catch (Exception ex) {
      showMessageDialog(this,"Conex�o falhou!","Erro",ERROR_MESSAGE);
    }
  }
  
  public void valueChanged(ListSelectionEvent e) {
    try {
      String banco = liBancos.getSelectedValue().toString();
      abrirConexao(banco);
      DatabaseMetaData dbmd = conexao.getMetaData();
      ResultSet rs_tabelas = dbmd.getTables(banco, null, null, null);
      
      DefaultComboBoxModel<String> dcm = 
        (DefaultComboBoxModel<String>)coTabs.getModel();
      dcm.removeAllElements();
      while(rs_tabelas.next())
        dcm.addElement(rs_tabelas.getString("TABLE_NAME"));
    }
    catch(Exception ex) {
      showMessageDialog(this,"Erro ocorrido: " + ex.getMessage(),
        "Erro",ERROR_MESSAGE);
    }
  }
  
  public void itemStateChanged(ItemEvent e) {
    if (coTabs.getSelectedIndex() == -1) return;
    
    String banco = liBancos.getSelectedValue().toString();
    String tabela = coTabs.getSelectedItem().toString();
    
    try {
      DatabaseMetaData dbmd = conexao.getMetaData();
      ResultSet rs_campos = dbmd.getColumns(banco,null,tabela,null);
      DefaultComboBoxModel<String> dcm = 
        (DefaultComboBoxModel<String>)coCpos.getModel();
      dcm.removeAllElements();
      while(rs_campos.next())
        dcm.addElement( rs_campos.getString("COLUMN_NAME") );
    }
    catch(Exception ex) {
      showMessageDialog(this,"Erro ocorrido: " + ex.getMessage(),
        "Erro",ERROR_MESSAGE);
    }
  }
  
  public void actionPerformed(ActionEvent e) {
    try {
      Statement stm = conexao.createStatement();
      ResultSet rs = stm.executeQuery("SELECT * FROM " + 
        coTabs.getSelectedItem() + " ORDER BY " +
        coCpos.getSelectedItem());
      tbGrade.setModel(new ModeloGrade(rs,null));
    }
    catch (Exception ex) {
      showMessageDialog(this,"Erro ocorrido: " + ex.getMessage(),
        "Erro",ERROR_MESSAGE);
    }
  }
  
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(
        new javax.swing.plaf.nimbus.NimbusLookAndFeel());
    }
    catch(Exception e) {e.printStackTrace();}
    
    new DBExplorer().setVisible(true);
  }
}
