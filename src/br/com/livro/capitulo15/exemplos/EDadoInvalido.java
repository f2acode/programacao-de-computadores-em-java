package br.com.livro.capitulo15.exemplos;
public class EDadoInvalido extends Exception {
  public EDadoInvalido() {
    super("Dado inv�lido!");
  }
  
  public EDadoInvalido(String mensagem) {
    super("Dado inv�lido!\n" + mensagem);
  }
}
