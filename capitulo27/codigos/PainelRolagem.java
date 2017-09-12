import java.awt.*;
import javax.swing.*;

public class PainelRolagem extends JFrame {
  private JTextArea taTexto1;
  private JTextArea taTexto2;
  private JScrollPane spPainel1;
  private JScrollPane spPainel2;
  
  public PainelRolagem( ) {
    setTitle("Barras de rolagem");
    setSize(400,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new GridLayout(1,2,5,5));
    
    taTexto1 = new JTextArea( );
    spPainel1 = new JScrollPane(taTexto1,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    taTexto2 = new JTextArea( );
    spPainel2 = new JScrollPane(taTexto2,
      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    
    getContentPane( ).add(spPainel1);
    getContentPane( ).add(spPainel2);
  }
  
  public static void main(String[] args) {
    new PainelRolagem( ).setVisible(true);
  }
}
