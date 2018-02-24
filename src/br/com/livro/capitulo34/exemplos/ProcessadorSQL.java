package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;

public class ProcessadorSQL extends JFrame
  implements ListSelectionListener,ActionListener {
  private JList<String> liBancos;
  private JTextArea taSQL;
  private JButton btExecutar;
  private JTable tbGrade;
  private JLabel lbStatus;
  private JPanel pnSQL;
  private JPanel pnCentro;
  private Connection conexao;
  
  public ProcessadorSQL() {
    setTitle("Processador de SQL");
    setSize(750,400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    liBancos = new JList<String>(new DefaultListModel<String>());
    liBancos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    taSQL = new JTextArea();
    btExecutar = new JButton("Executar");
    btExecutar.setMnemonic('E');
    tbGrade = new JTable(new ModeloGrade());
    
    pnSQL = new JPanel();
    pnSQL.setLayout(new BorderLayout());
    pnSQL.add(new JScrollPane(taSQL,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
      BorderLayout.CENTER);
    pnSQL.add(btExecutar,BorderLayout.EAST);
    pnSQL.setPreferredSize(new Dimension(100,75));
    
    pnCentro = new JPanel(new BorderLayout());
    pnCentro.add(pnSQL,BorderLayout.NORTH);
    pnCentro.add(new JScrollPane(tbGrade,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS),
      BorderLayout.CENTER);
    
    lbStatus = new JLabel("Resultado: ");
    lbStatus.setFont(new Font("Arial",Font.BOLD,12));
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(liBancos,BorderLayout.WEST);
    getContentPane().add(pnCentro,BorderLayout.CENTER);
    getContentPane().add(lbStatus,BorderLayout.SOUTH);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width-getWidth())/2,(dm.height-getHeight())/2);
    
    liBancos.addListSelectionListener(this);
    btExecutar.addActionListener(this);
    
    try {
      abrirConexao("");
      DatabaseMetaData dbmd = conexao.getMetaData();
      ResultSet rs_bancos = dbmd.getCatalogs();
      
      DefaultListModel<String> dlm = (DefaultListModel<String>)
          liBancos.getModel();
      while(rs_bancos.next())
        dlm.addElement(rs_bancos.getString("TABLE_CAT"));
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
    String banco = liBancos.getSelectedValue().toString();
    abrirConexao(banco);
  }
  
  public void actionPerformed(ActionEvent e) {
    String sql = taSQL.getText();
    if (sql.toUpperCase().indexOf("SELECT") == 0) consultar(sql);
    else executar(sql);
  }
  
  public void consultar(String sql) {
    try {
      Statement stm = conexao.createStatement();
      ResultSet rs = stm.executeQuery(sql);
      tbGrade.setModel(new ModeloGrade(rs,null));
      int n = tbGrade.getModel().getRowCount();
      lbStatus.setText("Resultado: " + n + " registros recuperados");
    }
    catch (Exception ex) {
      showMessageDialog(this,"Erro ocorrido: " + ex.getMessage(),
        "Erro",ERROR_MESSAGE);
    }
  }
  
  public void executar(String sql) {
    try {
      Statement stm = conexao.createStatement();
      int n = stm.executeUpdate(sql);
      lbStatus.setText("Resultado: " + n + " registros afetados");
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
    catch(Exception e) {}
    
    new ProcessadorSQL().setVisible(true);
  }
}
