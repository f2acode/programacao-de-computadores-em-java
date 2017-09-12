public class ClienteEmpresa extends Cliente {
  private String IE;
  private String CNPJ;
  
  public ClienteEmpresa() {
    this("","","","");
  }
  
  public ClienteEmpresa(String nome, String fone, String IE,
    String CNPJ) {
    super(nome,fone);
    this.IE = IE;
    this.CNPJ = CNPJ;
  }
  
  public String getIE() {
    return IE;
  }
  
  public String getCNPJ() {
    return CNPJ;
  }
  
  public void setIE(String IE) {
    this.IE = IE;
  }
  
  public void setCNPJ(String CNPJ) {
    this.CNPJ = CNPJ;
  }
}
