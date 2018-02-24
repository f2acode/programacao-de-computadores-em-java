package br.com.livro.capitulo09.exemplos;
public class Vetor {
  public static void main(String[] args) {
    java.io.PrintStream saida = System.out;
    
    int[] it;
    it = new int[3];
    it[0] = 65;
    it[1] = 66;
    it[2] = 67;
    
    saida.println("Conte�do do vetor it:");
    saida.print("it[0] = " + it[0] + "\t");
    saida.print("it[1] = " + it[1] + "\t");
    saida.print("it[2] = " + it[2] + "\n");
    saida.print("Qtde. de posi��es: " + it.length + "\n\n");
    
    double[] db = new double[2];
    db[0] = 1.25;
    db[1] = 2.54;
    
    saida.println("Conte�do do vetor db:");
    saida.print("db[0] = " + db[0] + "\t");
    saida.print("db[1] = " + db[1] + "\n");
    saida.print("Qtde. de posi��es: " + db.length + "\n\n");
    
    char[] ch = {'X','Y','Z'};
    
    saida.println("Conte�do do vetor ch:");
    for (int i = 0; i < ch.length; i++)
       System.out.print("ch[" + i + "] = " + ch[i] + "\t");
    saida.println("\nQtde. de posi��es: " + ch.length);
  }
}