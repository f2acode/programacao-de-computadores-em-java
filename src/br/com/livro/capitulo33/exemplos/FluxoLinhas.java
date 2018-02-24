package br.com.livro.capitulo33.exemplos;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.URL;

public class FluxoLinhas {
  public void executarOperacao() throws IOException {
    URL url_input = getClass().getResource("Edipo.txt");
    if (url_input == null) {
      System.out.println("Arquivo n�o encontrado!");
      return;
    }
    String input = url_input.getPath();
    
    BufferedReader br = null;
    PrintWriter pw = null;
    
    try {
      br = new BufferedReader( new FileReader(input) );
      pw = new PrintWriter( new FileWriter(
          input.replace("Edipo", "Copia")) );
      
      String linha;
      while ( (linha = br.readLine()) != null) {
        pw.println(linha);
      }
    } catch (IOException ioe) {
      System.out.println("Erro durante leitura/escrita!");
    } finally {
      if (br != null) br.close();
      if (pw != null) pw.close();
    }
  }
  
  public static void main(String[] args) throws IOException {
    new FluxoLinhas().executarOperacao();
  }
}