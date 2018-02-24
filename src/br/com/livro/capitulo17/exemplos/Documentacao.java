package br.com.livro.capitulo17.exemplos;
import javax.swing.JOptionPane;

/**
 * Essa classe visa ilustrar o uso de coment�rios comuns
 * de documenta��o.
 * @author Rui Rossi dos Santos
 * @version 1
*/
public class Documentacao {
  /**
   * Armazena um texto qualquer.
   * @see java.lang.String
  */
  private String texto;
  
  /**
   * Construtor padr�o da classe. Ele atribui o conte�do
   * de seu par�metro texto ao atributo texto da classe.
   * @param texto O texto a ser atribu�do ao atributo texto.
  */
  public Documentacao(String texto) {
    this.texto = texto;
  }
  
  /**
   * Esse m�todo inverte o conte�do do atributo texto.
   * @return Uma <code>String</code> com o conte�do 
   * invertido do atributo texto.
  */
  public String inverso() {
    String str = "";
    for(int i = 0;i < texto.length(); i++)
      str = texto.charAt(i) + str;
    return str;
  }
  
  /**
   * M�todo que torna esta classe execut�vel e permite test�-la.
   * Cria uma inst�ncia da classe Documentacao e a usa para
   * exibir o inverso da palavra informada.
   * @see javax.swing.JOptionPane
  */
  public static void main(String[] args) {
    String str = JOptionPane.showInputDialog("Informe uma palavra");
    if (str == null) System.exit(0);
    
    Documentacao dc = new Documentacao(str);
    str = dc.inverso();
    JOptionPane.showMessageDialog(null,str);
    System.exit(0);
  }
}
