package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploPesquisaBinaria {
  private static List<Funcionario> lista;
  
  public static void main(String[] args) {
    lista = new LinkedList<Funcionario>();
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o", 
        "Cadastro de funcion�rios", 0, 3, null, new String[]{
        "Incluir","Pesquisar","Relat�rio"},"Incluir");
      if (i == -1) System.exit(0);
      if (i == 0) incluir();
      else if (i == 1) pesquisar();
      else if (i == 2) exibir();
    }
  }
  
  private static void incluir() {
    Funcionario fun = new Funcionario();
    
    String str = showInputDialog("Matr�cula do funcion�rio");
    if (str == null) return;
    fun.setMatricula( Integer.parseInt(str) );
    
    str = showInputDialog("Nome do funcion�rio");
    if (str == null) return;
    fun.setNome( str );
    
    str = showInputDialog("Sal�rio do funcion�rio");
    if (str == null) return;
    fun.setSalario( Double.parseDouble(str) );
    
    lista.add(fun);
  }
  
  private static void pesquisar() {
    int i = showOptionDialog(null, "Op��o de pesquisa:", 
      "Cadastro de funcion�rios", 0, 3, null, new String[]{
      "Matr�cula","Nome","Sal�rio"},"Matr�cula");
    if (i == -1) return;
    if (i == 0) pesquisarPelaMatricula();
    else if (i == 1) pesquisarPeloNome();
    else if (i == 2) pesquisarPeloSalario();
  }
  
  private static void pesquisarPelaMatricula() {
    Collections.sort(lista);
    
    Funcionario fun = new Funcionario();
    String str = showInputDialog("Matr�cula do funcion�rio");
    if (str == null) return;
    fun.setMatricula( Integer.parseInt(str) );
    
    int indice = Collections.binarySearch(lista, fun);
    
    if (indice  < 0) showMessageDialog(null, "N�o encontrado!");
    else showMessageDialog(null, "Encontrado no �ndice " + indice);
  }
  
  private static void pesquisarPeloNome() {
    Collections.sort(lista, new FunNomeComparator());
    
    Funcionario fun = new Funcionario();
    String str = showInputDialog("Nome do funcion�rio");
    if (str == null) return;
    fun.setNome( str );
    
    int indice = Collections.binarySearch(lista, fun,
      new FunNomeComparator());
    
    if (indice  < 0) showMessageDialog(null, "N�o encontrado!");
    else showMessageDialog(null, "Encontrado no �ndice " + indice);
  }
  
  private static void pesquisarPeloSalario() {
    Collections.sort(lista, new FunSalarioComparator());
    
    Funcionario fun = new Funcionario();
    String str = showInputDialog("Sal�rio do funcion�rio");
    if (str == null) return;
    fun.setSalario( Double.parseDouble(str) );
    
    int indice = Collections.binarySearch(lista, fun,
      new FunSalarioComparator());
    
    if (indice  < 0) showMessageDialog(null, "N�o encontrado!");
    else showMessageDialog(null, "Encontrado no �ndice " + indice);
  }
  
  private static void exibir() {
    String str = "Funcion�rios cadastrados:\n";
    for (Funcionario fun : lista)
      str += "\n" + fun;
    showMessageDialog(null, str);
  }
}
