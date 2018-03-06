package br.com.livro.capitulo14.exercicios;

public class PessoaJuridica extends Cliente{
	private String RazaoSocial;
	private String IE;
	
	public String getRazaoSocial() {
		return this.RazaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.RazaoSocial = razaoSocial;
	}
	
	public String getIE() {
		return this.IE;
	}
	
	public void setIE(String ie) {
		this.IE = ie;
	}
}
