import static javax.swing.JOptionPane.*;

public class TesteConexao {
  public static void main(String[] args) {
    try{
      ConexaoComercio c = new ConexaoComercio();
      showMessageDialog(null,"Conex�o aberta!");
      c.fechar();
      showMessageDialog(null,"Conex�o fechada!");
    }
    catch(Exception ex) {
      showMessageDialog(null,ex.getMessage(),"Erro",ERROR_MESSAGE);
    }
    System.exit(0);
  }
}
