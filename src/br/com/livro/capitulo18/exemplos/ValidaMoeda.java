package br.com.livro.capitulo18.exemplos;
import static javax.swing.JOptionPane.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class ValidaMoeda {
  public static void main(String[] args) {
    NumberFormat nf_numero = NumberFormat.getInstance();
    NumberFormat nf_moeda = NumberFormat.getCurrencyInstance();
    
    while (true)
      try {
        String str = showInputDialog(null,"Informe um valor");
        if (str == null) System.exit(0);
        
        Number nb = nf_numero.parse( str.trim() );
        double valor = nb.doubleValue();
        valor = Math.floor(valor * 100) / 100;
        
        str = "Valor informado: " + nf_moeda.format(valor);
        showMessageDialog(null,str);
      } catch(ParseException ex) {
        showMessageDialog(null,"Dado inv�lido","Erro",ERROR_MESSAGE);
      }
  }
}
