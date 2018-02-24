package br.com.livro.capitulo07.exemplos;
import javax.swing.JOptionPane;

public class Interrupcao{
    public static void main(String[] args){
        String st = "Informe seu nome: ";
        st = JOptionPane.showInputDialog(null, st);

        if(st == null) System.exit(0);
        if(st.length() == 0) System.exit(0);

        st = "Nome informado: " + st;
        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
        System.exit(0);
    }
}