package br.com.livro.capitulo17.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.Random;

public class MetodoGenerico2 {
  public static void exibirObjeto(Object objeto) {
    String str = "Classe do objeto: " + objeto.getClass().getName() +
      "\nRepresenta��o textual: " + objeto;
    showMessageDialog(null, str);
  }
  
  public static void main(String[] args) {
    Random rd = new Random();
    exibirObjeto(rd.nextInt(1000000));
    exibirObjeto(rd.nextDouble() + 100);
    exibirObjeto((char)(rd.nextInt(26) + 65) );
    exibirObjeto("Johann S. Bach");
  }
}
