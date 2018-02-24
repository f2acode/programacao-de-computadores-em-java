package br.com.livro.capitulo28.exemplos;
import java.awt.*;
import javax.swing.*;

public class BotaoRadio extends JFrame {
  private JPanel pnSul;
  private JLabel lbSexo;
  private JRadioButton rbMasculino;
  private JRadioButton rbFeminino;
  private ButtonGroup bgSexo;
  
  public BotaoRadio( ) {
    setTitle("Bot�es de r�dio");
    setSize(250,100);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    lbSexo = new JLabel("Sexo",0);
    rbMasculino = new JRadioButton("Masculino",true);
    rbFeminino = new JRadioButton("Feminino");
    
    bgSexo = new ButtonGroup( );
    bgSexo.add(rbMasculino);
    bgSexo.add(rbFeminino);
    
    pnSul = new JPanel( );
    pnSul.add(rbMasculino);
    pnSul.add(rbFeminino);
    
    getContentPane( ).add(lbSexo,BorderLayout.CENTER);
    getContentPane( ).add(pnSul,BorderLayout.SOUTH);
  }
  
  public static void main(String[] args) {
    new BotaoRadio( ).setVisible(true);
  }
}
