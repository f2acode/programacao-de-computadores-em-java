package br.com.livro.capitulo31.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFMenuFundo extends JFrame implements ActionListener{
  private DesktopImagem desktop;
  private JMenuBar mbBarra;
  private JMenu meCadastro;
  private JMenuItem miContato;
  
  public JFMenuFundo() {
    setTitle("Imagem de fundo");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setResizable(false);
    
    desktop = new DesktopImagem("/imagens/Crepusculo.png");
    mbBarra = new JMenuBar();
    meCadastro = new JMenu();
    miContato = new JMenuItem();
    
    meCadastro.setText("Cadastro");
    miContato.setText("Contato");
    
    meCadastro.setMnemonic('C');
    miContato.setMnemonic('o');
    
    setJMenuBar(mbBarra);
    mbBarra.add(meCadastro);
    meCadastro.add(miContato);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(desktop,BorderLayout.CENTER);
    pack();
    
    miContato.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    IFContato janela_interna = new IFContato();
    janela_interna.setLocation(10,10);
    desktop.add(janela_interna);
    janela_interna.setVisible(true);
  }
  
  public static void main(String[] args) {
    new JFMenuFundo().setVisible(true);
  }
}
