import java.io.PrintStream;

public class Involucro {
  public static void main(String [] args){
    PrintStream saida = System.out;

    Boolean bl1 = new Boolean(true);
    Boolean bl2 = new Boolean("false");
    Character ch = new Character('A');
    Byte bt1 = new Byte((byte)127);
    Byte bt2 = new Byte("-128");
    Short st1 = new Short((short)32767);
    Short st2 = new Short("-32768");
    Integer it1 = new Integer(2147483647);
    Integer it2 = new Integer("-2147483648");
    Long lg1 = new Long(9223372036854775807L);
    Long lg2 = new Long("-9223372036854775808");
    Float fl1 = new Float(3.4028E+38f);
    Float fl2 = new Float("-3.4028E+38");
    Double db1 = new Double(1.7976E+308);
    Double db2 = new Double("-1.7976E+308");

    saida.println("bl1 =\t" + bl1.booleanValue());
    saida.println("bl2 =\t" + bl2.booleanValue());
    saida.println("ch =\t" + ch.charValue());
    saida.println("bt1 =\t" + bt1.byteValue());
    saida.println("bt2 =\t" + bt2.byteValue());
    saida.println("st1 =\t" + st1.shortValue());
    saida.println("st2 =\t" + st2.shortValue());
    saida.println("it1 =\t" + it1.intValue());
    saida.println("it2 =\t" + it2.intValue());
    saida.println("lg1 =\t" + lg1.longValue());
    saida.println("lg2 =\t" + lg2.longValue());
    saida.println("fl1 =\t" + fl1.floatValue());
    saida.println("fl2 =\t" + fl2.floatValue());
    saida.println("db1 =\t" + db1.doubleValue());
    saida.println("db2 =\t" + db2.doubleValue());
  }
}
