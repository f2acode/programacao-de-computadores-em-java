package br.com.livro.capitulo12.exercicios;

import javax.swing.JOptionPane;

public class AreaCirculo {
	public static void main(String[] args) {
		
		do {
			Circulo circulo = new Circulo();
			String cf = JOptionPane.showInputDialog("Informe a circunferência do círculo:");
			
			if(cf == null)
				System.exit(0);
			
			if(!circulo.validarCircunferencia(cf)) {
				JOptionPane.showMessageDialog(null, "Dado inválido", "Erro", 0);
			}else {
				circulo.circunferencia = Double.valueOf(cf);
				
				JOptionPane.showMessageDialog(null, "Area do círculo:" + circulo.calcularArea());	
			}
				
		}while(true);
		
	}
}
