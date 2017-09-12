import javax.swing.JOptionPane;

public class CadastroEstadosValidacao {
  public static void main(String[] args) {
    Estado[] registros = new Estado[26];
    
    for (int indice = 0; indice < registros.length; indice++) {
      Estado estado = new Estado();
      String str;
      
      while(true) {
        str = JOptionPane.showInputDialog("Nome do estado");
        if (str == null) break;
        if ( estado.validarNome(str) ) {
          estado.nome = str.trim();
          break;
        }
      }
      if (str == null) break;
      
      while(true) {
        str = JOptionPane.showInputDialog("Sigla do estado");
        if (str == null) break;
        if ( estado.validarSigla(str) ) {
          estado.sigla = str.trim();
          break;
        }
      }
      if (str == null) break;
      
      registros[indice] = estado;
    }
    
    String relatorio = "Relat�rio de estados:";
    for (int posicao = 0; posicao < registros.length; posicao++) {
      Estado estado = registros[posicao];
      if (estado == null) break;
      relatorio += "\n" + estado.recuperarDados();
    }
    
    JOptionPane.showMessageDialog(null,relatorio);
    System.exit(0);
  }
}