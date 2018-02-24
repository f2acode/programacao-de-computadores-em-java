package br.com.livro.capitulo14.exemplos;
import static javax.swing.JOptionPane.*;

public class FolhaPagamento {
  public static void main(String[] args) {
    Funcionario[] registros = new Funcionario[1000];
    String str = "";
    
    for (int i = 0; i < registros.length; i++) {
      int tipo = showOptionDialog(null,"Tipo do funcion�rio",
        "Selecione",0,QUESTION_MESSAGE,null,
        new String[]{"Padr�o","Comissionado","Produtividade"},
        "Padr�o");
      if(tipo == -1) break;
      if(tipo == 0) registros[i] = new FPadrao();
      else if(tipo == 1) registros[i] = new FComissionado();
      else if(tipo == 2) registros[i] = new FProdutividade();
      
      while (true) {
        str = showInputDialog(null,"Informe a matr�cula");
        if (str == null) break;
        try {
          registros[i].setMatricula(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      while (true) {
        str = showInputDialog(null,"Informe o nome");
        if (str == null) break;
        try {
          registros[i].setNome(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      while (true) {
        str = showInputDialog(null,"Informe o sal�rio");
        if (str == null) break;
        try {
          registros[i].setSalario(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      if (registros[i] instanceof FComissionado) {
        while (true) {
          str = showInputDialog(null,"Informe o % da comiss�o");
          if (str == null) break;
          try {
            ((FComissionado)registros[i]).setPercentual(str);
            break;
          }
          catch(EDadoInvalido di) {
            showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
          }
        }
        if (str == null) break;
      
        while (true) {
          str = showInputDialog(null,"Informe o total de vendas");
          if (str == null) break;
          try {
            ((FComissionado)registros[i]).setVendas(str);
            break;
          }
          catch(EDadoInvalido di) {
            showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
          }
        }
        if (str == null) break;
      }
      
      if (registros[i] instanceof FProdutividade) {
        while (true) {
          str = showInputDialog(null,"Valor pago por unidade");
          if (str == null) break;
          try {
            ((FProdutividade)registros[i]).setValor(str);
            break;
          }
          catch(EDadoInvalido di) {
            showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
          }
        }
        if (str == null) break;
      
        while (true) {
          str = showInputDialog(null,"N� de unidades produzidas");
          if (str == null) break;
          try {
            ((FProdutividade)registros[i]).setProducao(str);
            break;
          }
          catch(EDadoInvalido di) {
            showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
          }
        }
        if (str == null) break;
      }
    }
    
    str = "";
    for (Funcionario f: registros) {
      if (f == null || f.getSalario() == 0) break;
      str += "\n" + f;
    }
    if (str.length() == 0) System.exit(0);
    
    showMessageDialog(null, str,"Folha de Pagamento",
      INFORMATION_MESSAGE);
    System.exit(0);
  }
}
