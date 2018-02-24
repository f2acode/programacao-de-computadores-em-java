package br.com.livro.capitulo28.exemplos;
import java.awt.*;
import javax.swing.*;

public class CaixaChecagem extends JFrame {
  private JPanel pnSul;
  private JLabel lbEstilo;
  private JCheckBox cbNegrito;
  private JCheckBox cbItalico;
  
  public CaixaChecagem( ) {
    setTitle("Caixas de checagem");
    setSize(300,100);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    lbEstilo = new JLabel("Estilo da fonte",JLabel.CENTER);
    cbNegrito = new JCheckBox("Negrito");
    cbItalico = new JCheckBox("It�lico",true);
    cbNegrito.setMnemonic('N');
    cbItalico.setMnemonic('I');
    
    pnSul = new JPanel( );
    pnSul.add(cbNegrito);
    pnSul.add(cbItalico);
    
    getContentPane( ).add(lbEstilo,BorderLayout.CENTER);
    getContentPane( ).add(pnSul,BorderLayout.SOUTH);
  }
  
  public static void main(String[] args) {
    new CaixaChecagem( ).setVisible(true);
  }
}
