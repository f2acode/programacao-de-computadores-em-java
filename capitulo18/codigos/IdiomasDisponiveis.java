import static java.lang.System.out;
import java.util.Locale;

public class IdiomasDisponiveis {
  public static void main(String[] args) {
    String[] idiomas = Locale.getISOLanguages();
    
    out.println( "Idiomas dispon�veis:" );
    for (int i = 1; i <= idiomas.length; i++) {
      out.print( idiomas[i-1] + " " );
      if (i % 25 == 0) out.println(); 
    }
  }
}
