import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPopup extends JFrame implements ActionListener {
  private JPopupMenu pmCor;
  private JRadioButtonMenuItem rbVermelho;
  private JRadioButtonMenuItem rbVerde;
  private JRadioButtonMenuItem rbAzul;
  
  public MenuPopup( ) {
    setTitle("Menu de contexto");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    getContentPane( ).setBackground(new Color(255,255,255));
    
    pmCor = new JPopupMenu( );
    rbVermelho = new JRadioButtonMenuItem("Vermelho");
    rbVerde = new JRadioButtonMenuItem("Verde");
    rbAzul = new JRadioButtonMenuItem("Azul");
    
    pmCor.add(rbVermelho);
    pmCor.add(rbVerde);
    pmCor.add(rbAzul);
    
    ButtonGroup bgCor = new ButtonGroup( );
    bgCor.add(rbVermelho);
    bgCor.add(rbVerde);
    bgCor.add(rbAzul);
    
    rbVermelho.addActionListener(this);
    rbVerde.addActionListener(this);
    rbAzul.addActionListener(this);
    
    addMouseListener(new MouseAdapter( ) {
      public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger( ))
          pmCor.show(e.getComponent( ),e.getX( ),e.getY( ));
        }});
  }
    
  public void actionPerformed(ActionEvent e) {
    Color clFundo = new Color(0,0,0);
    if (e.getSource( ) == rbVermelho) clFundo = Color.RED;
    if (e.getSource( ) == rbVerde) clFundo = Color.GREEN;
    if (e.getSource( ) == rbAzul) clFundo = Color.BLUE;
    getContentPane( ).setBackground(clFundo);
  }
  
  public static void main(String[] args) {
    new MenuPopup( ).setVisible(true);
  }
}
