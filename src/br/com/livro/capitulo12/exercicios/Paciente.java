package br.com.livro.capitulo12.exercicios;

public class Paciente {
	String nome;
	double peso;
	double altura;
	
	Paciente(){
		
	}
	
	public boolean validarNome(String nome) {
		
		if(nome.length() >= 2 && nome.length() <= 50) {
			return true;	
		}
		
		return false;
	}
	
	public boolean validarPeso(String peso) {
		
		try {
			if(Double.valueOf(peso) > 0.0 && Double.valueOf(peso) <= 350.0) {
				return true;
			}	
		}catch(Exception e) {
			return false;
		}
		
		return false;
	}
	
	public boolean validarAltura(String altura) {
		try {
			if(Double.valueOf(altura) > 0.0 && Double.valueOf(altura) <= 2.5) {
				return true;
			}	
		}catch(Exception e) {
			return false;
		}
		
		return false;
	}
	
	public double calcularIMC() {
		double imc = peso/Math.pow(altura, 2);
		return imc;
	}
	
	public String classificarIMC() {
		
		double imc = calcularIMC();
		String categoria;
		
		if(imc < 18.4) { 
			categoria = "Abaixo do peso";
		}else if(imc >= 18.5 && imc <= 24.9) {
			categoria = "Peso normal";
		}else if(imc >= 25.0 && imc <= 29.9) {
			categoria = "Sobrepeso";
		}else if(imc >= 30.0 && imc <= 34.9) {
			categoria = "Obesidade grau I";
		}else if(imc >= 35.0 && imc <= 39.9) {
			categoria = "Obesidade grau II";
		}else {
			categoria = "Obesidade grau III";
		}
		
		return categoria;
	}
	
	public String recuperarResultado() {
		
		String dados = "Nome: " + this.nome + 
				"\nPeso: " + this.peso + 
				"\nAltura: " + this.altura +
				"\nIMC: " + this.calcularIMC() + 
				"\nCategoria: " + this.classificarIMC();
		
		return dados;
	}
}
