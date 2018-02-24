package br.com.livro.capitulo31.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ExemploAbas extends JFrame 
  implements ActionListener, ChangeListener {
  private JTabbedPane tpAbas;
  private JTable tbDados;
  private JPanel pnManutencao;
  private JTextField tfCodigo;
  private JTextField tfNome;
  private JButton btAlterar;
  private JButton btExcluir;
  
  public ExemploAbas() {
    setTitle("Pain�is com abas");
    setSize(300,180);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    String[] titulos = {"C�digo","Nome"};
    Object[][] dados = {{1,"Arist�teles"},{2,"Hume"},{3,"Locke"},
        {4,"Kant"},{5,"Plat�o"},{6,"Ryle"},{7,"S�crates"},
        {8,"Searle"},{9,"Dennet"},{10,"Putnam"},{11,"Hobbes"}};
    tbDados = new JTable(new DefaultTableModel(dados,titulos));
    tbDados.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    tbDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbDados.setCursor(new Cursor(Cursor.HAND_CURSOR));
    tbDados.setFocusable(false);
    tbDados.setToolTipText("Clique para selecionar");
    
    tfCodigo = new JTextField();
    tfNome = new JTextField();
    btAlterar = new JButton("Alterar");
    btExcluir = new JButton("Excluir");
    pnManutencao = new JPanel();
    JPanel pnOeste = new JPanel();
    JPanel pnCentro = new JPanel();
    JPanel pnSul = new JPanel();
    
    tfCodigo.setEditable(false);
    
    pnManutencao.setLayout(new BorderLayout());
    pnOeste.setLayout(new GridLayout(2,1));
    pnCentro.setLayout(new GridLayout(2,1));
    
    pnOeste.add(new JLabel("Codigo"));
    pnOeste.add(new JLabel("Nome"));
    pnCentro.add(tfCodigo);
    pnCentro.add(tfNome);
    pnSul.add(btAlterar);
    pnSul.add(btExcluir);
    pnManutencao.add(pnOeste,BorderLayout.WEST);
    pnManutencao.add(pnCentro,BorderLayout.CENTER);
    pnManutencao.add(pnSul,BorderLayout.SOUTH);
    
    JScrollPane spDados = new JScrollPane(tbDados);
    spDados.setFocusable(false);
    
    tpAbas = new JTabbedPane();
    tpAbas.add("Sele��o",spDados);
    tpAbas.add("Manuten��o",pnManutencao);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(tpAbas,BorderLayout.CENTER);
    
    tpAbas.addChangeListener(this);
    tbDados.addMouseListener(new MouseHandler());
    btAlterar.addActionListener(this);
    btExcluir.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    DefaultTableModel dtm = (DefaultTableModel)tbDados.getModel();
    if (e.getSource() == btAlterar)
      dtm.setValueAt(tfNome.getText(), tbDados.getSelectedRow(), 1);
    else if (e.getSource() == btExcluir)
      dtm.removeRow(tbDados.getSelectedRow());
    tpAbas.setSelectedIndex(0);
  }

  public void stateChanged(ChangeEvent e) {
    if (tpAbas.getSelectedIndex() == 0) {
      tfCodigo.setText("");
      tfNome.setText("");
    }
    else if (tpAbas.getSelectedIndex() == 1)
      if (tfCodigo.getText().equals("")) tpAbas.setSelectedIndex(0);
  }

  class MouseHandler extends MouseAdapter {
    public void mouseReleased(MouseEvent e) {
      if (e.getButton() != MouseEvent.BUTTON1) return;
      JTable tb = (JTable)e.getSource();
      if (tb.getSelectionModel().isSelectionEmpty()) return;
  
      int lin = tb.getSelectionModel().getMinSelectionIndex();
      tfCodigo.setText(tb.getModel().getValueAt(lin,0).toString());
      tfNome.setText(tb.getModel().getValueAt(lin,1).toString());
      tpAbas.setSelectedComponent(pnManutencao);
      tfNome.requestFocus();
    }
  }
  
  public static void main(String[] args) throws Exception{
    UIManager.setLookAndFeel(new NimbusLookAndFeel());
    new ExemploAbas( ).setVisible(true);
  }
}
