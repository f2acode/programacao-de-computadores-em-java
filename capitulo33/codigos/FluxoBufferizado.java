import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URL;

public class FluxoBufferizado {
  public void executarOperacao() throws IOException {
    URL url_input = getClass().getResource("Edipo.txt");
    if (url_input == null) {
      System.out.println("Arquivo n�o encontrado!");
      return;
    }
    String input = url_input.getPath();
    
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try {
      br = new BufferedReader( new FileReader(input) );
      bw = new BufferedWriter( new FileWriter( 
          input.replace("Edipo", "Copia")) );
      
      String linha;
      while ( (linha = br.readLine()) != null) {
        bw.write(linha + System.getProperty("line.separator"));
      }
    } catch (IOException ioe) {
      System.out.println("Erro durante leitura/escrita!");
    } finally {
      if (br != null) br.close();
      if (bw != null) bw.close();
    }
  }
  
  public static void main(String[] args) throws IOException {
    new FluxoBufferizado().executarOperacao();
  }
}
