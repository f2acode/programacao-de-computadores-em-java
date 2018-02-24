package br.com.livro.capitulo33.exemplos;
import java.io.File;
import static javax.swing.JOptionPane.*;

public class ExclusaoArquivo {
  public static void main(String[] args) {
    while (true) {
      String arq = showInputDialog("Que arquivo deseja excluir?");
      if (arq == null) break;
      File file = new File(arq);
      if (!file.exists())
        showMessageDialog(null,"Arquivo n�o existe!","Erro",
            ERROR_MESSAGE);
      else file.delete();
    }
  }
}
