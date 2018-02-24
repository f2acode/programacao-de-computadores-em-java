package br.com.livro.capitulo12.exemplos;
public class Peixe {
  String nomePopular;
  String nomeCientifico;
  String familia;
  String origem;
  int comprimento;
  
  Peixe() {
    nomePopular = "";
    nomeCientifico = "";
    familia = "";
    origem = "";
  }
  
  Peixe(String nomePopular, String nomeCientifico, 
    String familia, String origem, int comprimento) {
    this.nomePopular = nomePopular;
    this.nomeCientifico = nomeCientifico;
    this.familia = familia;
    this.origem = origem;
    this.comprimento = comprimento;
  }
}