package br.com.livro.capitulo28.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoItem extends JFrame implements ItemListener {
  private JPanel pnNorte;
  private JComboBox<String> coCor;
  private JCheckBox cbEstilo;
  private JLabel lbStatus;
  
  public EventoItem( ) {
    setTitle("Eventos de sele��o");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    pnNorte = new JPanel( );
    pnNorte.setLayout(new GridLayout(2,2,5,5));
    pnNorte.add(new JLabel("Cor:"));
    pnNorte.add(new JLabel("Estilo:"));
      
    String[] cores = {"Vermelho","Verde","Azul"};
    coCor = new JComboBox<String>(cores);
    coCor.addItemListener(this);
    cbEstilo = new JCheckBox("Negrito");
    cbEstilo.addItemListener(this);
    
    pnNorte.add(coCor);
    pnNorte.add(cbEstilo);
    
    lbStatus = new JLabel("Amostra",0);
    lbStatus.setFont(new Font("Helvetica",Font.PLAIN,20));
    lbStatus.setForeground(Color.RED);
    
    getContentPane( ).add(pnNorte,BorderLayout.NORTH);
    getContentPane( ).add(lbStatus,BorderLayout.SOUTH);
  }
  
  public void itemStateChanged(ItemEvent e) {
    Color[] clCores = {Color.RED,Color.GREEN,Color.BLUE};
    Font[] ftFontes = {new Font("Helvetica",Font.PLAIN,20),
      new Font("Helvetica",Font.BOLD,20)};
    
    if (e.getSource( ) == coCor)
      lbStatus.setForeground(clCores[coCor.getSelectedIndex( )]);
    else if (e.getSource( ) == cbEstilo)
      if(cbEstilo.isSelected( )) lbStatus.setFont(ftFontes[1]);
      else lbStatus.setFont(ftFontes[0]);
  }
  
  public static void main(String[] args) {
    new EventoItem( ).setVisible(true);
  }
}
