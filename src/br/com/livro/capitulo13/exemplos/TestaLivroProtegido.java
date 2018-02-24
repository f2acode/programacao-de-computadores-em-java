package br.com.livro.capitulo13.exemplos;
import javax.swing.JOptionPane;

public class TestaLivroProtegido {
  public static void main(String[] args) {
    Livro liv = new Livro();
    
    String str = "Dados do livro: ";
    str += "\n" + liv.getCodigo() + ": " + liv.getTitulo();
    JOptionPane.showMessageDialog(null,str);
    
    try {
      liv.setCodigo( -5 );
      liv.setTitulo( "Java" );
    }
    catch(RuntimeException rte) {
      JOptionPane.showMessageDialog(null,rte.getMessage(),"Erro",0);
      System.exit(0);
    }
    
    str = "Dados do livro: ";
    str += "\n" + liv.getCodigo() + ": " + liv.getTitulo();
    JOptionPane.showMessageDialog(null,str);
    
    System.exit(0);
  }
}