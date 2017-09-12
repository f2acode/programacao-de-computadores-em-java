import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

public class IFPedidoRegistrar extends JInternalFrame 
  implements ItemListener, DocumentListener, ActionListener {
  protected JComboBox<Cliente> coCliente;
  protected JComboBox<Produto> coProduto;
  protected JFormattedTextField tfQuantidade;
  protected JFormattedTextField tfUnitario;
  protected JLabel lbTotal;
  protected JButton btAdicionar;
  protected JButton btLimpar;
  protected JButton btGravar;
  protected JTable tbDados;
  protected JPanel pnEntrada;
  protected JPanel pnRotulos;
  protected JPanel pnCampos;
  protected JPanel pnSul;
  protected JPanel pnAdicionar;
  
  public IFPedidoRegistrar() {
    setTitle("Registro de pedido");
    setSize(500,400);
    setClosable(true);
    setIconifiable(true);
    setResizable(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    tbDados = new JTable(new ModeloGrade(new String[]{"C�digo",
      "Descri��o","Qtde","Unit�rio","Total"}));
    tbDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbDados.setCursor(new Cursor(Cursor.HAND_CURSOR));
    tbDados.setFocusable(false);
    tbDados.getColumnModel().getColumn(0).setMaxWidth(50);
    tbDados.getColumnModel().getColumn(2).setMaxWidth(50);
    tbDados.getColumnModel().getColumn(3).setMaxWidth(75);
    tbDados.getColumnModel().getColumn(4).setMaxWidth(100);
    
    coCliente = new JComboBox<Cliente>();
    try {
      coCliente.setModel(new DefaultComboBoxModel<Cliente>(
        new ClienteDAO().carregarCombo()));
    }
    catch (Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
    
    coProduto = new JComboBox<Produto>();
    try {
      coProduto.setModel(new DefaultComboBoxModel<Produto>(
        new ProdutoDAO().carregarCombo()));
    }
    catch (Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
    
    tfQuantidade = new JFormattedTextField(new Integer(0));
    tfUnitario = new JFormattedTextField(new Double(0));
    lbTotal = new JLabel();
    lbTotal.setText(NumberFormat.getCurrencyInstance().format(0));
    btAdicionar = new JButton("Adicionar Item");
    btAdicionar.setMnemonic('A');
    btLimpar = new JButton("Limpar Itens");
    btLimpar.setMnemonic('L');
    btGravar = new JButton("Gravar Pedido");
    btGravar.setMnemonic('G');
    
    pnEntrada = new JPanel();
    pnRotulos = new JPanel();
    pnCampos = new JPanel();
    pnAdicionar = new JPanel();
    pnSul = new JPanel();
    
    pnEntrada.setLayout(new BorderLayout());
    pnRotulos.setLayout(new GridLayout(5,1));
    pnCampos.setLayout(new GridLayout(5,1));
    
    pnRotulos.add(new JLabel(" Cliente: "));
    pnRotulos.add(new JLabel(" Produto: "));
    pnRotulos.add(new JLabel(" Quantidade: "));
    pnRotulos.add(new JLabel(" $ Unit�rio: "));
    pnRotulos.add(new JLabel(" $ Total: "));
    pnCampos.add(coCliente);
    pnCampos.add(coProduto);
    pnCampos.add(tfQuantidade);
    pnCampos.add(tfUnitario);
    pnCampos.add(lbTotal);
    pnAdicionar.add(btAdicionar);
    pnAdicionar.add(btLimpar);
    pnEntrada.add(pnRotulos,BorderLayout.WEST);
    pnEntrada.add(pnCampos,BorderLayout.CENTER);
    pnEntrada.add(pnAdicionar,BorderLayout.SOUTH);
    pnSul.add(btGravar);
    
    JScrollPane spDados = new JScrollPane(tbDados,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    spDados.setFocusable(false);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(pnEntrada,BorderLayout.NORTH);
    getContentPane().add(spDados,BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    coProduto.addItemListener(this);
    tfQuantidade.getDocument().addDocumentListener(this);
    tfUnitario.getDocument().addDocumentListener(this);
    btAdicionar.addActionListener(this);
    btLimpar.addActionListener(this);
    btGravar.addActionListener(this);
    exibirPreco();
  }
  
  public void itemStateChanged(ItemEvent e) {
    if (e.getSource() == coProduto) exibirPreco();
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btAdicionar) addItem();
    else if (e.getSource() == btLimpar) limparItens();
    else if (e.getSource() == btGravar) gravarPedido();
  }
  
  public void insertUpdate(DocumentEvent e) {
    changedUpdate(e);
  }

  public void removeUpdate(DocumentEvent e) {
    changedUpdate(e);
  }
  public void changedUpdate(DocumentEvent e) {
    try {
      if (tfQuantidade.getText().length() == 0) return;
      int qtde = Integer.parseInt(tfQuantidade.getText());
      
      String str = tfUnitario.getText();
      str = str.replaceAll("\\.","").replace(",",".");
      if (str.length() == 0) return;
      double unitario = Double.parseDouble(str);
      
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      lbTotal.setText(nf.format(qtde*unitario));
    }
    catch (Exception ex) {ex.printStackTrace();}
  }

  public void exibirPreco() {
    Produto p = (Produto)coProduto.getSelectedItem();
    try {
      p = new ProdutoDAO().pesquisar(p.getCodigo());
      tfUnitario.setText(p.getPrecoFmt());
    }
    catch(Exception ex) {ex.printStackTrace();}
  }
  
  public void addItem() {
    int qtde = Integer.parseInt(tfQuantidade.getText());
    String str = tfUnitario.getText().replaceAll("\\.","");
    double unitario = Double.parseDouble(str.replace(",","."));
    
    if (qtde <= 0) {
      showMessageDialog(this,"Quantidade inv�lida","",ERROR_MESSAGE);
      return;
    }
    
    if (unitario <= 0) {
      showMessageDialog(this,"$ unit�rio inv�lido","",ERROR_MESSAGE);
      return;
    }
    
    Produto p = (Produto)coProduto.getSelectedItem();
    ModeloGrade mg = (ModeloGrade)tbDados.getModel();
    for (List<Object> li : mg.getLinhas())
      if (Integer.parseInt(li.get(0).toString()) == p.getCodigo()) {
        mg.getLinhas().remove(li);
        break;
      }
    
    List<Object> linha = new ArrayList<Object>();
    linha.add(p.getCodigo());
    linha.add(p.getDescricao());
    linha.add(qtde);
    linha.add(unitario);
    linha.add(qtde * unitario);
    
    mg.insertRow(linha);
    SwingUtilities.updateComponentTreeUI(tbDados);
    
    tfQuantidade.setValue(0);
    lbTotal.setText(NumberFormat.getCurrencyInstance().format(0));
    coProduto.requestFocus();
  }
  
  public void limparItens() {
    ((ModeloGrade)tbDados.getModel()).clearLines();
    SwingUtilities.updateComponentTreeUI(tbDados);
  }
  
  public void gravarPedido() {
    Pedido p = new Pedido();
    Cliente c = (Cliente)coCliente.getSelectedItem();
    p.setIdCliente(c.getCodigo());
    p.setStatus('A');
    
    ModeloGrade mg = (ModeloGrade)tbDados.getModel();
    List<List<Object>> itens = mg.getLinhas();
    for (List<Object> li : itens) {
      Item i = new Item();
      i.setIdProduto(li.get(0).toString());
      i.setQuantidade(li.get(2).toString());
      i.setUnitario(li.get(3).toString());
      p.incluirItem(i);
    }
    
    try {
      new PedidoDAO().incluir(p);
      showMessageDialog(this, "Registro gravado!");
      limparItens();
      tfQuantidade.setValue(0);
    }
    catch (Exception ex) {
      showMessageDialog(this,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
}
