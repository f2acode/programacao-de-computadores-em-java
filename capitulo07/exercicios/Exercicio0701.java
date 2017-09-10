import javax.swing.JOptionPane;

public class Exercicio0701{
    public static void main(String[] args){

        String nomeCompleto = JOptionPane.showInputDialog(null, 
            "Informe o nome completo");

        if(nomeCompleto == null) System.exit(0);

        boolean caracteres = (nomeCompleto.trim().length() >= 5 && 
            nomeCompleto.trim().length() <= 50) ? true : false;

        int indexEspaco = nomeCompleto.indexOf(" ");
        boolean espaco = (indexEspaco != -1) ? true : false;

        boolean nome = (nomeCompleto.substring(0, indexEspaco).length() >= 2) ? true : false;
        boolean sobrenome = (nomeCompleto.substring(indexEspaco, 
            nomeCompleto.length()).length() >= 2) ? true : false;

        if(caracteres && espaco && nome && sobrenome)
            JOptionPane.showMessageDialog(null, nomeCompleto);
        else
            JOptionPane.showMessageDialog(null, "Nome invalido", "Erro", 3);
            System.exit(0);

    }
}