package br.com.livro.capitulo15.exemplos;
import static javax.swing.JOptionPane.*;
import java.text.NumberFormat;

public class CadastroProdutos {
  public static void main(String[] args) {
    Tributavel[] registros =  new Tributavel[100];
    
    for (int i = 0; i < registros.length; i++) {
      Produto produto = null;
      String str = "";
      
      int tipo = showOptionDialog(null,"Tipo do produto",
        "Selecione",0,QUESTION_MESSAGE,null,
        new String[]{"Cosm�tico","Alimento"},"Cosm�tico");
      if(tipo == -1) break;
      if(tipo == 0) produto = new Cosmetico();
      else if(tipo == 1) produto = new Alimento();
    
      while (true) {
        str = showInputDialog(null,"Informe o c�digo");
        if (str == null) break;
        try {
          produto.setCodigo(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      while (true) {
        str = showInputDialog(null,"Informe a descri��o");
        if (str == null) break;
        try {
          produto.setDescricao(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      while (true) {
        str = showInputDialog(null,"Informe o pre�o");
        if (str == null) break;
        try {
          produto.setPreco(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      registros[i] = produto;
    }
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String str = "";
    for (Tributavel t: registros) {
      if (t == null) break;
      str += "\n" + t + " - ICMS: " + nf.format( t.calcularIcms() );
    }
    if (str.length() == 0) System.exit(0);
    
    showMessageDialog(null, str,"Lista de Produtos",
      INFORMATION_MESSAGE);
    System.exit(0);
  }
}
