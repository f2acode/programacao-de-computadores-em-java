import static javax.swing.JOptionPane.*;

public class MenorNumero2 {
  public static Number localizarMenor(Number[] valores) {
    Number menor = null;
    
    for (Number valor : valores)
      if (menor == null || menor.doubleValue() > valor.doubleValue())
        menor = valor;
    
    return menor;
  }

  public static void main(String[] args) {
    Integer i = (Integer)localizarMenor(new Integer[]{4,2,7,5});
    showMessageDialog(null, "Menor Integer: " + i);
    
    Double d = (Double)localizarMenor(new Double[]{3.6,8.4,2.5,6.9});
    showMessageDialog(null, "Menor Double: " + d);
  }
}
