import static javax.swing.JOptionPane.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class ComparaHorarios {
  public static void main(String[] args) {
    DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
    df.setLenient(false);
    
    while (true)
      try {
        String str = showInputDialog(null,"Informe um hor�rio");
        if (str == null) System.exit(0);
        Date hora1 = df.parse(str);
        
        str = showInputDialog(null,"Informe outro hor�rio");
        if (str == null) System.exit(0);
        Date hora2 = df.parse(str);
        
        str = "Hor�rios informados: " + df.format(hora1) + " e " + 
          df.format(hora2) + "\n";
        
        if (hora1.equals(hora2)) str += "Hor�rios iguais";
        else if (hora1.after(hora2)) str += "O primeiro � maior";
        else if (hora1.before(hora2)) str += "O segundo � maior";
        
        showMessageDialog(null,str,"Mensagem",INFORMATION_MESSAGE);
      } catch(ParseException ex) {
        showMessageDialog(null,"Dado inv�lido","Erro",ERROR_MESSAGE);
      }
  }
}
