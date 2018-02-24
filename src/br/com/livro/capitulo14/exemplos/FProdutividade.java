package br.com.livro.capitulo14.exemplos;
public class FProdutividade extends Funcionario {
  private double valor;
  private int producao;
  
  public double getValor() {
    return valor;
  }
  
  public int getProducao() {
    return producao;
  }
  
  public void setValor(double valor) throws EDadoInvalido {
    if (valor <= 0)
      throw new EDadoInvalido("O valor unit�rio deve ser positivo");
    
    this.valor = valor;
  }
  
  public void setValor(String valor) throws EDadoInvalido {
    try {
      setValor( Double.parseDouble(valor) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O valor unit�rio deve ser um n�mero");
    }
  }
  
  public void setProducao(int producao) throws EDadoInvalido {
    if (producao < 0)
      throw new EDadoInvalido("A producao n�o deve ser negativa");
    
    this.producao = producao;
  }
  
  public void setProducao(String producao) throws EDadoInvalido {
    try {
      setProducao( Integer.parseInt(producao) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("A produ��o deve ser um inteiro");
    }
  }
  
  public double calcularProventos() {
    return super.getSalario() + (producao * valor);
  }
}
