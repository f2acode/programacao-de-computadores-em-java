import static javax.swing.JOptionPane.*;

public class CadastroAutores {
  public static void main(String[] args) {
    Autor[] registros = new Autor[100];
    
    for (int indice = 0; indice < registros.length; indice++) {
      Autor aut = new Autor();
      String str;
      
      while (true) {
        try {
          str = showInputDialog("C�digo do autor");
          if (str == null) break;
          aut.setCodigo( str );
          break;
        } catch(Exception ex) {
          showMessageDialog(null,ex.getMessage(),"Erro",0);
        }
      }
      if (str == null) break;
      
      while (true) {
        try {
          str = showInputDialog("Nome do autor");
          if (str == null) break;
          aut.setNome( str );
          break;
        } catch(Exception ex) {
          showMessageDialog(null,ex.getMessage(),"Erro",0);
        }
      }
      if (str == null) break;
      
      registros[indice] = aut;
    }
    
    String relatorio = "Relat�rio de autores:";
    for (Autor aut : registros) {
      if (aut == null) break;
      relatorio += "\n" + aut.getCodigo() + " - " + aut.getNome();
    }
    
    showMessageDialog(null,relatorio);
    System.exit(0);
  }
}