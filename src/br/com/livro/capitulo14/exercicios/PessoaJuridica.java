package br.com.livro.capitulo14.exercicios;

public class PessoaJuridica extends Cliente{
	private String RazaoSocial;
	private String IE;
	
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
}
