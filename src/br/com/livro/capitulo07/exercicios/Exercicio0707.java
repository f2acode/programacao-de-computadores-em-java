package br.com.livro.capitulo07.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0707{
    public static void main(String[] args){

        Double imc = 0.0;
        String categoria = "";
        Double peso = Double.valueOf(JOptionPane.showInputDialog(null, 
            "Informe o seu peso:"));

        if(peso == null)
            System.exit(0);

        if(peso < 0.5){
            JOptionPane.showMessageDialog(null, "O peso deve ser maior que 0,5kg", "Erro", 3);
            System.exit(0);
        }

        Double altura = Double.valueOf(JOptionPane.showInputDialog(null, 
            "Informe a sua altura:"));

        if(altura == null)
            System.exit(0);

        if(altura < 0.1){
            JOptionPane.showMessageDialog(null, "Altura deve ser maior do que 0,1m", "Erro", 3);
            System.exit(0);
        }
        
        imc = peso/(altura * altura);

        if(imc < 18.4)
            categoria = "Abaixo do peso";
        else if(imc < 24.9)
            categoria = "Peso normal";
        else if(imc < 29.9)
            categoria = "Sobrepeso";
        else if(imc < 34.9)
            categoria = "Obesidade grau I";
        else if(imc < 39.9)
            categoria = "Obesidade grau II";
        else
            categoria = "Obesidade grau III";

        JOptionPane.showMessageDialog(null, 
            "Peso: " + peso + 
            "\nAltura: "+ altura + 
            "\nIMC: " + imc + 
            "\nCategoria: " + categoria, "Informacoes", 1);

    }
}