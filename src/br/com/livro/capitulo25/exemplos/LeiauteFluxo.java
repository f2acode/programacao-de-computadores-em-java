package br.com.livro.capitulo25.exemplos;
import java.awt.*;
import javax.swing.*;

public class LeiauteFluxo extends JFrame {
  private JButton bt1;
  private JButton bt2;
  private JButton bt3;
  private JButton bt4;
  private JButton bt5;
  
  public LeiauteFluxo( ) {
    setTitle("Leiaute de fluxo");
    setSize(300,120);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,10);
    getContentPane( ).setLayout(fl);
    
    bt1 = new JButton("Bot�o 1");
    bt2 = new JButton("Bot�o 2");
    bt3 = new JButton("Bot�o 3");
    bt4 = new JButton("Bot�o 4");
    bt5 = new JButton("Bot�o 5");
    
    getContentPane( ).add(bt1);
    getContentPane( ).add(bt2);
    getContentPane( ).add(bt3);
    getContentPane( ).add(bt4);
    getContentPane( ).add(bt5);
  }
  
  public static void main(String[] args) {
    new LeiauteFluxo( ).setVisible(true);
  }
}
