package br.com.livro.capitulo31.exemplos;
import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.*;
import javax.swing.event.*;

public class PainelCor extends JFrame implements ChangeListener {
  private JColorChooser ccFundo;
  
  public PainelCor() {
    setTitle("Sele��o de cor");
    setSize(450,250);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    ccFundo = new JColorChooser(getContentPane().getBackground());
    ccFundo.setPreviewPanel(new JPanel());
    AbstractColorChooserPanel[] paineis = ccFundo.getChooserPanels();
    for (int i = 1; i < paineis.length; i++) {
      ccFundo.removeChooserPanel(paineis[i]);
    }
    ccFundo.getSelectionModel().addChangeListener(this);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(ccFundo,BorderLayout.NORTH);
  }
  
  public void stateChanged(ChangeEvent evt) {
    Color cor = ccFundo.getColor();
    getContentPane().setBackground(cor);
  }
  
  public static void main(String[] args) {
    new PainelCor().setVisible(true);
  }
}
