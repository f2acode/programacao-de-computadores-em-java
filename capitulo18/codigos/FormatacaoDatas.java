import static java.lang.System.out;
import java.text.DateFormat;
import java.util.Date;

public class FormatacaoDatas {
  public static void main(String[] args) {
    Date hoje = new Date();
    
    DateFormat df = DateFormat.getDateInstance();
    out.println("Classe do objeto:\t" + df.getClass().getName() );
    out.println("Formato padr�o:\t\t" + df.format(hoje) );
    
    df = DateFormat.getDateInstance(DateFormat.SHORT);
    out.println("Formato curto:\t\t" +  df.format(hoje) );
    
    df = DateFormat.getDateInstance(DateFormat.MEDIUM);
    out.println("Formato m�dio:\t\t" +  df.format(hoje) );
    
    df = DateFormat.getDateInstance(DateFormat.LONG);
    out.println("Formato longo:\t\t" +  df.format(hoje) );
    
    df = DateFormat.getDateInstance(DateFormat.FULL);
    out.println("Formato completo:\t" +  df.format(hoje) );
  }
}
