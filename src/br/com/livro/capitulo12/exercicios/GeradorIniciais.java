package br.com.livro.capitulo12.exercicios;

import javax.swing.JOptionPane;

public class GeradorIniciais {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		do {
			pessoa.nome = JOptionPane.showInputDialog("Nome da pessoa");
			
			if(pessoa.nome == null) 
				System.exit(0);
			
			if(!pessoa.validarNome(pessoa.nome)) {
				JOptionPane.showMessageDialog(null, "Nome inválido!");
				continue;
			}
			JOptionPane.showMessageDialog(null, pessoa.gerarIniciais());
				
		}while(true);
		
	}
}
