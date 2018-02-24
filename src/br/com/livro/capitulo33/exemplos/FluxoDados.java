package br.com.livro.capitulo33.exemplos;
import java.io.*;
import static javax.swing.JOptionPane.*;

public class FluxoDados {
  public static void main(String[] args) {
    try {
      DataOutputStream dos = new DataOutputStream(new
        BufferedOutputStream(new FileOutputStream("Produto.dat")));
      
      dos.writeInt(1);
      dos.writeUTF("Ma��");
      dos.writeDouble(2.25);
      
      dos.writeInt(2);
      dos.writeUTF("P�ssego");
      dos.writeDouble(3.78);
      
      dos.close();
    } catch (FileNotFoundException fnf) {
    } catch (IOException io) { }
    
    String str = "Produtos registrados:";
    try {
      DataInputStream dis = new DataInputStream(new
        BufferedInputStream(new FileInputStream("Produto.dat")));
      
      while (true) {
        str += "\nProduto " + dis.readInt() + ": " +
          dis.readUTF() + " - " + dis.readDouble();
      }
    } catch (EOFException e) {
    } catch (IOException e) { }
    
    showMessageDialog(null, str);
    System.exit(0);
  }
}
