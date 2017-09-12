import static javax.swing.JOptionPane.*;

public class CadastroLivros {
  public static void main(String[] args) {
    Livro[] registros = new Livro[100];
    
    for (int indice = 0; indice < registros.length; indice++) {
      Livro liv = new Livro();
      String str;
      
      while (true) {
        try {
          str = showInputDialog("C�digo do livro");
          if (str == null) break;
          liv.setCodigo( Integer.parseInt(str) );
          break;
        } catch(NumberFormatException nfe) {
          showMessageDialog(null,"C�digo inv�lido!","Erro",0);
        } catch(IllegalArgumentException iae) {
          showMessageDialog(null,iae.getMessage(),"Erro",0);
        }
      }
      if (str == null) break;
      
      while (true) {
        try {
          str = showInputDialog("T�tulo do livro");
          if (str == null) break;
          liv.setTitulo( str );
          break;
        } catch(RuntimeException rte) {
          showMessageDialog(null,rte.getMessage(),"Erro",0);
        }
      }
      if (str == null) break;
      
      registros[indice] = liv;
    }
    
    String relatorio = "Relat�rio de livros:";
    for (Livro li : registros) {
      if (li == null) break;
      relatorio += "\n" + li.getCodigo() + " - " + li.getTitulo();
    }
    
    showMessageDialog(null,relatorio);
    System.exit(0);
  }
}