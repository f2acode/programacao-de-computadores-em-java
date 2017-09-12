import javax.swing.JOptionPane;

public class TesteFolha {
  public static void main(String[] args) {
    Funcionario[] dados = new Funcionario[10];
    
    try {
      FPadrao fpa = new FPadrao();
      fpa.setMatricula(1);
      fpa.setNome("Marcelo Moraes");
      fpa.setSalario(2568.5);
      dados[0] = fpa;
      
      FComissionado fco = new FComissionado();
      fco.setMatricula(2);
      fco.setNome("Silvia Santos");
      fco.setSalario(2000);
      fco.setPercentual(10);
      fco.setVendas(8000);
      dados[1] = fco;
      
      FProdutividade fpr = new FProdutividade();
      fpr.setMatricula(3);
      fpr.setNome("Vanessa Vieira");
      fpr.setSalario(3000);
      fpr.setProducao(1500);
      fpr.setValor(0.5);
      dados[2] = fpr;
    }
    catch (EDadoInvalido di) {
      JOptionPane.showMessageDialog(null,di.getMessage(), "Erro",
        JOptionPane.ERROR_MESSAGE );
      System.exit(0);
    }
    
    String str = "";
    for (Funcionario f: dados) {
      if (f == null) break;
      str += "\n" + f;
    }
    
    JOptionPane.showMessageDialog(null, str,"Folha de Pagamento",
      JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}
