import static javax.swing.JOptionPane.*;
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploLinkedList {
  private static LinkedList<Contato> lista;
  
  public static void main(String[] args) {
    lista = new LinkedList<Contato>();
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o", 
        "Cadastro de contatos", 0, 3, null, new String[]{
        "Incluir","Excluir","Consultar","Relat�rio"},"Incluir");
      if (i == -1) System.exit(0);
      if (i == 0) incluir();
      else if (i == 1) excluir();
      else if (i == 2) consultar();
      else if (i == 3) relatorio();
    }
  }
  
  private static void incluir() {
    Contato contato = new Contato();
    
    String str = showInputDialog("Informe o nome");
    if (str == null) return;
    contato.setNome(str);
    
    if (lista.contains(contato)) {
      showMessageDialog(null, "Contato j� cadastrado!","Erro",
        ERROR_MESSAGE);
      return;
    }
    
    str = showInputDialog("Informe o e-mail");
    if (str == null) return;
    contato.setEmail(str);
    
    int i = showOptionDialog(null, "Escolha o local da inclus�o", 
      "Cadastro de contatos", 0, 3, null, new String[]{
      "In�cio","Final"},"Final");
    if (i == 0) lista.addFirst( contato );
    else if (i == 1) lista.addLast( contato );
  }
  
  private static void excluir() {
    if (lista.isEmpty()) {
      showMessageDialog(null, "Lista vazia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    Contato contato = null;
    
    int i = showOptionDialog(null, "Escolha o local da exclus�o", 
      "Cadastro de contatos", 0, 3, null, new String[]{
      "In�cio","Final"},"Final");
    if (i == 0) contato = lista.removeFirst( );
    else if (i == 1) contato = lista.removeLast( );
    
    if (contato != null)
      showMessageDialog(null, "Contato removido:\n" + contato);
  }
  
  private static void consultar() {
    if (lista.isEmpty()) {
      showMessageDialog(null, "Lista vazia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    Contato contato = null;
    
    int i = showOptionDialog(null, "Escolha o local da consulta", 
        "Cadastro de contatos", 0, 3, null, new String[]{
        "In�cio","Final"},"Final");
    if (i == 0) contato = lista.getFirst( );
    else if (i == 1) contato = lista.getLast( );
    
    if (contato != null)
      showMessageDialog(null, "Dados do contato:\n" + contato);
  }
  
  private static void relatorio() {
    String str = "Relat�rio de contatos:\n";
    Iterator<Contato> it = lista.descendingIterator();
    while(it.hasNext())
      str += "\n" + it.next();
    showMessageDialog(null, str);
  }
}
