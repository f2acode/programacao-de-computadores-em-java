package br.pro.ruirossi.pcj.cap16;

import javax.swing.JOptionPane;

public class TesteIMC {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Marcelo",72.5,1.82);
    JOptionPane.showMessageDialog(null,p1);
    Pessoa p2 = new Pessoa("Franciele",58.5,1.74);
    JOptionPane.showMessageDialog(null,p2);
  }
}
