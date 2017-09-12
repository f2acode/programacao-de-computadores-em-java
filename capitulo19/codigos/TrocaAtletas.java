import static javax.swing.JOptionPane.*;

public class TrocaAtletas {
  private static Atleta[] dados;
  private static int qtde;
  
  public static void main(String[] args) {
    dados = new Atleta[50];
    qtde = 0;
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o",
          "Ordena��o por Troca - Atletas", 0, 3, null,
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
    
    Atleta att = new Atleta();
    String str = showInputDialog("Informe o n�mero do atleta");
    if (str == null) return;
    try { att.setNumero(str); }
    catch(Exception ex) {
      showMessageDialog(null,ex.getMessage(),"Erro",ERROR_MESSAGE);
      return;
    }
    
    str = showInputDialog("Informe o nome do atleta");
    if (str == null) return;
    att.setNome(str);
    
    dados[qtde++] = att;
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
    
    String str = "Lista de atletas:";
    for (Atleta a : dados) {
      if (a == null) break;
      str += "\n" + a;
    }
    
    showMessageDialog(null,str);
  }
}
