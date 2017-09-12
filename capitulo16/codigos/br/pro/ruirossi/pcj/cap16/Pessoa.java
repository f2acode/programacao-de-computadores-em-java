package br.pro.ruirossi.pcj.cap16;

public class Pessoa {
  private String nome;
  private double peso;
  private double altura;
  private double imc;
  
  public Pessoa(String nome, double peso, double altura) {
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
    imc = calcularIMC(peso,altura);
  }
  
  public static double calcularIMC(double peso, double altura) {
    return peso / Math.pow(altura,2);
  }
  
  public String toString() {
    return nome + " - " + peso + " - " + altura + " - " + imc;
  }
}
