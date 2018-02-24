package br.com.livro.capitulo18.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class ComparaDatas {
  public static void main(String[] args) {
    DateFormat df = DateFormat.getDateInstance();
    df.setLenient(false);
    
    while (true)
      try {
        String str = showInputDialog(null,"Informe uma data");
        if (str == null) System.exit(0);
        Date data1 = df.parse(str);
        
        str = showInputDialog(null,"Informe outra data");
        if (str == null) System.exit(0);
        Date data2 = df.parse(str);
        
        str = "Datas informadas: " + df.format(data1) + " e " + 
          df.format(data2) + "\n";
        
        if (data1.equals(data2)) str += "Datas iguais";
        else if (data1.after(data2)) str += "Primeira data � maior";
        else if (data1.before(data2)) str += "Segunda data � maior";
        
        showMessageDialog(null,str,"Mensagem",INFORMATION_MESSAGE);
      } catch(ParseException ex) {
        showMessageDialog(null,"Data inv�lida","Erro",ERROR_MESSAGE);
      }
  }
}
