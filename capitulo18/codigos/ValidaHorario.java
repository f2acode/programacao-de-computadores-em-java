import static javax.swing.JOptionPane.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ValidaHorario {
  public static void main(String[] args) {
    DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
    df.setLenient(false);
    
    while (true)   
      try {
        String str = "Informe um hor�rio (Exemplo: 22:35)";
        str = showInputDialog(null,str);
        if (str == null) System.exit(0);
        
        Date horario = df.parse(str);
        str = "Hor�rio formatado: " + df.format(horario);
        showMessageDialog(null,str,"Mensagem",1);
      } catch(ParseException ex) {
        showMessageDialog(null,"Dado inv�lido","Erro",ERROR_MESSAGE);
      }
  }
}

