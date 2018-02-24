package br.com.livro.capitulo17.exemplos;
import static javax.swing.JOptionPane.*;

public class Varargs {
  public static double calcularMedia(double... notas) {
    double soma = 0;
    
    for (double nota : notas)
      soma += nota;
    
    return soma / notas.length;
  }
  
  public static void main(String[] args) {
    String str = showInputDialog("Nota 1");
    if (str == null) System.exit(0);
    double nota1 = Double.parseDouble(str);
    
    str = showInputDialog("Nota 2");
    if (str == null) System.exit(0);
    double nota2 = Double.parseDouble(str);
    
    str = showInputDialog("Nota 3");
    if (str == null) System.exit(0);
    double nota3 = Double.parseDouble(str);
    
    double media1 = calcularMedia(nota1,nota2);
    double media2 = calcularMedia(nota1,nota2,nota3);
    
    str = "Notas: " + nota1 + " - " + nota2 + " - " + nota3 +
      "\nM�dias: " + media1 + " - " + media2;
    showMessageDialog(null, str);
    System.exit(0);
  }
}
