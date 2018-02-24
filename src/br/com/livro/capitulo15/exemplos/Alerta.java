package br.com.livro.capitulo15.exemplos;
public interface Alerta extends Mensagem {
  String DEMORA = "Aguarde um instante ...";
  String FECHAR = "Encerre o programa da forma correta.";
    
  void exibir(String texto, int icone);
}
