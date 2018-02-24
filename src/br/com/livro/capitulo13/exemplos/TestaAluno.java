package br.com.livro.capitulo13.exemplos;
import javax.swing.JOptionPane;

public class TestaAluno {
  public static void main(String[] args) {
    Aluno alu = new Aluno();
    
    String str = "Dados do aluno: ";
    //str += "\n" + alu.matricula + ": " + alu.nome;//Viola��o de encapsulamento privado
    JOptionPane.showMessageDialog(null,str);
    
    //alu.matricula = -15;//Viola��o de encapsulamento privado
    //alu.nome = "";//Viola��o de encapsulamento privado
    
    str = "Dados do aluno: ";
    //str += "\n" + alu.matricula + ": " + alu.nome;//Viola��o de encapsulamento privado
    JOptionPane.showMessageDialog(null,str);
    
    System.exit(0);
  }
}
