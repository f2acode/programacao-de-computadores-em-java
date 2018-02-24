package br.com.livro.capitulo34.exemplos;
import java.awt.*;
import javax.swing.*;

public class DesktopImagem extends JDesktopPane {
  private ImageIcon iiImagem;
  
  public DesktopImagem(String imagem) {
    iiImagem = new ImageIcon(imagem);
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    iiImagem.paintIcon(this, g, 0, 0);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(iiImagem.getIconWidth(),
        iiImagem.getIconHeight());
  }
}
