package br.com.livro.capitulo14.exemplos;
import java.text.*;

public abstract class Funcionario {
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
  
  public void setMatricula(int matricula) throws EDadoInvalido {
    if (matricula <= 0)
      throw new EDadoInvalido("A matr�cula deve ser positiva");
      
    this.matricula = matricula;
  }
  
  public void setMatricula(String matricula) throws EDadoInvalido {
    try {
      setMatricula(Integer.parseInt(matricula));
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("A matr�cula deve ser um inteiro");
    }
  }
  
  public void setNome(String nome) throws EDadoInvalido{
    nome = nome.trim();
    
    if (nome.length() < 5)
      throw new EDadoInvalido("Nome com menos de 5 caracteres");
      
    if (nome.length() > 50)
      throw new EDadoInvalido("Nome com mais de 50 caracteres");
      
    this.nome = nome;
  }
  
  public void setSalario(double salario) throws EDadoInvalido {
    if (salario <= 0)
      throw new EDadoInvalido("O sal�rio deve ser positivo");
    
    this.salario = salario;
  }
  
  public void setSalario(String salario) throws EDadoInvalido {
    try {
      setSalario( Double.parseDouble(salario) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O sal�rio deve ser um n�mero");
    }
  }
  
  public abstract double calcularProventos();
  
  public String toString() {
    double total = calcularProventos();
    double diferenca = total - salario;
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Funcion�rio " + matricula + ": " + nome + " - " + 
      nf.format(salario) + " + " + nf.format(diferenca) + " = " +
      nf.format(total);
  }
}
