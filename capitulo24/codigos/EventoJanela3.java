import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class EventoJanela3 extends JFrame {
  public EventoJanela3( ) {
    super();
    setSize(300,200);
    setTitle("Eventos de janela");
    getContentPane().setLayout(null);
    getContentPane().setBackground(Color.CYAN);
    
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        showMessageDialog(EventoJanela3.this,"At� logo!");
        System.exit(0);
      }
      
      public void windowOpened(WindowEvent e){
        showMessageDialog(EventoJanela3.this,"Bem-vindo!");
      }
    });
  }
  
  public static void main(String[] args) {
    new EventoJanela3( ).setVisible(true);
  }
}
