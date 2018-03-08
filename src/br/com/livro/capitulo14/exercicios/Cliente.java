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
		this.Telefone = telefone;
	}
	
	public String getEmail() {
		return this.Email;
	}
	
	public void setEmail(String email) {
		this.Email = email;
	}
}
