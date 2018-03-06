package br.com.livro.capitulo14.exercicios;

public class PessoaFisica extends Cliente{
	private String Celular;
	private String RG;
	private String CPF;
	
	public String getCelular() {
		return this.Celular;
	}
	
	public void setCelular(String celular) {
		this.Celular = celular;
	}
	
	public String getRG() {
		return this.RG;
	}
	
	public void setRG(String rg) {
		this.RG = rg;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}
}
