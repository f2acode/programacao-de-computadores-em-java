package br.com.livro.capitulo17.exemplos;
import javax.swing.JOptionPane;

public class CalculoCirculo{
  public static void main(String[] args) {
    CalculoCirculo cc = new CalculoCirculo();
    cc.calcular();
  }
  
  public void calcular() {
    while(true) {
      String str = "Informe o raio de um c�rculo";
      str = JOptionPane.showInputDialog(str);
      if (str == null) System.exit(0);
      Circulo cir = new Circulo( Double.parseDouble(str) );
      
      str = "A �rea do c�rculo � igual a: " + cir.getArea();
      JOptionPane.showMessageDialog(null,str);
    }
  }
}

class Circulo {
  private double raio;
  
  public Circulo(double raio) {
    this.raio = raio;
  }
  
  public double getArea() {
    return Math.PI * Math.pow(raio,2);
  }
}
