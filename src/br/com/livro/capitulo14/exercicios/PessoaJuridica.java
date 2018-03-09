package br.com.livro.capitulo14.exercicios;

public class PessoaJuridica extends Cliente{
	private String RazaoSocial;
	private String IE;
	private String CNPJ;
	
	public String getRazaoSocial() {
		return this.RazaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		String[] arrayRazao = razaoSocial.split(" ");
		boolean partesMaioresQueDois = true;
		
		for(String parteRazao : arrayRazao) {
			if(parteRazao.length() < 2) {
				partesMaioresQueDois = false;
			}
		}
		
		if(arrayRazao.length >= 2 && partesMaioresQueDois) {
			this.RazaoSocial = razaoSocial;	
		}else {
			// error
		}
		
	}
	
	public String getIE() {
		return this.IE;
	}
	
	public void setIE(String ie) {
		if(ie.length() > 0 && ie.length() <= 15) {
			this.IE = ie;	
		}else {
			// error
		}
	}
	
	public String getCNPJ() {
		return this.CNPJ;
	}
	
	public void setCNPJ(String cnpj) {
		
		boolean formatoCorreto = cnpj.charAt(2) == '.' && cnpj.charAt(6) == '.' 
				&& cnpj.charAt(10) == '/' && cnpj.charAt(15) == '-';
		
		cnpj = cnpj.replaceAll("./-", ""); 
		
		if(formatoCorreto && cnpj.length() == 14 && cnpj.matches("[0-9]+")) {
			this.CNPJ = cnpj;
		}else {
			// error
		}
	}
}
