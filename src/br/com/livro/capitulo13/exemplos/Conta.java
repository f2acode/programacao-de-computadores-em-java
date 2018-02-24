package br.com.livro.capitulo13.exemplos;
import java.text.NumberFormat;

public class Conta {
  private int numero;
  private double limite;
  private double saldo;
  
  public Conta(int numero) throws Exception {
    if (numero < 1) throw new Exception();
    this.numero = numero;
  }
  
  public Conta(String numero) throws Exception {
    this( Integer.parseInt(numero) );
  }
  
  public int getNumero() {
    return numero;
  }
  
  public double getLimite() {
    return limite;
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public double getDisponivel() {
    return saldo + limite;
  }
  
  public void setLimite(double limite) throws Exception{
    if (limite < 0)
      throw new Exception("Limite inv�lido!");
      
    this.limite = limite;
  }
  
  public void setLimite(String limite) throws Exception{
    try {
      setLimite( Double.parseDouble(limite) );
    }
    catch (NumberFormatException nfe) {
      throw new Exception("Limite inv�lido!");
    }
  }
  
  public void sacar(double valor) throws Exception {
    if (valor > saldo + limite)
      throw new Exception("Limite excedido!");
      
    saldo -= valor;
  }
  
  public void depositar(double valor) {
    saldo += valor;
  }
  
  public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Conta " + numero + ": " + nf.format(saldo) + " || " +
      nf.format(limite) + " || " + nf.format( getDisponivel() );
  }  
}