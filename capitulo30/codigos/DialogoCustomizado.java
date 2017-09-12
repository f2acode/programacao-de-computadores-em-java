import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogoCustomizado extends JDialog {
  private JLabel lbTitulo;
  private JLabel lbAutor;
  private JButton btOk;
  
  public DialogoCustomizado(JFrame progenitor,boolean modal){
    super(progenitor,"Sobre...",modal);
    setSize(200,100);
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    
    lbTitulo = new JLabel("Exemplo de di�logo");
    lbAutor = new JLabel("Autor: Rui Rossi dos Santos");
    btOk = new JButton("OK");
    
    getContentPane( ).setLayout(new GridLayout(3,1));
    getContentPane( ).add(lbTitulo);
    getContentPane( ).add(lbAutor);
    getContentPane( ).add(btOk);
    
    btOk.addActionListener(new ActionListener( ) {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }});
  }
  
  public static void main(String[] args) {
    new DialogoCustomizado(null,false).setVisible(true);
  }
}