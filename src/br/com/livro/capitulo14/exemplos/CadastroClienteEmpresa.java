package br.com.livro.capitulo14.exemplos;
import javax.swing.JOptionPane;

public class CadastroClienteEmpresa {
  public static void main(String[] args) {
    ClienteEmpresa silva = new ClienteEmpresa();
    silva.setNome("Silva & Silva Ltda.");
    silva.setFone("(45)277-1354");
    silva.setIE("41202190845");
    silva.setCNPJ("80.450.842/0001-23");
    
    String st = "Dados do Cliente:\n" +
      "\nNome: " + silva.getNome() +
      "\nFone: " + silva.getFone() +
      "\nIE: "   + silva.getIE()   +
      "\nCNPJ: " + silva.getCNPJ();
    JOptionPane.showMessageDialog(null,st,"Mensagem",1);
    
    ClienteEmpresa souza = new ClienteEmpresa(
      "Souza & Souza Ltda.","(45)278-7456","41202930151",
      "72.856.749/0001-42");
    
    st = "Dados do Cliente:\n" +
      "\nNome: " + souza.getNome() +
      "\nFone: " + souza.getFone() +
      "\nIE: "   + souza.getIE()   +
      "\nCNPJ: " + souza.getCNPJ();
    JOptionPane.showMessageDialog(null,st,"Mensagem",1);
    
    System.exit(0);
  }
}
