public class NumerosInteiros{
  public static void main(String[] args){
    byte bt = 127;
    short sh = 32767;
    int it = 2147483647;
    long lg = 9223372036854775807L;

    System.out.println("\nLimite superior:");
    System.out.println("byte:\t" + bt);
    System.out.println("short:\t" + sh);
    System.out.println("int:\t" + it);
    System.out.println("long:\t" + lg);

    bt = -128;
    sh = -32768;
    it = -2147483648;
    lg = -9223372036854775808L;

    System.out.println("\nLimite inferior:");
    System.out.println("byte:\t" + bt);
    System.out.println("short:\t" + sh);
    System.out.println("int:\t" + it);
    System.out.println("long:\t" + lg);
  }
}
