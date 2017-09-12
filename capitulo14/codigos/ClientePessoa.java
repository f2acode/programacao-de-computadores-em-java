public class ClientePessoa extends Cliente {
  private String RG;
  private String CPF;
  
  public ClientePessoa() {
    this("","","","");
  }
  
  public ClientePessoa(String nome, String fone,String RG,
    String CPF) {
    super(nome,fone);
    this.RG = RG;
    this.CPF = CPF;
  }
  
  public String getRG() {
    return RG;
  }
  
  public String getCPF() {
    return CPF;
  }
  
  public void setRG(String RG) {
    this.RG = RG;
  }
  
  public void setCPF(String CPF) {
    this.CPF = CPF;
  }
}
