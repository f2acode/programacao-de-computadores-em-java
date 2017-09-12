import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoMoeda {
  public static void main(String[] args) {
    double valor = 1568.25;
    out.println("Valor original:\t" + valor);
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    out.println("Brasil:\t\t" + nf.format(valor));
    
    nf = NumberFormat.getCurrencyInstance(Locale.UK);
    out.println("Inglaterra:\t" + nf.format(valor));
    
    nf = NumberFormat.getCurrencyInstance(Locale.ITALY);
    out.println("It�lia:\t\t" + nf.format(valor));
    
    nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    out.println("Alemanha:\t" + nf.format(valor));
  }
}
