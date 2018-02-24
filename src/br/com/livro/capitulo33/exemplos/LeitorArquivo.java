package br.com.livro.capitulo33.exemplos;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import static javax.swing.JOptionPane.*;

public class LeitorArquivo {
  public static void main(String args[]) {
    String nome = showInputDialog("Digite o nome do arquivo");
    if (nome == null) System.exit(0);
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(nome));
      
      String conteudo_arquivo = "";
      while(true) {
        String linha = br.readLine();
        if(linha == null) break;
        conteudo_arquivo += linha + "\n";
      }
      
      br.close();
      showMessageDialog(null,conteudo_arquivo);
    }
    catch (FileNotFoundException nfex) {
      showMessageDialog(null,"Arquivo n�o encontrado!","Erro",
          ERROR_MESSAGE);
    }
    catch (IOException ioex) {
      showMessageDialog(null,"Erro durante a leitura!","Erro",
          ERROR_MESSAGE);
    }
    System.exit(0);
  }
}
