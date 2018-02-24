package br.com.livro.capitulo12.exercicios;

public class Pessoa {
	
	String nome;
	
	Pessoa(){
		
	}
	
	public boolean validarNome(String nome){
		
		boolean tamanhoEValido = (nome.length() >= 5 && nome.length() <= 50);
		boolean temPeloMenosDuasPartes = nome.split(" ").length >= 2;		
		if(!tamanhoEValido || !temPeloMenosDuasPartes) {
			return false;
		}else {
			String[] partesDoNome = nome.split(" ");
			if(!(partesDoNome[0].length() >= 2) || !(partesDoNome[1].length() >= 2)) {
				return false;
			}
		}
		
		return true;
	}
	
	public String gerarIniciais() {
		
		String[] partesNome = this.nome.split(" ");
		String iniciais = "";
		
		for(String parteNome : partesNome) {
			iniciais += parteNome.charAt(0);
		}
		return iniciais;
	}
}
