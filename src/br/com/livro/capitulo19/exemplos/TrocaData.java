package br.com.livro.capitulo19.exemplos;
import static javax.swing.JOptionPane.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class TrocaData {
  private static Date[] dados;
  private static int qtde;
  
  public static void main(String[] args) {
    dados = new Date[100];
    qtde = 0;
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o",
          "Ordena��o por Troca - Datas", 0, 3, null,
          new String[]{"Incluir","Ordenar","Listar"}, "Incluir");
      if (i == -1) System.exit(0);
      if (i == 0) incluir();
      else if (i == 1) ordenar();
      else if (i == 2) listar();
    }
  }
  
  private static void incluir() {
    if (qtde == dados.length) {
      showMessageDialog(null,"Limite excedido","Erro",ERROR_MESSAGE);
      return;
    }
    
    String str = showInputDialog(null,"Informe uma data");
    if (str == null) return;
    try {
      DateFormat df = DateFormat.getDateInstance();
      dados[qtde++] = df.parse(str);
    }
    catch(ParseException pe) {
      showMessageDialog(null,"Dado inv�lido!","Erro",ERROR_MESSAGE);
    }
  }
  
  private static void ordenar() {
    if (qtde == 0) {
      showMessageDialog(null,"N�o h� dados!","Erro",ERROR_MESSAGE);
      return;
    }
    
    OrdenacaoTroca.ordenar(dados,qtde);
    showMessageDialog(null,"Ordena��o conclu�da!");
  }
  
  private static void listar() {
    if (qtde == 0) {
      showMessageDialog(null,"N�o h� dados!","Erro",ERROR_MESSAGE);
      return;
    }
    
    DateFormat df = DateFormat.getDateInstance();
    String str = "Lista de datas:";
    for (int i = 0; i < qtde; i++) {
      if (i % 10 == 0) str += "\n";
      str += df.format( dados[i] ) + "  ";
    }
    
    showMessageDialog(null,str);
  }
}
