package br.com.livro.capitulo24.exemplos;
import java.awt.event.*;
import javax.swing.*;

public class EventoAcao extends JFrame implements ActionListener {
  private JLabel lbStatus;
  private JButton btGravar;
  private JButton btSair;
  
  private int nrGravar;
  private int nrSair;
  
  public EventoAcao( ) {
    setTitle("Eventos de a��o");
    setSize(250,110);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    btGravar = new JButton("Gravar");
    btGravar.setBounds(10,10,100,30);
    btGravar.addActionListener(this);
    
    btSair = new JButton("Sair");
    btSair.setBounds(120,10,100,30);
    btSair.addActionListener(this);
    
    lbStatus = new JLabel("Pressione os bot�es.");
    lbStatus.setBounds(5,50,220,20);
    
    getContentPane().setLayout(null);
    getContentPane( ).add(btGravar);
    getContentPane( ).add(btSair);
    getContentPane( ).add(lbStatus);
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource( ) == btGravar)
      lbStatus.setText("Gravar: " + ++nrGravar + " vez(es)");
    else if (e.getSource( ) == btSair)
      lbStatus.setText("Sair: " + ++nrSair + " vez(es)");
  }
  
  public static void main(String[] args) {
    new EventoAcao( ).setVisible(true);
  }
}
