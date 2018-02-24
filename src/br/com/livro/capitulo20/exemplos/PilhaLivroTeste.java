package br.com.livro.capitulo20.exemplos;
import static javax.swing.JOptionPane.*;

public class PilhaLivroTeste {
  private static PilhaGenerica<Livro> pilha;
  
  public static void main(String[] args) {
    pilha = new PilhaGenerica<Livro>(50);
    
    while (!pilha.cheia()) {
      Livro livro = new Livro();
      
      String str = showInputDialog("Informe o autor");
      if (str == null) break;
      livro.setAutor(str);
      
      str = showInputDialog("Informe o t�tulo");
      if (str == null) break;
      livro.setTitulo(str);
      
      pilha.incluir( livro );
    }
    
    String str = "Itens da pilha:";
    while(!pilha.vazia())
      str += "\n" + pilha.excluir();
    showMessageDialog(null, str);
  }
}

