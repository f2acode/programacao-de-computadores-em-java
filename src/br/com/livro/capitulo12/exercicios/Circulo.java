package br.com.livro.capitulo12.exercicios;

public class Circulo {
	double circunferencia;

	public boolean validarCircunferencia(String cf) {
		
		double circunferencia;
		
		try {
			circunferencia = Double.valueOf(cf);
			
			if(!(circunferencia > 0)) {
				return false;
			}
			
		}catch(Exception e) {
			return false;
		}
		
		return true;
	}
	
	public double calcularArea() {
		
		double diametro = this.circunferencia/Math.PI;
		double raio = diametro/2;
		double area = Math.pow(raio, 2) * Math.PI;
				
		return area;
	}	
}
