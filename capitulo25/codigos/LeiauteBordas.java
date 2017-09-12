import java.awt.*;
import javax.swing.*;

public class LeiauteBordas extends JFrame {
  private JButton bt1;
  private JButton bt2;
  private JButton bt3;
  private JButton bt4;
  private JButton bt5;
  
  public LeiauteBordas( ) {
    setTitle("Leiaute de bordas");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    BorderLayout bl = new BorderLayout(5,5);
    getContentPane( ).setLayout(bl);
    
    bt1 = new JButton("Norte");
    bt2 = new JButton("Sul");
    bt3 = new JButton("Leste");
    bt4 = new JButton("Oeste");
    bt5 = new JButton("Centro");
    
    getContentPane( ).add(bt1,BorderLayout.NORTH);
    getContentPane( ).add(bt2,BorderLayout.SOUTH);
    getContentPane( ).add(bt3,BorderLayout.EAST);
    getContentPane( ).add(bt4,BorderLayout.WEST);
    getContentPane( ).add(bt5,BorderLayout.CENTER);
  }
  
  public static void main(String[] args) { 
    new LeiauteBordas( ).setVisible(true);
  }
}
