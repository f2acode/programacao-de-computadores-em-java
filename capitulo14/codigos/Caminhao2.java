import javax.swing.JOptionPane;

public final class Caminhao2 extends Veiculo2 {
  private int eixos;
  
  public Caminhao2(String placa, int ano, int eixos) {
    super.setPlaca(placa);
    super.setAno(ano);
    this.eixos = eixos;
  }
  
  public int getEixos() {
    return eixos;
  }
  
  public void setEixos(int eixos) {
    this.eixos = eixos;
  }
  
  public void exibirDados() {
    String str = "Dados do �nibus:" +
      "\n\nPlaca: " + getPlaca() +
      "\nAno: " + getAno() +
      "\nEixos: " + eixos;
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
  }
}
