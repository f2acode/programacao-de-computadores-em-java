package br.com.livro.capitulo08.exemplos;
import javax.swing.JOptionPane;

public class Musicas {
  public static void main(String[] args) {
    String lista = "Lista de m�sicas:";
    for (byte numero = 1; numero <= 10; numero++) {
      String str, artista = "", musica = "";
      
      while (true) {
        str = "M�sica " + numero + ": nome do artista";
        str = JOptionPane.showInputDialog(null,str);
        if (str == null) break;
        artista = str.trim().toUpperCase();
        
        if (artista.length() < 2 || artista.length() > 30) {
          str = "O nome informado � inv�lido!";
          JOptionPane.showMessageDialog(null,str,"Erro",0);
          continue;
        }
        
        break;
      }
      
      if (str == null) break;
      
      while (true) {
        str = "M�sica " + numero + ": nome da m�sica";
        str = JOptionPane.showInputDialog(null,str);
        if (str == null) break;
        musica = str.trim().toLowerCase();
        
        if (musica.length() < 5 || musica.length() > 40) {
          str = "O nome informado � inv�lido!";
          JOptionPane.showMessageDialog(null,str,"Erro",0);
          continue;
        }
        
        break;
      }
      
      if (str == null) break;
      
      lista += "\n" + artista + " - " + musica;
    }
    
    JOptionPane.showMessageDialog(null,lista);
    System.exit(0);
  }
}