package br.com.livro.capitulo13.exemplos;
import javax.swing.JOptionPane;

public class TestaLivro {
  public static void main(String[] args) {
    Livro liv = new Livro();
    
    String str = "Dados do livro: ";
    str += "\n" + liv.getCodigo() + ": " + liv.getTitulo();
    JOptionPane.showMessageDialog(null,str);
    
    liv.setCodigo( 1 );
    liv.setTitulo( "Java na Web" );
    
    str = "Dados do livro: ";
    str += "\n" + liv.getCodigo() + ": " + liv.getTitulo();
    JOptionPane.showMessageDialog(null,str);
    
    liv.setCodigo( -15 );
    liv.setTitulo( "Java" );
    
    str = "Dados do livro: ";
    str += "\n" + liv.getCodigo() + ": " + liv.getTitulo();
    JOptionPane.showMessageDialog(null,str);
    
    System.exit(0);
  }
}