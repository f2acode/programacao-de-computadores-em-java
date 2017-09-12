import java.awt.*;
import javax.swing.*;

public class LeiauteGrade extends JFrame {
  private JButton bt1;
  private JButton bt2;
  private JButton bt3;
  private JButton bt4;
  private JButton bt5;
  private JButton bt6;
  
  public LeiauteGrade( ) {
    setTitle("Leiaute de grade");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    GridLayout gl = new GridLayout(3,2,0,0);
    getContentPane( ).setLayout(gl);
    
    bt1 = new JButton("Linha 1 - Coluna 1");
    bt2 = new JButton("Linha 1 - Coluna 2");
    bt3 = new JButton("Linha 2 - Coluna 1");
    bt4 = new JButton("Linha 2 - Coluna 2");
    bt5 = new JButton("Linha 3 - Coluna 1");
    bt6 = new JButton("Linha 3 - Coluna 2");
    
    getContentPane( ).add(bt1);
    getContentPane( ).add(bt2);
    getContentPane( ).add(bt3);
    getContentPane( ).add(bt4);
    getContentPane( ).add(bt5);
    getContentPane( ).add(bt6);
  }
  
  public static void main(String[] args) {
    new LeiauteGrade( ).setVisible(true);
  }
}
