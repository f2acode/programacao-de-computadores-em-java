package br.com.livro.capitulo05.exercicios;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio0511{
    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno:");

        byte nota1 = Byte.valueOf(
            JOptionPane.showInputDialog(null, "Informe a primeira nota do aluno:"));

        byte nota2 = Byte.valueOf(
            JOptionPane.showInputDialog(null, "Informe a segunda nota do aluno:"));

        int mediaTemporaria = (Integer.valueOf(String.valueOf(nota1)) + 
            Integer.valueOf(String.valueOf(nota2)))/2;

        byte media = (byte)mediaTemporaria;

        JOptionPane.showMessageDialog(null, "Resultado final:" +
        "\nAluno: " + nome +
        "\nNota 1: " + String.valueOf(nota1) +
        "\nNota 2: " + String.valueOf(nota2) +
        "\nMedia: " + String.valueOf(media));
    }
}