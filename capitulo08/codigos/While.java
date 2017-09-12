public class While {
  public static void main(String[] args) {
    System.out.println("Primeiro while:");
    byte bt = 0;
    while (bt < 5)
      System.out.println(++bt);
    
    System.out.println();
    
    System.out.println("Segundo while:");
    bt = 69;
    while (bt >= 65) {
      String st = "O n�mero " + bt + " equivale ao caractere ";
      st += (char)bt;
      System.out.println(st);
      bt--;
    }
  }
}