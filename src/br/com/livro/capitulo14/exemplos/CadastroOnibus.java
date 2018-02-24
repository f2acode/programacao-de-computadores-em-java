package br.com.livro.capitulo14.exemplos;
public class CadastroOnibus {
  public static void main(String[] args) {
    Onibus onibus = new Onibus("ZAB-4613",2009,44);
    onibus.exibirDados();
    onibus.setPlaca("EDS-7898");
    onibus.setAno("2005");
    onibus.setAssentos(46);
    onibus.exibirDados();
    System.exit(0);
  }
}
