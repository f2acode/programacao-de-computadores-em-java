package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploEstatisticas {
  private static List<Funcionario> lista;
  
  public static void main(String[] args) {
    lista = new LinkedList<Funcionario>();
    
    while (true) {
      int i = showOptionDialog(null, "Escolha uma op��o", 
        "Cadastro de funcion�rios", 0, 3, null, new String[]{
        "Incluir","Limites","Frequ�ncia","Relat�rio"},"Incluir");
      if (i == -1) System.exit(0);
      if (i == 0) incluir();
      else if (i == 1) verLimites();
      else if (i == 2) verFrequencias();
      else if (i == 3) exibir();
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
  
  private static void verLimites() {
    Funcionario menor = Collections.min(lista,
      new FunSalarioComparator());
    Funcionario maior = Collections.max(lista,
      new FunSalarioComparator());
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String str = "Limites salariais:\n" +
      "\nMenor sal�rio: " + nf.format(menor.getSalario()) +
      "\nMaior sal�rio: " + nf.format(maior.getSalario());
    showMessageDialog(null, str);
  }
  
  private static void verFrequencias() {
    Collections.sort(lista, new FunSalarioComparator());
    
    Set<Double> chaves = new TreeSet<Double>();
    List<Double> ocorrencias = new LinkedList<Double>();
    
    for (Funcionario f : lista) {
      chaves.add(f.getSalario());
      ocorrencias.add(f.getSalario());
    }
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String str = "Frequ�ncias:\n";
    for (Double chave : chaves) {
      str += "\n" + nf.format(chave) + ": ";
      str += Collections.frequency(ocorrencias, chave);
    }
    showMessageDialog(null, str);
  }
  
  private static void exibir() {
    Collections.sort(lista, new FunSalarioComparator());
    
    String str = "Funcion�rios cadastrados:\n";
    for (Funcionario fun : lista)
      str += "\n" + fun;
    showMessageDialog(null, str);
  }
}
