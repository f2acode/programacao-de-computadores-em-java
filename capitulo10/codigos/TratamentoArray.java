public class TratamentoArray {
  public static void main(String[] args) {
    String[] amigos = {"Cl�udia","Vanessa","Raul","Sidnei"};
    
    for (byte num = 0; num < amigos.length; num++)
      System.out.println("Amigo " + (num + 1) + ": " + amigos[num]);
  }
}