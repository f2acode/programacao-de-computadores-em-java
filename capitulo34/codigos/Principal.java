import javax.swing.UIManager;

public class Principal {
  public static void main(String[] args) throws Exception {
    try {
      UIManager.setLookAndFeel(
          new javax.swing.plaf.nimbus.NimbusLookAndFeel());
    }
    catch(Exception e) {e.printStackTrace();}
    
    new JFPrincipal().setVisible(true);
  }
}
