package br.com.livro.capitulo21.exemplos;
import java.util.Comparator;

public class FunNomeComparator implements Comparator<Funcionario>{
  public int compare(Funcionario func1, Funcionario func2) {
    return func1.getNome().compareToIgnoreCase(func2.getNome());
  }
}
