import static javax.swing.JOptionPane.*;

public class PLTeste {
  private static int[] numeros;
  
  public static void main(String[] args) {
    numeros = new int[]{45,23,97,64,12,17,89,72,55,28};
    
    while (true) {
      String str = showInputDialog("Informe um n�mero");
      if (str == null) System.exit(0);
      int numero = Integer.parseInt(str);
      
      int indice = PesquisaLinear.pesquisar(numeros,numeros.length,
          numero);
      
      if (indice == -1) {
        str = "O n�mero " + numero + " n�o foi encontrado!";
        showMessageDialog(null, str, "Erro",ERROR_MESSAGE);
      } else {
        str = "O n�mero " + numero + " est� na posi��o " + indice;
        showMessageDialog(null, str, "Info",INFORMATION_MESSAGE);
      }
    }
  }
}
