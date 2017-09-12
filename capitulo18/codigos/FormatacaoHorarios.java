import static java.lang.System.out;
import java.text.DateFormat;
import java.util.Date;

public class FormatacaoHorarios {
  public static void main(String[] args) {
    Date agora = new Date();
    out.println("Formatos aplic�veis a hor�rios:");
    
    DateFormat df = DateFormat.getTimeInstance();
    out.println("Padr�o:\t\t" + df.format(agora) );
    
    df = DateFormat.getTimeInstance(DateFormat.SHORT);
    out.println("Curto:\t\t" +  df.format(agora) );
    
    df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    out.println("M�dio:\t\t" +  df.format(agora) );
    
    df = DateFormat.getTimeInstance(DateFormat.LONG);
    out.println("Longo:\t\t" +  df.format(agora) );
    
    df = DateFormat.getTimeInstance(DateFormat.FULL);
    out.println("Completo:\t" +  df.format(agora) );
  }
}
