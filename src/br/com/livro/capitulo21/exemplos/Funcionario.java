package br.com.livro.capitulo21.exemplos;
import java.text.NumberFormat;

public class Funcionario implements Comparable<Funcionario>{
  private int matricula;
  private String nome;
  private double salario;

  public int getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }
  
  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setSalario(double salario) {
    this.salario = salario;
  }
  
  public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Funcion�rio " + matricula + ": " + nome + " - " + 
      nf.format(salario);
  }

  public int compareTo(Funcionario outro) {
    return this.matricula - outro.matricula;
  }
}
