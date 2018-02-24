package br.com.livro.capitulo13.exemplos;
import javax.swing.JOptionPane;

public class TestaDisciplina {
  public static void main(String[] args) {
    Disciplina dis = new Disciplina();
    
    String str = "Dados da disciplina: ";
    str += "\n" + dis.getCodigo() + ": " + dis.getDescricao();
    JOptionPane.showMessageDialog(null,str);
    
    dis.setCodigo( 1 );
    dis.setDescricao( "Programa��o III" );
    
    str = "Dados da disciplina: ";
    str += "\n" + dis.getCodigo() + ": " + dis.getDescricao();
    JOptionPane.showMessageDialog(null,str);
    
    dis.setCodigo( -15 );
    dis.setDescricao( "Pro" );
    
    str = "Dados da disciplina: ";
    str += "\n" + dis.getCodigo() + ": " + dis.getDescricao();
    JOptionPane.showMessageDialog(null,str);
    
    System.exit(0);
  }
}