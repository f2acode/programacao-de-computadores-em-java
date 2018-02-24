package br.com.livro.capitulo31.exemplos;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

public class ExemploLAF extends JFrame implements ActionListener {
  private JDesktopPane desktop;
  private JPanel pnNorte;
  private JButton btMetal;
  private JButton btMotif;
  private JButton btNimbus;
  private JButton btWindows;
  private JLabel lbStatus;
  
  public ExemploLAF() {
    setTitle("Apar�ncia e comportamento");
    setSize(400,230);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    desktop = new JDesktopPane();
    pnNorte = new JPanel();
    btMetal =  new JButton("Metal");
    btMotif =  new JButton("Motif");
    btNimbus =  new JButton("Nimbus");
    btWindows =  new JButton("Windows");
    lbStatus = new JLabel();
    
    pnNorte.add(btMetal);
    pnNorte.add(btMotif);
    pnNorte.add(btNimbus);
    pnNorte.add(btWindows);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(pnNorte, BorderLayout.NORTH);
    getContentPane().add(desktop, BorderLayout.CENTER);
    getContentPane().add(lbStatus, BorderLayout.SOUTH);
    
    IFContato janela_interna = new IFContato();
    janela_interna.setClosable(false);
    janela_interna.setLocation(10,10);
    desktop.add(janela_interna);
    janela_interna.setVisible(true);
    
    btMetal.addActionListener(this);
    btMotif.addActionListener(this);
    btNimbus.addActionListener(this);
    btWindows.addActionListener(this);
    
    atualizarStatus();
  }
  
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == btMetal) setLAF(new MetalLookAndFeel());
    else if (obj == btMotif) setLAF(new MotifLookAndFeel());
    else if (obj == btNimbus) setLAF(new NimbusLookAndFeel());
    else if (obj == btWindows) setLAF(new WindowsLookAndFeel());
  }
  
  public void setLAF(LookAndFeel laf) {
    try {
      UIManager.setLookAndFeel(laf);
      SwingUtilities.updateComponentTreeUI(this);
      atualizarStatus();
      }
    catch (Exception ex) {
      showMessageDialog(this, ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
  }
  
  public void atualizarStatus() {
    LookAndFeel laf = UIManager.getLookAndFeel();
    lbStatus.setText("LookAndFeel em uso: " +  laf.getName());
  }
  
  public static void main(String[] args) {
    new ExemploLAF().setVisible(true);
  }
}
