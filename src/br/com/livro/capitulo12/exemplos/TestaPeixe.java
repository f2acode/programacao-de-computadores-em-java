package br.com.livro.capitulo12.exemplos;
import javax.swing.JOptionPane;

public class TestaPeixe {
  public static void main(String[] args) {
    Peixe espada = new Peixe();
    espada.nomePopular = "Espada";
    espada.nomeCientifico = "Xiphophorus hellerii";
    espada.familia = "Poecil�deos";
    espada.origem = "Am�rica Central";
    espada.comprimento = 13;
    
    Peixe beijador = new Peixe("Beijador","Helostoma temminkii",
      "Anabant�deos","Java e Tail�ndia",30);
    
    String str = "Dados do primeiro peixe:\n" +
      "\nNome popular: "    + espada.nomePopular +
      "\nNome cient�fico: " + espada.nomeCientifico +
      "\nFam�lia: "         + espada.familia +
      "\nOrigem: "          + espada.origem +
      "\nComprimento: "     + espada.comprimento;
    JOptionPane.showMessageDialog(null,str);
    
    str = "Dados do segundo peixe:\n" +
      "\nNome popular: "    + beijador.nomePopular +
      "\nNome cient�fico: " + beijador.nomeCientifico +
      "\nFam�lia: "         + beijador.familia +
      "\nOrigem: "          + beijador.origem +
      "\nComprimento: "     + beijador.comprimento;
    JOptionPane.showMessageDialog(null,str);
    System.exit(0);
  }
}