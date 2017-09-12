import javax.swing.JOptionPane;

public class Onibus extends Veiculo {
  private int assentos;
  
  public Onibus(String placa, int ano, int assentos) {
    super(placa,ano);
    this.assentos = assentos;
  }
  
  public int getAssentos() {
    return assentos;
  }
  
  public void setAssentos(int assentos) {
    this.assentos = assentos;
  }
  
  public void exibirDados() {
    String str = "Dados do �nibus:" +
      "\n\nPlaca: " + getPlaca() +
      "\nAno: " + getAno() +
      "\nAssentos: " + assentos;
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
  }
}
