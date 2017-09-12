import static javax.swing.JOptionPane.showMessageDialog;

public class TesteArea {
  public static void main(String[] args) {
    AreaCalculavel ac_quadrado = new Quadrado(4);
    double area = ac_quadrado.calcularArea();
    showMessageDialog(null,"�rea do quadrado: " + area);
    
    AreaCalculavel ac_retangulo = new Retangulo(3,2);
    area = ac_retangulo.calcularArea();
    showMessageDialog(null,"�rea do ret�ngulo: " + area);
    
    AreaCalculavel ac_circulo = new Circulo(5);
    area = ac_circulo.calcularArea();
    showMessageDialog(null,"�rea do c�rculo: " + area);
  }
}
