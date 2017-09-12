import static javax.swing.JOptionPane.*;
import java.util.Random;

public class SorteioCaractere {
  private static enum TipoCaractere{NUMERO,LETRA_MAIUSCULA,
    LETRA_MINUSCULA,OUTRO};
  
  public static void main(String[] args) {
    int numero = new Random().nextInt(150);
    char caractere = (char)numero;
    
    TipoCaractere tipo;
    if (caractere >= '0' && caractere <= '9') 
      tipo = TipoCaractere.NUMERO;
    else if (caractere >= 65 && caractere <= 90) 
      tipo = TipoCaractere.LETRA_MAIUSCULA;
    else if (caractere >= 97 && caractere <= 122) 
      tipo = TipoCaractere.LETRA_MINUSCULA;
    else tipo = TipoCaractere.OUTRO;
    
    String str = "Caractere sorteado: " + caractere +
      "\nTipo: ";
    switch(tipo) {
      case NUMERO: str += "N�mero"; break;
      case LETRA_MAIUSCULA: str += "Letra mai�scula"; break;
      case LETRA_MINUSCULA: str += "Letra min�scula"; break;
      case OUTRO: str += "Caractere especial"; break;
    }
    
    showMessageDialog(null, str);
    System.exit(0);
  }
}
