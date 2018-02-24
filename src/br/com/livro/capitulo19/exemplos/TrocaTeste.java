package br.com.livro.capitulo19.exemplos;
import static javax.swing.JOptionPane.*;

public class TrocaTeste {
  private static int[] numeros;
  private static String[] textos;
  
  public static void main(String[] args) {
    numeros = new int[]{45,23,97,64,12,17,89,72,55,28};
    textos = new String[]{"Verde","Azul","Roxo","Amarelo","Vermelho"};
    
    OrdenacaoTroca.ordenar(numeros,numeros.length);
    OrdenacaoTroca.ordenar(textos,textos.length);
    
    String str = "N�meros ordenados: ";
    for (int n : numeros)
      str += "[" + n + "] ";
    
    str += "\nTextos ordenados: ";
    for (String s : textos)
      str += "[" + s + "] ";
    
    showMessageDialog(null,str);
  }
}
