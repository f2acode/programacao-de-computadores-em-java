package br.com.livro.capitulo15.exemplos;
public class Alimento extends Produto {
  public double calcularIcms() {
    return super.getPreco() * 0.12;
  }
}
