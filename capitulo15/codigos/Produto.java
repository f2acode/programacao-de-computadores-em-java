import java.text.NumberFormat;

public abstract class Produto implements Tributavel {
  private int codigo;
  private String descricao;
  private double preco;
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public double getPreco() {
    return preco;
  }
  
  public void setCodigo(int codigo) throws EDadoInvalido{
    if (codigo <= 0)
      throw new EDadoInvalido("O c�digo deve ser positivo");
    
    this.codigo = codigo;
  }
  
  public void setCodigo(String codigo) throws EDadoInvalido {
    try {
      setCodigo(Integer.parseInt(codigo));
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O c�digo deve ser um inteiro");
    }
  }
  
  public void setDescricao(String descricao) throws EDadoInvalido {
    descricao = descricao.trim();
    
    if (descricao.length() < 2)
      throw new EDadoInvalido("Descri��o com menos de 2 caracteres");
      
    if (descricao.length() > 50)
      throw new EDadoInvalido("Nome com mais de 50 caracteres");
      
    this.descricao = descricao;
  }
  
  public void setPreco(double preco) throws EDadoInvalido {
    if (preco <= 0)
      throw new EDadoInvalido("O pre�o deve ser positivo");
    
    this.preco = preco;
  }
  
  public void setPreco(String preco) throws EDadoInvalido {
    try {
      setPreco( Double.parseDouble(preco) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O pre�o deve ser um n�mero");
    }
  }
  
  public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Produto " + codigo + " (" + 
      this.getClass().getName() + "): " + descricao +  " - " + 
      nf.format(preco);
  }
}
