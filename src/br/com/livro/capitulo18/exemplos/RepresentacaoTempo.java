package br.com.livro.capitulo18.exemplos;
import static java.lang.System.*;
import java.util.Date;

public class RepresentacaoTempo {
  public static void main(String[] args) {
    Date agora = new Date( );
    out.println( agora + " = " + agora.getTime( ));
    
    Date dt = new Date( 1234567890000L );
    out.println( dt + " = " + dt.getTime( ));
    
    dt.setTime(0);
    out.println( dt + " = " + dt.getTime( ));
    
    dt.setTime(40L * 365 * 24 * 60 * 60 * 1000);
    out.println( dt + " = " + dt.getTime( ));
    
    dt.setTime(dt.getTime() + 11 * 24 * 60 * 60 * 1000);
    out.println( dt + " = " + dt.getTime( ));
  }
}
