package br.com.livro.capitulo18.exemplos;
import static java.lang.System.out;
import java.util.Locale;

public class LocalEscolhido {
  public static void main(String[] args) {
    Locale local = new Locale("it","IT");
    
    out.println( "Local escolhido: " + local.getDisplayName() );
    out.print("Idioma: " +  local.getDisplayLanguage() );
    out.print(" - " +  local.getLanguage() );
    out.println(" - " +  local.getISO3Language() );
    out.print("Pa�s: " + local.getDisplayCountry() );
    out.print(" - " + local.getCountry() );
    out.println(" - " + local.getISO3Country() );
  }
}
