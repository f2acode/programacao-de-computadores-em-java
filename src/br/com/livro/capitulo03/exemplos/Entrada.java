package br.com.livro.capitulo03.exemplos;
import java.io.IOException;

public class Entrada
{
  // O método read() requer tratamento do IOException
  public static void main(String[] args) throws IOException{

    System.out.print("\n Informe seu nome:");

    //É necessário passar um vetor de bytes como parametro
    byte[] bt = new byte[50];

    //Aqui aguarda o usuário entrar com algum valor
    //O atributo 'in' do System pega o valor do sistema (terminal)
    System.in.read(bt);

    /*
    Método trim é utilizado para eliminar os espaços em branco no
    início e no final do texto captado
    */
    String nome = new String(bt).trim();

    System.out.printf("%s: seja bem-vindx! \n\n", nome);

  }
}
