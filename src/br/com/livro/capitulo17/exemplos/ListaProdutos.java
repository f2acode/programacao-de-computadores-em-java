package br.com.livro.capitulo17.exemplos;
import static javax.swing.JOptionPane.*;

public class ListaProdutos {
  public static VetorObjetos<Produto> vetor;
  
  public static void main(String[] args) {
    String str = showInputDialog("N�mero m�ximo de produtos");
    if (str == null) System.exit(0);
    int maximo = Integer.parseInt(str);
    vetor = new VetorObjetos<Produto>( maximo );
    
    while (true) {
      int opcao = showOptionDialog(null, "Escolha uma op��o", 
          "Cadastro de produtos", 0, 1, null, 
          new String[]{"Incluir","Excluir �ltimo","Excluir todos",
          "Consultar �ltimo","Relat�rio"}, "Incluir");
      if (opcao == -1) System.exit(0);
      if (opcao == 0) incluir();
      if (opcao == 1) excluir();
      if (opcao == 2) esvaziar();
      if (opcao == 3) consultar();
      if (opcao == 4) listar();
    }
  }
  
  public static void incluir() {
    if (vetor.cheio()) {
      showMessageDialog(null, "Lista cheia!","Erro",ERROR_MESSAGE);
      return;
    }
    
    String str = showInputDialog("Descri��o do produto");
    if (str == null) return;
    String descricao = str;
    
    str = showInputDialog("Valor do produto");
    if (str == null) return;
    double valor = Double.parseDouble(str);
    
    
    vetor.incluirObjeto( new Produto(descricao,valor) );
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
