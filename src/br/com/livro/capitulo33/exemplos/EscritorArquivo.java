package br.com.livro.capitulo33.exemplos;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import static javax.swing.JOptionPane.*;

public class EscritorArquivo {
  public static void main(String args[]) {
    String nome = showInputDialog("Digite o nome do arquivo");
    if (nome == null) System.exit(0);
    
    try  {
      PrintWriter pw = new PrintWriter( new FileWriter(nome) );
      
      int numero_linha = 0;
      while (true) {
        String linha = showInputDialog("Informe o texto da linha " +
            ++numero_linha);
        if (linha == null) break;
        pw.println(linha);
      }
      
      pw.close();
    }
    catch(IOException ioex) {
      showMessageDialog(null,"Erro durante a grava��o!","Erro",
          ERROR_MESSAGE);
    }
    System.exit(0);
  }
}
