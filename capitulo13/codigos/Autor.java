public class Autor {
  private int codigo;
  private String nome;
  
  public Autor() {
    nome = "";
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setCodigo(int codigo) throws Exception{
    if (codigo < 1)
      throw new IllegalArgumentException("C�digo abaixo do m�nimo!");
      
    this.codigo = codigo;
  }
  
  public void setCodigo(String codigo) throws Exception{
    try {
      setCodigo( Integer.parseInt(codigo) );
    }
    catch (NumberFormatException nfe) {
      throw new NumberFormatException("C�digo inv�lido!");
    }
  }
  
  public void setNome(String nome) throws Exception{
    if (nome == null) 
      throw new NullPointerException("O nome n�o pode ser nulo!");
      
    nome = nome.trim();
    
    if (nome.length() < 5 || nome.length() > 50)
      throw new IllegalArgumentException("Nome inv�lido!");
      
    this.nome = nome;
  }
}