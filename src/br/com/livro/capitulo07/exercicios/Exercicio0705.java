package br.com.livro.capitulo07.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0705{
    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog(null, "Informe o nome completo:");
        
        if(nome == null)
            System.exit(0);

        if(nome.trim().length() < 5 || nome.trim().length() > 50){
            JOptionPane.showMessageDialog(null, "Nome possui caracteres fora do intervalo", "Erro", 3);
            System.exit(0);
        }
        
        String email = JOptionPane.showInputDialog(null, "Informe o e-mail:");

        if(email == null)
            System.exit(0);

        if(email.trim().length() < 3 || email.trim().length() > 50){
            JOptionPane.showMessageDialog(null, "Email possui caracteres fora do intervalo", "Erro", 3);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Cadastro gravado:" +
        "\nNome: "+ nome +
        "\nE-mail: " + email);

    }
}