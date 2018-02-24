package br.com.livro.capitulo18.exemplos;
import static java.lang.System.out;
import java.util.Locale;

public class LocalPadrao {
  public static void main(String[] args) {
    Locale local = Locale.getDefault();
    
    out.println( "Local padr�o: " + local.getDisplayName() );
    out.print("Idioma: " +  local.getDisplayLanguage() );
    out.print(" - " +  local.getLanguage() );
    out.println(" - " +  local.getISO3Language() );
    out.print("Pa�s: " + local.getDisplayCountry() );
    out.print(" - " + local.getCountry() );
    out.println(" - " + local.getISO3Country() );
  }
}

