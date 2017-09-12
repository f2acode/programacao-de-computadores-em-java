import javax.swing.plaf.metal.*;

public class TrocaTema {
  public static void main(String[] args) {
    MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
    new ExemploLAF().setVisible(true);
  }
}
