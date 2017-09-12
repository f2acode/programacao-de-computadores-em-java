import static javax.swing.JOptionPane.*;

public class OperadorConta {
  public static void main(String[] args) {
    Conta conta = null;
    String str;
    
    while (true) {
      str = "Informe o n�mero da conta";
      str = showInputDialog(str);
      if (str == null) System.exit(0);
      
      try {
        conta = new Conta(str);
        break;
      } catch(Exception ex) {
        showMessageDialog(null,"N�mero inv�lido!","Erro",0);
      }
    }
    
    while (true) {
      str = "Informe o limite da conta";
      str = showInputDialog(str);
      if (str == null) System.exit(0);
      
      try {
        conta.setLimite(str);
        break;
      } catch(Exception ex) {
        showMessageDialog(null,ex.getMessage(),"Erro",0);
      }
    }
    
    while (true) {
      str = "Que opera��o deseja realizar?" +
        "\nD = Dep�sito \nS = Saque";
      
      str = showInputDialog(str);
      if (str == null) System.exit(0);
      String operacao = str.trim().toUpperCase();
      
      if (!operacao.equals("D") && !operacao.equals("S")) {
        showMessageDialog(null,"Opera��o inv�lida!","Erro",0);
        continue;
      }
      
      str = "Informe o valor da opera��o";
      str = showInputDialog(str);
      if (str == null) System.exit(0);
        
      double valor = Double.parseDouble(str);
      
      if (operacao.equals("D")) conta.depositar(valor);
      
      if (operacao.equals("S"))
        try {
          conta.sacar(valor);
        } catch(Exception ex) {
          showMessageDialog(null,ex.getMessage(),"Erro",0);
        }
      
      showMessageDialog(null,conta);
    }
  }
}