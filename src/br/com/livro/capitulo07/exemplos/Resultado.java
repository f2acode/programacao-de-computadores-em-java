package br.com.livro.capitulo07.exemplos;
import javax.swing.JOptionPane;

public class Resultado{
    public static void main(String[] args){
        double nota1 = 0, nota2 = 0, nota3 = 0, media;

        String st = "Informe sua primeira nota (entre 0 e 10):";
        st = JOptionPane.showInputDialog(null, st);

        if(st == null || st.trim().length() == 0){
            st = "E preciso informar sua nota!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }
        else nota1 = Double.parseDouble(st);

        st = "Informe sua segunda nota (entre 0 e 10):";
        st = JOptionPane.showInputDialog(null, st);

        if(st == null || st.trim().length() == 0){
            st = "E preciso informar sua nota!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }
        else nota2 = Double.parseDouble(st);

        st = "Informe sua terceira nota (entre 0 e 10):";
        st = JOptionPane.showInputDialog(null, st);

        if(st == null || st.trim().length() == 0){
            st = "E preciso informar sua nota!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }
        else nota3 = Double.parseDouble(st);

        media = (nota1 + nota2 + nota3)/3;

        if(media >= 7) st = "Parabens: voce foi aprovado!";
        else st = "Sinto muito, voce foi reprovado.";

        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
        System.exit(0);
    }
}