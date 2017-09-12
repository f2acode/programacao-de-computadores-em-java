import java.awt.event.*;
import javax.swing.*;

public class EventoComponente extends JFrame 
  implements ComponentListener {
  private JLabel lbStatus;
  private JButton btOcultar;
  private JButton btMover;
  private JButton btRedimensionar;
  private JButton btVazio;
  
  private int nrOculto;
  private int nrExibido;
  private int nrMovido;
  private int nrRedim;
  
  public EventoComponente( ) {
    setTitle("Eventos de componente");
    setSize(410,160);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    btOcultar = new JButton("Ocultar");
    btOcultar.setBounds(10,10,100,30);
    btOcultar.addActionListener(new ActionListener( ){
      public void actionPerformed(ActionEvent e) {
        if (btOcultar.getText( ).equals("Ocultar")) {
          btOcultar.setText("Exibir");
          btVazio.setVisible(false);
          return;
        }
        else if (btOcultar.getText( ).equals("Exibir")) {
          btOcultar.setText("Ocultar");
          btVazio.setVisible(true);
        }
      }
    });
    
    btMover = new JButton("Mover");
    btMover.setBounds(110,10,100,30);
    btMover.addActionListener(new ActionListener( ) {
      public void actionPerformed(ActionEvent e) {
        if ((btVazio.getX( ) + btVazio.getWidth( )) < 380) 
          btVazio.setLocation(btVazio.getX( )+10,60);
        else btVazio.setLocation(10,60);
      }
    });
    
    btRedimensionar = new JButton("Redimensionar");
    btRedimensionar.setBounds(210,10,170,30);
    btRedimensionar.addActionListener(new ActionListener( ) {
      public void actionPerformed(ActionEvent e) {
        if (btVazio.getWidth( ) < 200) 
          btVazio.setSize(btVazio.getWidth( )+10,30);
        else btVazio.setSize(100,30);
        if ((btVazio.getX( ) + btVazio.getWidth( )) > 380) 
          btVazio.setLocation(10,60);
      }
    });
    
    btVazio = new JButton( );
    btVazio.setBounds(10,60,100,30);
    btVazio.addComponentListener(this);

    lbStatus = new JLabel("Pressione os bot�es.");
    lbStatus.setBounds(5,100,380,20);
    
    getContentPane( ).setLayout(null);
    getContentPane( ).add(btOcultar);
    getContentPane( ).add(btMover);
    getContentPane( ).add(btRedimensionar);
    getContentPane( ).add(btVazio);
    getContentPane( ).add(lbStatus);
  }
  
  public void componentHidden(ComponentEvent e) {
    lbStatus.setText("Ocultado "+ ++nrOculto +" vez(es).");
  }
  
  public void componentShown(ComponentEvent e) {
    lbStatus.setText("Exibido "+ ++nrExibido +" vez(es).");
  }
  
  public void componentMoved(ComponentEvent e) {
    lbStatus.setText("Movido "+ ++nrMovido +" vez(es).");
  }
  
  public void componentResized(ComponentEvent e) {
    lbStatus.setText("Redimensionado "+ ++nrRedim +" vez(es).");
  }
  
  public static void main(String[] args) {
    new EventoComponente( ).setVisible(true);
  }
}