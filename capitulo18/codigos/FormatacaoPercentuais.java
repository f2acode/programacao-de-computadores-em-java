import static java.lang.System.out;
import java.text.NumberFormat;

public class FormatacaoPercentuais {
  public static void main(String[] args) {
    double percentual = 0.25;
    out.println("N�mero original:\t" + percentual);
    
    NumberFormat nf = NumberFormat.getPercentInstance();
    System.out.println("Forma percentual:\t" + nf.format(percentual));
  }
}
