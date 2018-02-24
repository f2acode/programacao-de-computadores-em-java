package br.com.livro.capitulo24.exemplos;
import java.awt.event.*;
import javax.swing.*;

public class EventoMouse extends JFrame implements MouseListener {
  private JLabel lbStatus;
  private JButton bt1;
  private JButton bt2;
  private JButton bt3;
  
  public EventoMouse( ) {
    setTitle("Eventos de mouse");
    setSize(340,110);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    bt1 = new JButton("Bot�o 1");
    bt1.setBounds(10,10,100,30);
    bt1.addMouseListener(this);

    bt2 = new JButton("Bot�o 2");
    bt2.setBounds(110,10,100,30);
    bt2.addMouseListener(this);
    
    bt3 = new JButton("Bot�o 3");
    bt3.setBounds(210,10,100,30);
    bt3.addMouseListener(this);

    lbStatus = new JLabel("Passe o mouse e clique sobre os bot�es.");
    lbStatus.setBounds(5,50,280,20);
    
    getContentPane( ).setLayout(null);
    getContentPane( ).add(bt1);
    getContentPane( ).add(bt2);
    getContentPane( ).add(bt3);
    getContentPane( ).add(lbStatus);
  }
  
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  
  public void mouseEntered(MouseEvent e) {
    if (e.getSource( ) == bt1) bt1.requestFocus( );
    if (e.getSource( ) == bt2) bt2.requestFocus( );
    if (e.getSource( ) == bt3) bt3.requestFocus( );
  }
  
  public void mouseClicked(MouseEvent e) {
    if (e.getSource( ) == bt1) lbStatus.setText("Clique no bot�o 1");
    if (e.getSource( ) == bt2) lbStatus.setText("Clique no bot�o 2");
    if (e.getSource( ) == bt3) lbStatus.setText("Clique no bot�o 3");
  }
  
  public static void main(String[] args) {
    new EventoMouse( ).setVisible(true);
  }
}
