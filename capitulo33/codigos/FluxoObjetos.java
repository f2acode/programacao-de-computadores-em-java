import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.NumberFormat;
import static javax.swing.JOptionPane.*;

public class FluxoObjetos {
  public static void main(String[] args) throws FileNotFoundException,
    ClassNotFoundException,IOException {
    
    FileOutputStream fos = new FileOutputStream("Funcionario.obj");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject( new Funcionario(1,"Carlos",1253.6) );
    oos.writeObject( new Funcionario(2,"Manuela",1135.4) );
    oos.close();
    
    FileInputStream fis = new FileInputStream("Funcionario.obj");
    ObjectInputStream ois = new ObjectInputStream(fis);
    String str = "Funcion�rios registrados:";
    try {
      while (true)
        str += "\n" + ois.readObject();
    }
    catch (EOFException eof) {}
    ois.close();
    
    showMessageDialog(null, str);
  }
}

class Funcionario implements Serializable {
  private int matricula;
  private String nome;
  private double salario;
  
  public Funcionario(int matricula, String nome, double salario) {
    this.matricula = matricula;
    this.nome = nome;
    this.salario = salario;
  }
  
  public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Funcion�rio " + matricula + ": " + nome + " - " + 
      nf.format(salario); 
  }
}
