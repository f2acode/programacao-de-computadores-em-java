package br.com.livro.capitulo14.exercicios;

public abstract class Cliente {
	private int Codigo;
	private String Nome;
	private String Telefone;
	private String Email;
	
	public Cliente() {
		
	}
	
	public int getCodigo() {
		return this.Codigo;
	}
	
	public void setCodigo(int codigo) {
		if(codigo >= 1 && codigo <= 1000) {
			this.Codigo = codigo;
		}else {
			// error
		}
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setNome(String nome) {
		String[] arrayNome = nome.split(" ");
		boolean partesMaioresQueDois = true;
		
		for(String parteNome : arrayNome) {
			if(parteNome.length() < 2) {
				partesMaioresQueDois = false;
			}
		}
		
		if(arrayNome.length >= 2 && partesMaioresQueDois) {
			this.Nome = nome;	
		}else {
			// error
		}
		
	}
	
	public String getTelefone() {
		return this.Telefone;
	}
	
	public void setTelefone(String telefone) {
		
		String numero = telefone.substring(0, telefone.length()-1)
				.replaceFirst("-", "");
		
		if(numero.length() == 12 ) {
			String ddd = telefone.substring(0, 3);
			boolean temTraco = telefone.charAt(8) == '-';
			
			if(ddd.startsWith("(") && ddd.endsWith("(") && temTraco 
					&& numero.matches("[0-9]+")) {
				this.Telefone = telefone;
			}else {
				// error
			}	
		}else {
			// error
		}
		
	}
	
	public String getEmail() {
		return this.Email;
	}
	
	public void setEmail(String email) {
		
		String[] emailSeparado = email.split("@");
		boolean apenasUmArroba = (emailSeparado.length == 2);
		
		if(apenasUmArroba) {
			boolean caractereAntesEDepois = emailSeparado[0].length() > 0
					&& emailSeparado[1].length() > 0; 
			
			if(caractereAntesEDepois) {
				this.Email = email;	
			}else {
				// error
			}
		}else {
			// error
		}
		
	}
}
