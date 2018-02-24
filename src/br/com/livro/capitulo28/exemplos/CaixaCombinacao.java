package br.com.livro.capitulo28.exemplos;
import java.awt.*;
import javax.swing.*;

public class CaixaCombinacao extends JFrame {
  private JComboBox<String> coEstados;
  private JComboBox<String> coCores;
  
  public CaixaCombinacao( ) {
    setTitle("Caixas de combina��o");
    setSize(250,100);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new GridLayout(2,2,5,5));
    
    String[] estados = {"AC","AM","AL","AP","BA","CE","DF"};
    coEstados = new JComboBox<String>(estados);
    coEstados.setMaximumRowCount(5);
    
    String[] cores = {"Amarelo","Azul","Branco","Laranja",
      "Preto","Roxo","Vermelho","Verde","Outra"};
    coCores = new JComboBox<String>(cores);
    coCores.setEditable(true);
    coCores.setMaximumRowCount(3);
    coCores.setSelectedIndex(8);
    
    getContentPane( ).add(new JLabel("Estado:"));
    getContentPane( ).add(coEstados);
    getContentPane( ).add(new JLabel("Cor preferida:"));
    getContentPane( ).add(coCores);
  }
  
  public static void main(String[] args) {
    new CaixaCombinacao( ).setVisible(true);
  }
}
