import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoJanela1 extends JFrame
  implements WindowListener {
  public EventoJanela1( ) {
    super();
    setSize(300,200);
    setTitle("Eventos de janela");
    getContentPane().setLayout(null);
    getContentPane().setBackground(Color.CYAN);
    addWindowListener(this);
  }
  
  public void windowOpened(WindowEvent e){
    JOptionPane.showMessageDialog(this,"Bem-vindo!");
  }
  
  public void windowClosing(WindowEvent e) {
    JOptionPane.showMessageDialog(this,"At� logo!");
    System.exit(0);
  }
  
  public void windowIconified(WindowEvent e){}
  public void windowDeiconified(WindowEvent e){}
  public void windowClosed(WindowEvent e){}
  public void windowActivated(WindowEvent e){}
  public void windowDeactivated(WindowEvent e){}
  
  public static void main(String[] args) {
    new EventoJanela1( ).setVisible(true);
  }
}
