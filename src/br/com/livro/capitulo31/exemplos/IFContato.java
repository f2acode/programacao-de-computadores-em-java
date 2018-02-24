package br.com.livro.capitulo31.exemplos;
import java.awt.*;
import javax.swing.*;

public class IFContato extends JInternalFrame {
  private JTextField tfNome;
  private JTextField tfEmail;
  private JButton btSair;
  
  public IFContato() {
    setTitle("Cadastro de contatos");
    setSize(300,120);
    setClosable(true);
    setIconifiable(true);
    setResizable(true);
    
    tfNome = new JTextField();
    tfEmail = new JTextField();
    btSair = new JButton("Sair");
    
    JPanel pnOeste = new JPanel();
    pnOeste.setLayout(new GridLayout(2,1,5,5));
    pnOeste.add(new JLabel("Nome:"));
    pnOeste.add(new JLabel("E-mail:"));
    
    JPanel pnCentro = new JPanel();
    pnCentro.setLayout(new GridLayout(2,1,5,5));
    pnCentro.add(tfNome);
    pnCentro.add(tfEmail);
    
    JPanel pnSul = new JPanel();
    pnSul.add(btSair);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(pnOeste,BorderLayout.WEST);
    getContentPane().add(pnCentro,BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
  }
}
