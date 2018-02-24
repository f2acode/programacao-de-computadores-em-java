package br.com.livro.capitulo14.exemplos;
import javax.swing.JOptionPane;

public class CadastroClientePessoa {
  public static void main(String[] args) {
    ClientePessoa celso = new ClientePessoa();
    celso.setNome(new String("Celso Miranda"));
    celso.setFone(new String("(45)277-2421"));
    celso.setRG(new String("4.456.879-4"));
    celso.setCPF(new String("415.485.667-25"));
    
    String str = "Dados do Cliente:\n" +
      "\nNome: " + celso.getNome() +
      "\nFone: " + celso.getFone() +
      "\nRG: "   + celso.getRG()   +
      "\nCPF: "  + celso.getCPF();
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
    
    ClientePessoa argemiro = new ClientePessoa(
      "Argemiro Vieira","(45)278-4167","4.478.964-3",
      "478.921.358-56");
    
    str = "Dados do Cliente:\n" +
      "\nNome: " + argemiro.getNome() +
      "\nFone: " + argemiro.getFone() +
      "\nRG: "   + argemiro.getRG()   +
      "\nCPF: "  + argemiro.getCPF();
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
    
    System.exit(0);
  }
}