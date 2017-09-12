import javax.swing.JOptionPane;

public class Veiculo {
  private String placa;
  private int ano;
  
  public Veiculo() {
    this("",0);
  }
  
  public Veiculo(String placa, int ano) {
    this.placa = placa;
    this.ano = ano;
  }
  
  public String getPlaca() {
    return placa;
  }
  
  public int getAno() {
    return ano;
  }
  
  public void setPlaca(String placa) {
    this.placa = placa;
  }
  
  public void setAno(int ano) {
    this.ano = ano;
  }
  
  public void setAno(String ano) {
    this.ano = Integer.parseInt(ano);
  }
  
  public void exibirDados() {
    String str = "Dados do ve�culo:" +
      "\n\nPlaca: " + placa +
      "\nAno: " + ano;
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
  }
}
