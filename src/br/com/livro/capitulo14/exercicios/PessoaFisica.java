package br.com.livro.capitulo14.exercicios;

public class PessoaFisica extends Cliente{
	private String Celular;
	private String RG;
	private String CPF;
	
	public String getCelular() {
		return this.Celular;
	}
	
	public void setCelular(String celular) {
		String numero = celular.substring(0, celular.length()-1)
				.replaceFirst("-", "");
		
		if(numero.length() == 12 ) {
			String ddd = celular.substring(0, 3);
			boolean temTraco = celular.charAt(8) == '-';
			
			if(ddd.startsWith("(") && ddd.endsWith("(") && temTraco 
					&& numero.matches("[0-9]+")) {
				this.Celular = celular;
			}else {
				// error
			}	
		}else {
			// error
		}
		this.Celular = celular;
	}
	
	public String getRG() {
		return this.RG;
	}
	
	public void setRG(String rg) {
		
		boolean possuiDigito = rg.charAt(rg.length() -2) == '-';
		boolean digitosNumericos = rg.matches("[0-9]+");
		
		if(possuiDigito && digitosNumericos 
				&& rg.length() >= 5 && rg.length() <= 15) {
			this.RG = rg;	
		}else {
			// error
		}
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public void setCPF(String cpf) {
		
		String[] cpfSeparadoPontos = cpf.split(".");
		String[] cpfSeparadoTraco = cpfSeparadoPontos[cpfSeparadoPontos.length]
				.split("-");
		String cpfApenasNumeros = cpf.replace(".", "");
		cpfApenasNumeros = cpfApenasNumeros.replace("-", "");
		
		if(cpfSeparadoPontos.length == 3 && cpfSeparadoTraco.length == 2
				&& cpfApenasNumeros.matches("[0-9]+")) {
			this.CPF = cpf;	
		}else {
			// error
		}
	}
}
