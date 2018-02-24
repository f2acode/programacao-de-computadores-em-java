package br.com.livro.capitulo12.exemplos;
public class Matematico {
  double somar(double valor1,double valor2) {
    return valor1 + valor2;
  }
  
  double subtrair(double valor1,double valor2) {
    return valor1 - valor2;
  }
  
  double multiplicar(double valor1,double valor2) {
    return valor1 * valor2;
  }
  
  double dividir(double dividendo, double divisor) {
    return dividendo / divisor;
  }
  
  long fatorial(byte valor) {
    if (valor == 0) return 1;
    
    long resultado = valor--;
    while(valor > 0) resultado = resultado * valor--;
    return resultado;
  }
}