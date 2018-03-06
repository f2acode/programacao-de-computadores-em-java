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
		this.Codigo = codigo;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
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
