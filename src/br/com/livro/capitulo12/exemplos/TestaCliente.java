package br.com.livro.capitulo12.exemplos;
public class TestaCliente {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
    
    cliente1.nome = "Raquel Farias";
    cliente1.email = "raquelf@gmail.com";
    cliente1.credito = 1500;
    
    cliente2.nome = "Adriana Schafer";
    cliente2.email = "adrianas@gmail.com";
    cliente2.credito = 2200;
    
    System.out.println("Dados do primeiro cliente:");
    System.out.println("  Nome:\t\t"  + cliente1.nome);
    System.out.println("  Email:\t"   + cliente1.email);
    System.out.println("  Cr�dito:\t" + cliente1.credito);
    
    System.out.println("\nDados do segundo cliente:");
    System.out.println("  Nome:\t\t"  + cliente2.nome);
    System.out.println("  Email:\t"   + cliente2.email);
    System.out.println("  Cr�dito:\t" + cliente2.credito);
  }
}
