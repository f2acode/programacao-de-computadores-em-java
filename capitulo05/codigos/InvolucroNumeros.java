import java.io.PrintStream;

public class InvolucroNumeros{
  public static void main(String[] args){
    PrintStream saida = System.out;

    byte bt1 = Byte.parseByte("127");
    short st1 = Short.parseShort("32767");
    int it1 = Integer.parseInt("1234567890");
    long lg1 = Long.parseLong("123456789012");
    float fl1 = Float.parseFloat("3.1234");
    double db1 = Double.parseDouble("0.1234567");

    saida.println("Conteudo das variaveis:");
    saida.println("bt1 =\t" + bt1);
    saida.println("st1 =\t" + st1);
    saida.println("it1 =\t" + it1);
    saida.println("lg1 =\t" + lg1);
    saida.println("fl1 =\t" + fl1);
    saida.println("db1 =\t" + db1);

    
  }
}
