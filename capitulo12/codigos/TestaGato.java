import javax.swing.JOptionPane;

public class TestaGato {
  public static void main(String[] args) {
    Gato meu_gato = new Gato("Sito",'M',12,4);
    
    String str = "Dados do meu gato:\n";
    str += "\nNome: "  + meu_gato.nome;
    str += "\nSexo: ";
    if (meu_gato.sexo == 'M') str += "Macho";
    else  str += "F�mea";
    str += "\nIdade: " + meu_gato.idade + " anos";
    str += "\nPeso: "  + meu_gato.peso  + " kg";
    
    JOptionPane.showMessageDialog(null,str);
    System.exit(0);
  }
}