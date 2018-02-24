package br.com.livro.capitulo07.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0702{
    public static void main(String[] args){

        String email = JOptionPane.showInputDialog(null, "Informe seu e-mail:");
        
        int posicaoEspaco = email.indexOf(" ");
        boolean semEspaco = (posicaoEspaco == -1) ? true : false;

        int posicaoArroba = (email.indexOf("@") == email.lastIndexOf("@")) ?
            email.indexOf("@") : -1;
        boolean temUmArroba = (posicaoArroba != -1) ? true : false;

        boolean antesArroba = (email.substring(0, posicaoArroba).length() >= 2) ? true : false;
        boolean depoisArroba = (email.substring(posicaoArroba, 
            email.length()).length() >= 2) ? true : false;

        if(semEspaco && temUmArroba && antesArroba && depoisArroba)
            JOptionPane.showMessageDialog(null, email);
        else
            JOptionPane.showMessageDialog(null, "E-mail invalido", "Erro", 3);
            System.exit(0);

    }
}