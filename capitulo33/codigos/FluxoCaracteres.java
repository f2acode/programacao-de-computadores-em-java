import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class FluxoCaracteres {
  public void executarOperacao() throws IOException {
    URL url_input = getClass().getResource("Edipo.txt");
    if (url_input == null) {
      System.out.println("Arquivo n�o encontrado!");
      return;
    }
    String input = url_input.getPath();
    
    FileReader fr = null;
    FileWriter fw = null;
    
    try {
      fr = new FileReader( input );
      fw = new FileWriter(input.replace("Edipo", "Copia"));
      
      int bt;
      while ( (bt = fr.read()) != -1) {
        fw.write(bt);
      }
    } catch (IOException ioe) {
      System.out.println("Erro durante leitura/escrita!");
    } finally {
      if (fr != null) fr.close();
      if (fw != null) fw.close();
    }
  }
  
  public static void main(String[] args) throws IOException {
    new FluxoCaracteres().executarOperacao();
  }
}