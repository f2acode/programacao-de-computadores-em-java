import javax.swing.JOptionPane;

public class Exercicio0703{
    public static void main(String[] args){

        String cepOriginal = JOptionPane.showInputDialog(null, "Informe um CEP:");
        
        if(cepOriginal == null)
            System.exit(0);

        int quantidadeCaracteres = cepOriginal.length();
        boolean caracteres = (quantidadeCaracteres == 9) ? true : false;

        Character sextaPosicao = cepOriginal.charAt(5);
        boolean temHifenSextaPosicao = (sextaPosicao.compareTo('-') == 0) ? true : false;

        String cepModificado = cepOriginal.replace("-", "");
        boolean apenasNumeros = (cepModificado.matches("\\d*")) ? true : false;

        if(caracteres && temHifenSextaPosicao && apenasNumeros)
            JOptionPane.showMessageDialog(null, cepOriginal);
        else
            JOptionPane.showMessageDialog(null, "CEP invalido", "Erro", 3);
            System.exit(0);

    }
}