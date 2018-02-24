package br.com.livro.capitulo28.exemplos;
import java.awt.*;
import javax.swing.*;

public class Lista extends JFrame {
  private JPanel pnNorte;
  private JPanel pnCentro;
  private JList<String> liEstados;
  private JList<String> liCores;
  
  public Lista( ) {
    setTitle("Listas");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    pnNorte = new JPanel( );
    pnNorte.setLayout(new GridLayout(1,2,5,5));
    pnNorte.add(new JLabel("Estado:"));
    pnNorte.add(new JLabel("Cores preferidas:"));
    
    String[] estados = {"AC","AM","AL","AP","BA","CE","DF","ES",
      "GO","MA","MG","MS","MT","PA","PE","PI","PB","PR","RJ",
      "RN","RO","RR","RS","SC","SE","SP","TO"};
    liEstados = new JList<String>(estados);
    liEstados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    String[] cores = {"Amarelo","Azul","Branco","Laranja","Preto",
      "Roxo","Vermelho","Verde","Outra"};
    liCores = new JList<String>(cores);
    
    pnCentro = new JPanel( );
    pnCentro.setLayout(new GridLayout(1,2,5,5));
    pnCentro.add(new JScrollPane(liEstados));
    pnCentro.add(new JScrollPane(liCores));
    
    getContentPane( ).add(pnNorte,BorderLayout.NORTH);
    getContentPane( ).add(pnCentro,BorderLayout.CENTER);
  }
  
  public static void main(String[] args) {
    new Lista( ).setVisible(true);
  }
}