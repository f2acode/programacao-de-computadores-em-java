package br.com.livro.capitulo15.exemplos;
public class Circulo implements AreaCalculavel {
  private double diametro;
  
  public Circulo(double diametro) {
    this.diametro = diametro;
  }
  
  public double calcularArea() {
    double raio = diametro / 2;
    return Math.PI * Math.pow(raio,2);
  }
}
