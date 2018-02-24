package br.com.livro.capitulo17.exemplos;
import static javax.swing.JOptionPane.*;

public class MenorNumero {
  public static <L extends Number> L localizarMenor(L[] valores) {
    L menor = null;
    
    for (L valor : valores)
      if (menor == null || menor.doubleValue() > valor.doubleValue())
        menor = valor;
    
    return menor;
  }

  public static void main(String[] args) {
    Integer i = localizarMenor( new Integer[] {4,2,7,5} );
    showMessageDialog(null, "Menor Integer: " + i);
    
    Double d = localizarMenor( new Double[] {3.6,8.4,2.5,6.9} );
    showMessageDialog(null, "Menor Double: " + d);
  }
}

