package br.com.livro.capitulo21.exemplos;
import java.util.Comparator;

public class FunSalarioComparator implements Comparator<Funcionario>{
  public int compare(Funcionario func1, Funcionario func2) {
    if (func1.getSalario() > func2.getSalario()) return 1;
    else if (func1.getSalario() < func2.getSalario()) return -1;
    else return 0;
  }
}
