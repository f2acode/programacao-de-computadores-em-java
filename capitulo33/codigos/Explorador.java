import java.io.File;
import static javax.swing.JOptionPane.*;

public class Explorador {
  public static void main(String[] args) {
    while (true) {
      String dir = showInputDialog("Indique um diret�rio");
      if (dir == null) System.exit(0);
      File fl_dir = new File(dir);
      
      if (!fl_dir.exists()) {
        showMessageDialog(null,"Diret�rio n�o existe!","Erro",
            ERROR_MESSAGE);
        continue;
      }
      
      if (!fl_dir.isDirectory()) {
        showMessageDialog(null,"N�o � um diret�rio!","Erro",
            ERROR_MESSAGE);
        continue;
      }
      
      String[] conteudo = fl_dir.list();
      
      String str = "Conte�do do diret�rio: " + fl_dir.getPath();
      for (String s : conteudo) {
        File file = new File(fl_dir.getPath() + File.separator + s);
        str += "\n- " + s + " (" + 
          (file.isFile() ? "Arquivo" : "Diret�rio") + ")";
      }
      showMessageDialog(null, str);
    }
  }
}
