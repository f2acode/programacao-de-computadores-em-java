package br.com.livro.capitulo18.exemplos;
import static java.lang.System.out;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FusoPadrao {
  public static void main(String[] args) {
    TimeZone tz = TimeZone.getDefault();
    
    out.println("Fuso hor�rio padr�o: " + tz.getDisplayName());
    out.println("Em italiano: " + tz.getDisplayName(Locale.ITALIAN));
    out.print("Nome completo: " );
    out.println( tz.getDisplayName(true,TimeZone.LONG) );
    out.print( "Horas acrescidas no hor�rio especial: " );
    out.println( tz.getDSTSavings() / 1000 / 60 / 60 );
    out.print( "Data atual est� no hor�rio especial: " );
    out.println( tz.inDaylightTime( new Date() ) );
  }
}

