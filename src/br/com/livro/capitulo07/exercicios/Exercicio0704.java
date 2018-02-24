package br.com.livro.capitulo07.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0704{
    public static void main(String[] args){

        String conceito = "";
        String entrada = JOptionPane.showInputDialog(null, "Informe um caractere:");
        
        if(entrada.length() == 0){
            JOptionPane.showMessageDialog(null, "E necessario informar alguma letra", "Erro", 3);
            System.exit(0);
        }
        
        Character caractere = entrada.charAt(0);

        if(caractere == null)
            System.exit(0);

        switch(caractere){
            case 'A': conceito = "Excelente"; break;
            case 'B': conceito = "Otimo"; break;
            case 'C': conceito = "Bom"; break;
            case 'D': conceito = "Regular"; break;
            case 'E': conceito = "Ruim"; break;
        }

        JOptionPane.showMessageDialog(null, "Conceito: " + conceito);

    }
}