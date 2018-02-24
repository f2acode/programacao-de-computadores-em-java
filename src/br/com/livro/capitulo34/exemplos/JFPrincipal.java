package br.com.livro.capitulo34.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFPrincipal extends JFrame implements ActionListener{
  private DesktopImagem desktop;
  private JMenuBar mbBarra;
  private JMenu meCadastro;
  private JMenu mePedido;
  private JMenu meSistema;
  private JMenuItem miCategoria;
  private JMenuItem miProduto;
  private JMenuItem miCliente;
  private JMenuItem miRegistrar;
  private JMenuItem miSobre;
  
  public JFPrincipal() {
    setTitle("Sistema de registro de pedidos");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setResizable(false);
    
    mbBarra = new JMenuBar();
    meCadastro = new JMenu("Cadastro");
    mePedido = new JMenu("Pedido");
    meSistema = new JMenu("Sistema");
    miCategoria = new JMenuItem("Categoria");
    miProduto = new JMenuItem("Produto");
    miCliente = new JMenuItem("Cliente");
    miRegistrar = new JMenuItem("Registrar");
    miSobre = new JMenuItem("Sobre ...");
    
    meCadastro.setMnemonic('C');
    mePedido.setMnemonic('P');
    meSistema.setMnemonic('S');
    miCategoria.setMnemonic('a');
    miProduto.setMnemonic('P');
    miCliente.setMnemonic('C');
    miRegistrar.setMnemonic('R');
    miSobre.setMnemonic('o');
    
    setJMenuBar(mbBarra);
    mbBarra.add(meCadastro);
    mbBarra.add(mePedido);
    mbBarra.add(meSistema);
    meCadastro.add(miCategoria);
    meCadastro.add(miProduto);
    meCadastro.add(miCliente);
    mePedido.add(miRegistrar);
    meSistema.add(miSobre);
    
    desktop = new DesktopImagem(
      getClass().getResource("Crepusculo.jpg").getPath());
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(desktop,BorderLayout.CENTER);
    pack();
    
    miCliente.addActionListener(this);
    miCategoria.addActionListener(this);
    miProduto.addActionListener(this);
    miRegistrar.addActionListener(this);
    miSobre.addActionListener(this);
    
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((d.width-getWidth())/2,(d.height-getHeight())/2);
  }
  
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == miCategoria) cadastrarCategoria();
    else if (source == miProduto) cadastrarProduto();
    else if (source == miCliente) cadastrarCliente();
    else if (source == miRegistrar) registrarPedido();
    else if (source == miSobre) sobre();
  }
  
  private void cadastrarCategoria() {
    IFCategoria janela = new IFCategoria();
    janela.setLocation(10, 10);
    desktop.add(janela);
    janela.setVisible(true);
  }
  
  private void cadastrarProduto() {
    IFProduto janela = new IFProduto();
    janela.setLocation(20, 20);
    desktop.add(janela);
    janela.setVisible(true);
  }
  
  private void cadastrarCliente() {
    IFCliente janela = new IFCliente();
    janela.setLocation(30, 30);
    desktop.add(janela);
    janela.setVisible(true);
  }
  
  private void registrarPedido() {
    IFPedidoRegistrar janela = new IFPedidoRegistrar();
    janela.setLocation(10, 10);
    desktop.add(janela);
    janela.setVisible(true);
  }
  
  private void sobre() {
    showOptionDialog(this,"Sistema de Registro de Pedidos" +
      "\nVers�o 1.0\nAutor: Rui Rossi dos Santos" +
      "\nTodos os direitos reservados",
      "Sobre ...",0,3,null,new String[]{"Fechar"},"Fechar");
  }
}