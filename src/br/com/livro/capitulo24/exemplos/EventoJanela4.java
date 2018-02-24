package br.com.livro.capitulo24.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class EventoJanela4 extends JFrame {
  public EventoJanela4( ) {
    super();
    setSize(300,200);
    setTitle("Eventos de janela");
    getContentPane().setLayout(null);
    getContentPane().setBackground(Color.CYAN);
    
    addWindowListener( new Ouvinte() );
  }
  
  public static void main(String[] args) {
    new EventoJanela4( ).setVisible(true);
  }
  
  class Ouvinte implements WindowListener {
    public void windowClosing(WindowEvent e) {
      showMessageDialog(EventoJanela4.this,"At� logo!");
      System.exit(0);
    }
    
    public void windowOpened(WindowEvent e){
      showMessageDialog(EventoJanela4.this,"Bem-vindo!");
    }
    
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
  }
}
