public class TestaDialogo {
  public static void main(String[] args) {
    String str = Dialogo.captar("Qual � seu nome?");
    if (str != null) Dialogo.exibir("Ol� " + str + "!");
    System.exit(0);
  }
}