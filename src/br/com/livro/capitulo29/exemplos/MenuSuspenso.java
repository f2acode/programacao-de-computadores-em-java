package br.com.livro.capitulo29.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuSuspenso extends JFrame 
  implements ActionListener,ItemListener {                       
  private JMenuBar mb;
  private JMenu meFonte;
  private JMenu meSistema;
  private JMenu meCor;
  private JMenu meEstilo;
  private JRadioButtonMenuItem rbVermelho;
  private JRadioButtonMenuItem rbVerde;
  private JRadioButtonMenuItem rbAzul;
  private JCheckBoxMenuItem cbNegrito;
  private JCheckBoxMenuItem cbItalico;
  private JMenuItem miSair;
  private JLabel lbAmostra;
  
  public MenuSuspenso( ) {
    setTitle("Menu suspenso");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    mb = new JMenuBar( );
    meFonte = new JMenu("Fonte");
    meSistema = new JMenu("Sistema");
    meCor = new JMenu("Cor");
    meEstilo = new JMenu("Estilo");
    rbVermelho=new JRadioButtonMenuItem("Vermelho");
    rbVerde=new JRadioButtonMenuItem("Verde");
    rbAzul=new JRadioButtonMenuItem("Azul");
    cbNegrito = new JCheckBoxMenuItem("Negrito");
    cbItalico = new JCheckBoxMenuItem("It�lico");
    miSair = new JMenuItem("Sair");
    
    setJMenuBar(mb);
    mb.add(meFonte);
    mb.add(meSistema);
    meFonte.add(meCor);
    meFonte.addSeparator( );
    meFonte.add(meEstilo);
    meSistema.add(miSair);
    meCor.add(rbVermelho);
    meCor.add(rbVerde);
    meCor.add(rbAzul);
    meEstilo.add(cbNegrito);
    meEstilo.add(cbItalico);
    
    ButtonGroup bgCor = new ButtonGroup( );
    bgCor.add(rbVermelho);
    bgCor.add(rbVerde);
    bgCor.add(rbAzul);
    
    rbVermelho.addActionListener(this);
    rbVerde.addActionListener(this);
    rbAzul.addActionListener(this);
    cbNegrito.addItemListener(this);
    cbItalico.addItemListener(this);
    miSair.addActionListener(this);
    
    rbVermelho.setSelected(true);
    
    lbAmostra = new JLabel("Amostra",SwingConstants.CENTER);
    lbAmostra.setForeground(Color.RED);
    lbAmostra.setFont(new Font("TimesRoman",Font.PLAIN,48));
    getContentPane( ).add(lbAmostra,BorderLayout.CENTER);
  }
  
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == rbVermelho) lbAmostra.setForeground(Color.RED);
    else if (obj == rbVerde) lbAmostra.setForeground(Color.GREEN);
    else if (obj == rbAzul) lbAmostra.setForeground(Color.BLUE);
    else if (obj == miSair) System.exit(0);
  }
  
  public void itemStateChanged(ItemEvent e) {
    int estilo = 0;
    if (cbNegrito.isSelected( )) estilo += Font.BOLD;
    if (cbItalico.isSelected( )) estilo += Font.ITALIC;
    Font ft = new Font(lbAmostra.getFont( ).getName( ),estilo,48);
    lbAmostra.setFont(ft);
  }
  
  public static void main(String[] args) {
    new MenuSuspenso( ).setVisible(true);
  }
}
