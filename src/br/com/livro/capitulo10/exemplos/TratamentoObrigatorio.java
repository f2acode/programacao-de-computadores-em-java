package br.com.livro.capitulo10.exemplos;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TratamentoObrigatorio {
  public static void main(String[] args) {
    String texto = "";
    FileReader fr = null;
    
    try {
      fr = new FileReader("Excecao.java");
    }
    catch (FileNotFoundException nfex) {
      System.out.println("Arquivo n�o encontrado!");
      System.exit(0);
    }
    
    try {
      BufferedReader br = new BufferedReader(fr);
    
      while(true) {
        String linha = br.readLine();
        if(linha == null) break;
        texto += linha + "\n";
      }
      
      br.close();
      fr.close();
    }
    catch (IOException ioex) {
      System.out.println("Erro durante a leitura do arquivo!");
      System.exit(0);
    }
    
    System.out.println(texto);
    System.exit(0);
  }
}