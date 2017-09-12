import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class Botao extends Janela {
  private JButton btGravar;
  private JButton btSair;
  
  public Botao( ){
    super("Bot�es",new Dimension(310,110));
    
    btGravar = new JButton( );
    btGravar.setText("Gravar");
    btGravar.setBounds(50,30,100,30);
    btGravar.setBackground(new Color(0,0,170));
    btGravar.setForeground(Color.YELLOW);
    btGravar.setFont(new Font("Helvetica",Font.BOLD,12));
    btGravar.setToolTipText("Gravar os dados");
    URL url_gravar = getClass().getResource("Gravar.png");
    btGravar.setIcon(new ImageIcon(url_gravar));
    btGravar.setHorizontalAlignment(SwingConstants.CENTER);
    btGravar.setVerticalAlignment(SwingConstants.CENTER);
    btGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
    btGravar.setVerticalTextPosition(SwingConstants.CENTER);
    btGravar.setEnabled(false);
    btGravar.setMnemonic('G');
    
    btSair = new JButton("Sair");
    btSair.setBounds(150,30,100,30);
    btSair.setBackground(new Color(0,0,170));
    btSair.setForeground(Color.YELLOW);
    btSair.setFont(new Font("Helvetica",Font.BOLD,12));
    btSair.setToolTipText("Encerrar o aplicativo");
    URL url_sair = getClass().getResource("Sair.png");
    btSair.setIcon(new ImageIcon(url_sair));
    btSair.setHorizontalAlignment(SwingConstants.CENTER);
    btSair.setVerticalAlignment(SwingConstants.CENTER);
    btSair.setHorizontalTextPosition(SwingConstants.RIGHT);
    btSair.setVerticalTextPosition(SwingConstants.CENTER);
    btSair.setMnemonic('S');
    
    getContentPane( ).add(btGravar);
    getContentPane( ).add(btSair);
  }
  
  public static void main(String[] args) {
    new Botao( ).setVisible(true);
  }
}
