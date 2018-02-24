package br.com.livro.capitulo08.exercicios;
import javax.swing.JOptionPane;

public class Exercicio0801{
    public static void main(String[] args){

    	boolean nome_valido = false;
    	String nome = "";
    	
    	do {
    		nome = JOptionPane.showInputDialog("Informe seu nome");
    		
    		if(nome.length() >= 5 && nome.length() <= 50) {
    			if(!nome.matches(".*\\d+.*")) {
    				nome_valido = true;
    				JOptionPane.showMessageDialog(null, "Nome válido: " + nome);
    			}else {
    				JOptionPane.showMessageDialog(null, "O nome não pode conter números","Erro", 0);
    			}
    		}else {
    			JOptionPane.showMessageDialog(null, "O nome possuir a quantidade de caracteres >= 5 e <= 50", "Erro", 0);
    		}
    	}while(!nome_valido);
        
        
    }
}