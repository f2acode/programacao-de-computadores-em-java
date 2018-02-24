package br.com.livro.capitulo33.exemplos;
import java.io.File;
import java.io.IOException;
import static javax.swing.JOptionPane.*;

public class CriacaoArquivo {
  public static void main(String[] args) {
    String dir = showInputDialog("Que diret�rio deseja criar?");
    if (dir == null) System.exit(0);
    File fl_dir = new File(dir);
    
    if (!fl_dir.exists()) {
      fl_dir.mkdirs();
      showMessageDialog(null,"Diret�rio criado: " + 
        fl_dir.getPath());
    }
    else showMessageDialog(null, "Diret�rio j� existe!");
      
    try {
      while (true) {
        String arq = showInputDialog("Que arquivo deseja criar?");
        if (arq == null) System.exit(0);
        File file = new File(fl_dir.getPath() + File.separator + arq);
        if (!file.exists())
          file.createNewFile();
        else showMessageDialog(null,"Arquivo j� existe!","Erro",
            ERROR_MESSAGE);
      }
    }
    catch (IOException ioex) {
      showMessageDialog(null,"Erro ocorrido!","Erro",0);
    }
  }
}
