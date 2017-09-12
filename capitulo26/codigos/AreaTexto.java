import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AreaTexto extends JFrame {
  private JButton btAcionar;
  private JTextArea taRegistro;
  private int contador;
  
  public AreaTexto( ) {
    setTitle("�reas de texto");
    setSize(300,250);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout());
    contador = 0;
    
    btAcionar = new JButton("Pressione-me");
    btAcionar.addActionListener(new ActionListener( ) {
      public void actionPerformed(ActionEvent e) {
        taRegistro.insert("Pressionamentos: "+ ++contador + "\n",0);
      }});
    
    taRegistro = new JTextArea( );
    taRegistro.setBackground(Color.YELLOW);
    taRegistro.setLineWrap(true);
    taRegistro.append("Pressione o bot�o acima.");
    taRegistro.append("\nUm texto ser� inserido aqui.");
    
    getContentPane( ).add(btAcionar,BorderLayout.NORTH);
    getContentPane( ).add(taRegistro,BorderLayout.CENTER);
  }
  
  public static void main(String[] args) {
    new AreaTexto( ).setVisible(true);
  }
}
