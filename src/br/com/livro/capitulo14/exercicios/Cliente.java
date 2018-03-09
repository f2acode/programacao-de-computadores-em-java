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
	
	public void setCodigo(int codigo) throws EDadoInvalido {
		if(codigo >= 1 && codigo <= 1000) {
			this.Codigo = codigo;
		}else {
			throw new EDadoInvalido("Código deve ser maior que 0 e menor que 1001"); 
		}
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setNome(String nome) throws EDadoInvalido{
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
			throw new EDadoInvalido("Cada parte do nome deve ter mais que 2 caracteres");
		}
		
	}
	
	public String getTelefone() {
		return this.Telefone;
	}
	
	public void setTelefone(String telefone) throws EDadoInvalido {
		
		String numero = telefone.substring(0, telefone.length()-1)
				.replaceFirst("-", "");
		
		if(numero.length() == 12 ) {
			String ddd = telefone.substring(0, 3);
			boolean temTraco = telefone.charAt(8) == '-';
			
			if(ddd.startsWith("(") && ddd.endsWith("(") && temTraco 
					&& numero.matches("[0-9]+")) {
				this.Telefone = telefone;
			}else {
				throw new EDadoInvalido("Formato deve seguir: (00)0000-0000");
			}	
		}else {
			throw new EDadoInvalido("Tamanho do número incompatível");
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
