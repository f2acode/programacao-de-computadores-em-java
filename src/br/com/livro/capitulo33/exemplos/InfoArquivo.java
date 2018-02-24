package br.com.livro.capitulo33.exemplos;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import static javax.swing.JOptionPane.*;

public class InfoArquivo {
  public static void main(String[] args) {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    while (true) {
      String arq = showInputDialog("Que arquivo deseja analisar?");
      if (arq == null) break;
      File file = new File(arq);
      if (!file.exists()) {
        showMessageDialog(null,"Caminho n�o existe!","Erro",
            ERROR_MESSAGE);
        continue;
      }
      
      String props = "Propriedades do arquivo:" +
        "\nLocaliza��o: " + file.getPath() +
        "\nTipo: " + (file.isDirectory() ? "Diret�rio" : "Arquivo") +
        "\n�ltima modifica��o: " + 
          df.format(new Date( file.lastModified() ) ) +
        "\nOculto: " + (file.isHidden() ? "Sim" : "N�o") +
        "\nPermiss�es: " + 
        "\n - Leitura: " + (file.canRead() ? "Sim" : "N�o") +
        "\n - Escrita: " + (file.canWrite() ? "Sim" : "N�o") +
        "\n - Execu��o: " + (file.canExecute() ? "Sim" : "N�o");
      showMessageDialog(null,props);
    }
  }
}
