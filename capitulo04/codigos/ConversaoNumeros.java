import javax.swing.JOptionPane;

public class ConversaoNumeros{
  public static void main(String[] args){

    int it1 = 15635;
    long lg = it1;
    float fl = it1;
    short sh = (short)it1;

    double db = 24.75;
    int it2 = (int)db;
    int it3 = (int) Math.round(db);

    String st = "Conteudo das variaveis:\n" +
    "it1 = " + it1 + "\n" + "lg = " + lg + "\n" +
    "fl = " + fl + "\n" + "sh = " + sh + "\n\n" +
    "db = " + db + "\n" + "it2 = " + it2 + "\n" +
    "it3 = " + it3;

    JOptionPane.showMessageDialog(null, st);
    System.exit(0);
  }
}
