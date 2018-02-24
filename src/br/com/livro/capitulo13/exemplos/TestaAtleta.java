package br.com.livro.capitulo13.exemplos;
import javax.swing.JOptionPane;

public class TestaAtleta {
  public static void main(String[] args) {
    Atleta rodrigo = new Atleta("Rodrigo P.",Atleta.SEXO_MASCULINO);
    JOptionPane.showMessageDialog(null,rodrigo);
    
    Atleta mara = new Atleta("Mara A.",Atleta.SEXO_FEMININO);
    JOptionPane.showMessageDialog(null,mara);
    
    System.exit(0);
  }
}