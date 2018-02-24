package br.com.livro.capitulo05.exemplos;
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

    Byte bt2 = Byte.valueOf("127");
    Short st2 = Short.valueOf("32767");
    Integer it2 = Integer.valueOf("1234567890");
    Long lg2 = Long.valueOf("123456789012");
    Float fl2 = Float.valueOf("3.1234");
    Double db2 = Double.valueOf("0.1234567");

    saida.println("\nConteudo dos objetos:");
    saida.println("bt2 =\t" + bt2.toString());
    saida.println("st2 =\t" + st2.toString());
    saida.println("it2 =\t" + it2.toString());
    saida.println("lg2 =\t" + lg2.toString());
    saida.println("fl2 =\t" + fl2.toString());
    saida.println("db2 =\t" + db2.toString());

    bt1 = bt2.byteValue();
    st1 = bt2.shortValue();
    it1 = bt2.intValue();
    lg1 = bt2.longValue();
    fl1 = bt2.floatValue();
    db1 = bt2.doubleValue();

    saida.println("Conteudo das variaveis:");
    saida.println("bt1 =\t" + bt1);
    saida.println("st1 =\t" + st1);
    saida.println("it1 =\t" + it1);
    saida.println("lg1 =\t" + lg1);
    saida.println("fl1 =\t" + fl1);
    saida.println("db1 =\t" + db1);
  }
}
