package br.com.livro.capitulo14.exercicios;

public class CadastroClientes {

	public static void main(String[] args) {
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCodigo(1);
		pessoaFisica.setEmail("teste@teste.com");
		pessoaFisica.setNome("juliana");
		pessoaFisica.setTelefone("19-9299-9299");
		pessoaFisica.setCelular("999-999-999");
		pessoaFisica.setCPF("82.454.435-28");
		pessoaFisica.setRG("82.454.435-2");
		
		PessoaFisica pessoaFisica2 = new PessoaFisica();
		pessoaFisica2.setCodigo(1);
		pessoaFisica2.setEmail("teste@teste.com");
		pessoaFisica2.setNome("juliana");
		pessoaFisica2.setTelefone("19-9299-9299");
		pessoaFisica2.setCelular("999-999-999");
		pessoaFisica2.setCPF("82.454.435-28");
		pessoaFisica2.setRG("82.454.435-2");
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setCodigo(1);
		pessoaJuridica.setEmail("teste@teste.com");
		pessoaJuridica.setNome("juliana");
		pessoaJuridica.setTelefone("19-9299-9299");
		pessoaJuridica.setIE("999-999-999");
		pessoaJuridica.setRazaoSocial("TESTE ltda.");
		
		PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
		pessoaJuridica2.setCodigo(1);
		pessoaJuridica2.setEmail("teste@teste.com");
		pessoaJuridica2.setNome("juliana");
		pessoaJuridica2.setTelefone("19-9299-9299");
		pessoaJuridica2.setIE("999-999-999");
		pessoaJuridica2.setRazaoSocial("TESTE ltda.");
	}

}
