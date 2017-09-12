import static javax.swing.JOptionPane.*;

public class CadastroAmigos {
  public static void main(String[] args) {
    Amigo[] cadastros = new Amigo[20];
    
    for (int i = 0; i < cadastros.length; i++) {
      String str = showInputDialog(null,"Amigo " + (i+1) + ": nome");
      if (str == null) break;
      String nome = str.trim();
      
      str = showInputDialog(null,"Amigo " + (i+1) + ": fone");
      if (str == null) break;
      String fone = str.trim();
      
      cadastros[i] = new Amigo(nome,fone);
    }
    
    String mensagem = "Lista de amigos:";
    for (Amigo am : cadastros) {
      if (am == null) break;
      mensagem += "\n- " + am;
    }
    showMessageDialog(null,mensagem);
    System.exit(0);
  }
}

class Amigo {
  private String nome;
  private String fone;
  
  public Amigo(String nome, String fone) {
    this.nome = nome;
    this.fone = fone;
  }
  
  public String toString() {
    return nome + " - " + fone;
  }
}
