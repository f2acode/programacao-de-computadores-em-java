import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ExemploSlider extends JFrame implements ChangeListener{
  private JPanel pnEntrada;
  private JSlider sbVermelho;
  private JSlider sbVerde;
  private JSlider sbAzul;
  
  public ExemploSlider( ) {
    setTitle("Controles deslizantes");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    sbVermelho = new JSlider(JSlider.VERTICAL,0,255,0);
    sbVerde = new JSlider(JSlider.VERTICAL,0,255,0);
    sbAzul = new JSlider(JSlider.VERTICAL,0,255,0);
    
    pnEntrada = new JPanel( );
    pnEntrada.setLayout(new GridLayout(1,3,5,5));
    pnEntrada.add(sbVermelho);
    pnEntrada.add(sbVerde);
    pnEntrada.add(sbAzul);
    
    getContentPane( ).setLayout(new BorderLayout( ));
    getContentPane( ).add(pnEntrada,BorderLayout.WEST);
    getContentPane().setBackground(Color.BLACK);
    
    sbVermelho.addChangeListener(this);
    sbVerde.addChangeListener(this);
    sbAzul.addChangeListener(this);
  }

  public void stateChanged(ChangeEvent evt) {
    int verm = sbVermelho.getValue( );
    int verde = sbVerde.getValue( );
    int azul = sbAzul.getValue( );
    getContentPane().setBackground(new Color(verm,verde,azul));
  }
  
  public static void main(String[] args) {
    new ExemploSlider( ).setVisible(true);
  }
}