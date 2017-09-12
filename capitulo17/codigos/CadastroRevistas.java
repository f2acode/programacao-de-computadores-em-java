import static javax.swing.JOptionPane.*;

public class CadastroRevistas {
  public static void main(String[] args) {
    Revista[] cadastros = new Revista[20];
    
    String str;
    for (int i = 0; i < cadastros.length; i++) {
      str = showInputDialog(null,"Revista " + (i+1) + ": t�tulo");
      if (str == null) break;
      String titulo = str.trim();
      
      str = showInputDialog(null,"Revista " + (i+1) + ": n�mero");
      if (str == null) break;
      int numero = Integer.parseInt(str);
      
      str = showInputDialog(null,"Revista " + (i+1) + ": ano");
      if (str == null) break;
      int ano = Integer.parseInt(str);
      
      str = showInputDialog(null,"Revista " + (i+1) + ": m�s");
      if (str == null) break;
      int mes_numero = Integer.parseInt(str);
      
      Meses mes = null;
      if (mes_numero == 1) mes = Meses.JANEIRO;
      else if (mes_numero == 2) mes = Meses.FEVEREIRO;
      else if (mes_numero == 3) mes = Meses.MARCO;
      else if (mes_numero == 4) mes = Meses.ABRIL;
      else if (mes_numero == 5) mes = Meses.MAIO;
      else if (mes_numero == 6) mes = Meses.JUNHO;
      else if (mes_numero == 7) mes = Meses.JULHO;
      else if (mes_numero == 8) mes = Meses.AGOSTO;
      else if (mes_numero == 9) mes = Meses.SETEMBRO;
      else if (mes_numero == 10) mes = Meses.OUTUBRO;
      else if (mes_numero == 11) mes = Meses.NOVEMBRO;
      else if (mes_numero == 12) mes = Meses.DEZEMBRO;
      
      cadastros[i] = new Revista(titulo,numero,ano,mes);
    }
    
    String mensagem = "Revistas cadastradas:";
    for (Revista revista : cadastros) {
      if (revista == null) break;
      mensagem += "\n- " + revista;
    }
    showMessageDialog(null,mensagem);
    System.exit(0);
  }
}
