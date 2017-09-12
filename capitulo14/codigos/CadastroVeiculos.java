import javax.swing.JOptionPane;

public class CadastroVeiculos{
  public static void main(String[] args) {
    Veiculo[] dados = new Veiculo[100];
    
    dados[0] = new Onibus("ZAB-4613",2009,44);
    dados[1] = new Caminhao("EBA-9953",2008,2);
    dados[2] = new Caminhao("BEZ-2288",2009,3);
    dados[3] = new Onibus("ACC-7728",2005,44);
    
    String str = "Tipo dos objetos:";
    for (int i = 0; i < dados.length; i++) {
      if (dados[i] == null) break;
      str += "\n" + (i + 1) + ") " + dados[i].getClass().getName();
    }
    JOptionPane.showMessageDialog(null, str);
    
    for (Veiculo v: dados) {
      if (v == null) break;
      v.exibirDados();
    }
    
    System.exit(0);
  }
}
