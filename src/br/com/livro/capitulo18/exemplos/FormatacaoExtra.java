package br.com.livro.capitulo18.exemplos;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoExtra {
  public static void main(String[] args) {
    Date agora = new Date();
    out.println("Formatos extras:");
    
    DateFormat df = new SimpleDateFormat();
    out.println("1) " + df.format(agora) );
    
    df = new SimpleDateFormat("d/M/y H:m:s:S z");
    out.println("2) " + df.format(agora) );
    
    df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS zzzz");
    out.println("3) " + df.format(agora) );
    
    df = new SimpleDateFormat("'Curitiba,' dd 'de' MMMM 'de' yyyy");
    out.println("4) " + df.format(agora) );
    
    df = new SimpleDateFormat("hh:mm:ss a Z");
    out.println("5) " + df.format(agora) );
  }
}
