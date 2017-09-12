import static java.lang.System.out;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class CalendarioPadrao {
  public static void main(String[] args) {
    DateFormat df = DateFormat.getDateTimeInstance();
    
    Calendar calendario = Calendar.getInstance( );
    calendario.setTime( new Date() );
    
    out.println("Classe:\t\t" + calendario.getClass().getName());
    
    out.print("Data e hor�rio:\t");
    out.print(calendario.get(Calendar.DAY_OF_MONTH));
    out.print("/" + calendario.get(Calendar.MONTH) + 1);
    out.print("/" + calendario.get(Calendar.YEAR));
    
    out.print(" " + calendario.get(Calendar.HOUR_OF_DAY));
    out.print(":" + calendario.get(Calendar.MINUTE));
    out.print(":" + calendario.get(Calendar.SECOND));
    out.print(":" + calendario.get(Calendar.MILLISECOND) + " GMT ");
    out.println(calendario.get(Calendar.ZONE_OFFSET)/(60*60*1000));
    
    calendario.set(Calendar.YEAR, 2009);
    out.println("Ano alterado:\t" + df.format(calendario.getTime()));
    
    calendario.add(Calendar.MONTH, -2);
    out.println("M�s alterado:\t" + df.format(calendario.getTime()));
    
    calendario.roll(Calendar.DAY_OF_MONTH, 35);
    out.println("Dia alterado:\t" + df.format(calendario.getTime()));
    
    out.print("Dia da semana:\t" + 
      calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
      Locale.getDefault()));
    
    out.print(" - " + calendario.getDisplayName(Calendar.DAY_OF_WEEK, 
      Calendar.LONG, Locale.ENGLISH));
    
    out.print(" - " + calendario.getDisplayName(Calendar.DAY_OF_WEEK, 
      Calendar.LONG, Locale.ITALIAN));
  }
}
