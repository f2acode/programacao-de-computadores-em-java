package br.com.livro.capitulo21.exemplos;
import static javax.swing.JOptionPane.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploFilaPrioridade {
  private static Queue<Paciente> fila;
  
  public static void main(String[] args) {
    fila = new PriorityQueue<Paciente>();
    
    int ficha = 0;
    while (true) {
      Paciente paciente = new Paciente(); 
      
      String str = showInputDialog("Nome do paciente");
      if (str == null) break;
      paciente.setNome(str);
      
      str = showInputDialog(null, "Selecione a prioridade", "", 3, 
        null, new String[]{"M�nima","Pequena","M�dia","Alta",
        "Alt�ssima"}, "M�nima").toString();
      if (str == null) break;
      for (Gravidade g : Gravidade.values())
        if (g.getDescricao().equals(str)) paciente.setGravidade(g);
      
      paciente.setFicha(++ficha);
      
      fila.offer( paciente );
    }
    
    String str = "Ordem da fila:";
    while(!fila.isEmpty())
      str += "\n" + fila.poll();
    showMessageDialog(null, str);
  }
}
