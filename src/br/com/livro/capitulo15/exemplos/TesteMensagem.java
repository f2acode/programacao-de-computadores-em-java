package br.com.livro.capitulo15.exemplos;
import javax.swing.JOptionPane;

public class TesteMensagem implements Mensagem {
  public void exibir(String texto) {
    JOptionPane.showMessageDialog(null,texto,"Mensagem",1);
  }
  
  public static void main(String[] args) {
    TesteMensagem tm = new TesteMensagem();
    
    tm.exibir( Mensagem.ENTRADA );
    tm.exibir( SUCESSO );
    
    System.exit(0);
  }
}
