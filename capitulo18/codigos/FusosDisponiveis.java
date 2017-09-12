import static java.lang.System.out;
import java.util.TimeZone;

public class FusosDisponiveis {
  public static void main(String[] args) {
    String[] fusos = TimeZone.getAvailableIDs( -2 * 60 * 60 * 1000);
    
    out.println( "Fusos dispon�veis para GMT -02:00" );
    for (int i = 0; i < fusos.length; i++)
      out.println( i+1 + ")\t" + fusos[i] );
  }
}
