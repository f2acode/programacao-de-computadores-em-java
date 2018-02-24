package br.com.livro.capitulo15.exemplos;
import javax.swing.JOptionPane;

public class TesteAlerta extends TesteMensagem implements Alerta {
  public void exibir(String texto, int icone) {
    JOptionPane.showMessageDialog(null,texto,"Aten��o",icone);
  }
  
  public static void main(String[] args) {
    TesteAlerta ta = new TesteAlerta();
    ta.exibir( ENTRADA );
    
    ta.exibir( FECHAR , JOptionPane.WARNING_MESSAGE);
    ta.exibir( DEMORA , JOptionPane.WARNING_MESSAGE);
    
    try{
      Thread.sleep(3000);
      }
    catch(Exception ex) {}
    
    ta.exibir( SUCESSO );
    System.exit(0);
  }
}