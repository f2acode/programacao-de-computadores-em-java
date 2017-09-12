import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class EventoJanela5 extends JFrame {
  public EventoJanela5( ) {
    super();
    setSize(300,200);
    setTitle("Eventos de janela");
    getContentPane().setLayout(null);
    getContentPane().setBackground(Color.CYAN);
    
    addWindowListener( new Ouvinte() );
  }
  
  public static void main(String[] args) {
    new EventoJanela5( ).setVisible(true);
  }
  
  class Ouvinte extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      showMessageDialog(EventoJanela5.this,"At� logo!");
      System.exit(0);
    }
    
    public void windowOpened(WindowEvent e){
      showMessageDialog(EventoJanela5.this,"Bem-vindo!");
    }
  }
}
