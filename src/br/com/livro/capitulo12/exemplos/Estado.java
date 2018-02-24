package br.com.livro.capitulo12.exemplos;
import javax.swing.JOptionPane;

public class Estado {
  String nome;
  String sigla;
  
  Estado() {
    nome = "";
    sigla = "";
  }
  
  void exibirDados() {
    String dados = nome + " - " + sigla.toUpperCase();
    JOptionPane.showMessageDialog(null,dados);
  }
  
  String recuperarDados() {
    return nome + " - " + sigla.toUpperCase();
  }
  
  boolean validarNome(String nome) {
    nome = nome.trim();
    if (nome.length() < 2 || nome.length() > 50) return false;
    else return true;
  }
  
  boolean validarSigla(String sigla) {
    if (sigla.length() != 2) return false;
    else return true;
  }
}