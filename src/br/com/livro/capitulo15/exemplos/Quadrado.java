package br.com.livro.capitulo15.exemplos;
public class Quadrado implements AreaCalculavel {
  private double lado;
  
  public Quadrado(double lado) {
    this.lado = lado;
  }
  
  public double calcularArea() {
    return lado * lado;
  }
}

