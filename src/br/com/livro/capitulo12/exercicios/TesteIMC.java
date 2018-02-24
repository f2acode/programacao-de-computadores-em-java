package br.com.livro.capitulo12.exercicios;

import javax.swing.JOptionPane;

public class TesteIMC {
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		
		do {
			boolean nomeValido;
			do {
				paciente.nome = JOptionPane.showInputDialog("Nome do paciente:");
				if(paciente.nome == null)
					System.exit(0);
				
				nomeValido = paciente.validarNome(String.valueOf(paciente.nome));
				if(!nomeValido) {
					JOptionPane.showMessageDialog(null, "Nome inválido", "Error", 0);		
				}	
				
			}while(!nomeValido);
			
			boolean pesoValido;
			do {
				paciente.peso = Double.valueOf(JOptionPane.showInputDialog("Peso do paciente:"));
				if(paciente.peso == Double.NaN)
					System.exit(0);
				
				pesoValido = paciente.validarPeso(String.valueOf(paciente.peso));
				if(!pesoValido) {
					JOptionPane.showMessageDialog(null, "Peso inválido", "Error", 0);	
				}	
			}while(!pesoValido);
			
			boolean alturaValido;
			do {
				paciente.altura = Double.valueOf(JOptionPane.showInputDialog("Altura do paciente:"));
				if(paciente.altura == Double.NaN)
					System.exit(0);
				
				alturaValido = paciente.validarAltura(String.valueOf(paciente.altura));
				if(!alturaValido) {
					JOptionPane.showMessageDialog(null, "Altura inválido", "Error", 0);		
				}
					
			}while(!alturaValido);
			
			paciente.calcularIMC();
			
			JOptionPane.showMessageDialog(null, "Resultado: \n" + paciente.recuperarResultado());
		}while(true);
		
	}
}
