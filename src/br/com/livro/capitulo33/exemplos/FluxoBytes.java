package br.com.livro.capitulo33.exemplos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FluxoBytes {
  public void executarOperacao() throws IOException {
    URL url_input = getClass().getResource("Edipo.txt");
    if (url_input == null) {
      System.out.println("Arquivo n�o encontrado!");
      return;
    }
    String input = url_input.getPath();
    
    FileInputStream fis = null;
    FileOutputStream fos = null;
    
    try {
      fis = new FileInputStream( input );
      fos = new FileOutputStream(input.replace("Edipo", "Copia"));
      
      int bt;
      while ( (bt = fis.read()) != -1) {
        fos.write(bt);
      }
    } catch (IOException ioe) {
      System.out.println("Erro durante leitura/escrita!");
    } finally {
      if (fis != null) fis.close();
      if (fos != null) fos.close();
    }
  }
  
  public static void main(String[] args) throws IOException {
    new FluxoBytes().executarOperacao();
  }
}
