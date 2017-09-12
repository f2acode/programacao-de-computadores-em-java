import java.awt.*;
import java.net.URL;
import javax.swing.JFrame;

public class Janela extends JFrame {
  public Janela(String titulo, Dimension tamanho) {
    super();
    setTitle(titulo);
    setSize(tamanho);
    centralizar( );
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    getContentPane( ).setLayout(null);
    getContentPane( ).setBackground(Color.WHITE);
    
    URL url = getClass().getResource("Livros.png");
    Image im = Toolkit.getDefaultToolkit( ).getImage(url);
    setIconImage(im);
  }
  
  public void centralizar( ) {
    Dimension dt = Toolkit.getDefaultToolkit( ).getScreenSize( );
    Dimension dj = getSize( );
    setLocation((dt.width - dj.width)/2,(dt.height - dj.height)/2);
  }
  
  public static void main(String[] args) {
    Janela jan = new Janela("SisEscola",new Dimension(300,200));
    jan.setVisible(true);
  }
}