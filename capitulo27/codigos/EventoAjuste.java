import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoAjuste extends JFrame
  implements AdjustmentListener {
  private JPanel pnEntrada;
  private JPanel pnAmostra;
  private JScrollBar sbVermelho;
  private JScrollBar sbVerde;
  private JScrollBar sbAzul;
  private JLabel lbVermelho;
  private JLabel lbVerde;
  private JLabel lbAzul;
  
  public EventoAjuste( ) {
    setTitle("Barras de rolagem");
    setSize(400,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    pnEntrada = new JPanel( );
    pnEntrada.setLayout(new GridLayout(3,2,2,2));
    pnAmostra = new JPanel( );
    pnAmostra.setBackground(new Color(0,0,0));
    
    sbVermelho = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
    sbVerde = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
    sbAzul = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
    lbVermelho = new JLabel("Intensidade de vermelho: 0");
    lbVerde = new JLabel("Intensidade de verde: 0");
    lbAzul = new JLabel("Intensidade de azul: 0");
    sbVermelho.setBlockIncrement(5);
    sbVerde.setBlockIncrement(5);
    sbAzul.setBlockIncrement(5);
    sbVermelho.setFocusable(true);
    sbVerde.setFocusable(true);
    sbAzul.setFocusable(true);
    sbVermelho.addAdjustmentListener(this);
    sbVerde.addAdjustmentListener(this);
    sbAzul.addAdjustmentListener(this);
    
    pnEntrada.add(sbVermelho);
    pnEntrada.add(lbVermelho);
    pnEntrada.add(sbVerde);
    pnEntrada.add(lbVerde);
    pnEntrada.add(sbAzul);
    pnEntrada.add(lbAzul);
    
    getContentPane( ).add(pnEntrada,BorderLayout.NORTH);
    getContentPane( ).add(pnAmostra,BorderLayout.CENTER);
  }
  
  public void adjustmentValueChanged(AdjustmentEvent e) {
    int verm = sbVermelho.getValue( );
    int verde = sbVerde.getValue( );
    int azul = sbAzul.getValue( );
    lbVermelho.setText("Intensidade de vermelho: " + verm);
    lbVerde.setText("Intensidade de verde: " + verde);
    lbAzul.setText("Intensidade de azul: " + azul);
    pnAmostra.setBackground(new Color(verm,verde,azul));
  }
  
  public static void main(String[] args) {
    new EventoAjuste( ).setVisible(true);
  }
}
