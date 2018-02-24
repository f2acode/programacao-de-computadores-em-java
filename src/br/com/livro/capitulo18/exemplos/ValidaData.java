package br.com.livro.capitulo18.exemplos;
import static javax.swing.JOptionPane.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ValidaData {
  public static void main(String[] args) {
    DateFormat df = DateFormat.getDateInstance();
    df.setLenient(false);
    
    while (true)
      try {
        String str = "Informe uma data (dd/mm/aaaa)";
        str = showInputDialog(null,str);
        if (str == null) System.exit(0);
        
        Date data = df.parse(str);
        str = "Data formatada: " + df.format(data);
        showMessageDialog(null,str,"Mensagem",INFORMATION_MESSAGE);
      } catch(ParseException ex) {
        showMessageDialog(null,"Data inv�lida","Erro",ERROR_MESSAGE);
      }
  }
}
