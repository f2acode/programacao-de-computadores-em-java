package br.com.livro.capitulo17.exemplos;
import static javax.swing.JOptionPane.*;

public class ListaCompras {
  public static VetorObjetos<String> vetor;
  
  public static void main(String[] args) {
    String str = showInputDialog("N�mero m�ximo de itens da lista");
    if (str == null) System.exit(0);
    int maximo = Integer.parseInt(str);
    vetor = new VetorObjetos<String>( maximo );
    
    while (true) {
      int opcao = showOptionDialog(null, "Escolha uma op��o", 
          "Lista de compras", 0, 1, null, new String[]{
          "Incluir item","Excluir �ltimo","Esvaziar lista",
          "Consultar �ltimo","Ver lista"}, "Incluir item");
      if (opcao == -1) System.exit(0);
      if (opcao == 0) incluir();
      else if (opcao == 1) excluir();
      else if (opcao == 2) esvaziar();
      else if (opcao == 3) consultar();
      else if (opcao == 4) listar();
    }
  }
  
  public static void incluir() {
    if (vetor.cheio()) {
      showMessageDialog(null, "Lista cheia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    String str = showInputDialog("Novo item");
    if (str == null) return;
    vetor.incluirObjeto(str);
  }
  
  public static void excluir() {
    if (vetor.vazio()) {
      showMessageDialog(null, "Lista vazia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    showMessageDialog(null, "Removido: " + vetor.excluirUltimo());
  }
  
  public static void esvaziar() {
    if (vetor.vazio()) {
      showMessageDialog(null, "Lista vazia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    vetor.excluirTodos();
    showMessageDialog(null, "Agora a lista est� vazia!");
  }
  
  public static void consultar() {
    if (vetor.vazio()) {
      showMessageDialog(null, "Lista vazia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    showMessageDialog(null, "�ltimo item: " + vetor.verUltimo());
  }
  
  public static void listar() {
    if (vetor.vazio()) {
      showMessageDialog(null, "Lista vazia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    showMessageDialog(null, vetor.listarObjetos());
  }
}
