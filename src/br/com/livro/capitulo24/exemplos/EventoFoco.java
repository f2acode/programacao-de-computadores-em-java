package br.com.livro.capitulo24.exemplos;
import java.awt.event.*;
import javax.swing.*;

public class EventoFoco extends JFrame implements FocusListener {
  private JLabel lbFG;
  private JLabel lbFL;
  private JButton bt1;
  private JButton bt2;
  private JButton bt3;
  
  public EventoFoco( ) {
    setTitle("Eventos de foco");
    setSize(340,130);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    bt1 = new JButton("Bot�o 1");
    bt1.setBounds(10,10,100,30);
    bt1.addFocusListener(this);

    bt2 = new JButton("Bot�o 2");
    bt2.setBounds(110,10,100,30);
    bt2.addFocusListener(this);
    
    bt3 = new JButton("Bot�o 3");
    bt3.setBounds(210,10,100,30);
    bt3.addFocusListener(this);

    lbFG = new JLabel( );
    lbFG.setBounds(5,50,280,20);
    
    lbFL = new JLabel( );
    lbFL.setBounds(5,70,280,20);
    
    getContentPane( ).setLayout(null);
    getContentPane( ).add(bt1);
    getContentPane( ).add(bt2);
    getContentPane( ).add(bt3);
    getContentPane( ).add(lbFG);
    getContentPane( ).add(lbFL);
  }
  
  public void focusGained(FocusEvent e) {
    if (e.getSource( ) == bt1) 
      lbFG.setText("Bot�o 1 recebeu o foco");
    if (e.getSource( ) == bt2) 
      lbFG.setText("Bot�o 2 recebeu o foco");
    if (e.getSource( ) == bt3) 
      lbFG.setText("Bot�o 3 recebeu o foco");
  }
  
  public void focusLost(FocusEvent e) {
    if (e.getSource( ) == bt1) lbFL.setText("Bot�o 1 perdeu o foco");
    if (e.getSource( ) == bt2) lbFL.setText("Bot�o 2 perdeu o foco");
    if (e.getSource( ) == bt3) lbFL.setText("Bot�o 3 perdeu o foco");
  }
  
  public static void main(String[] args) {
    new EventoFoco( ).setVisible(true);
  }
}
