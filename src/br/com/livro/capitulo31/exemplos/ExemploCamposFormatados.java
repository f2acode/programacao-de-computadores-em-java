package br.com.livro.capitulo31.exemplos;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

public class ExemploCamposFormatados extends JFrame 
  implements ActionListener {
  private JPanel pnOeste;
  private JPanel pnCentro;
  private JPanel pnSul;
  private JFormattedTextField tfCodigo;
  private JTextField tfNome;
  private JFormattedTextField tfSalario;
  private JFormattedTextField tfNascimento;
  private JFormattedTextField tfCpf;
  private JButton btExibir;
  
  public ExemploCamposFormatados() throws ParseException {
    setTitle("Campos formatados");
    setSize(300,200);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    tfCodigo = new JFormattedTextField(new Integer(0));
    tfNome = new JTextField();
    tfSalario = new JFormattedTextField(new Double(0));
    tfNascimento = new JFormattedTextField(new Date());
    MaskFormatter fmtCpf = new MaskFormatter("###.###.###-##");
    fmtCpf.setPlaceholderCharacter('_');
    tfCpf = new JFormattedTextField(fmtCpf);
    
    btExibir = new JButton("Exibir");
    pnOeste = new JPanel();
    pnCentro = new JPanel();
    pnSul = new JPanel();
    
    pnOeste.setLayout(new GridLayout(5,1));
    pnCentro.setLayout(new GridLayout(5,1));
    
    pnOeste.add(new JLabel(" Codigo: "));
    pnOeste.add(new JLabel(" Nome: "));
    pnOeste.add(new JLabel(" Sal�rio: "));
    pnOeste.add(new JLabel(" Nascimento: "));
    pnOeste.add(new JLabel(" CPF: "));
    
    pnCentro.add(tfCodigo);
    pnCentro.add(tfNome);
    pnCentro.add(tfSalario);
    pnCentro.add(tfNascimento);
    pnCentro.add(tfCpf);
    
    pnSul.add(btExibir);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(pnOeste,BorderLayout.WEST);
    getContentPane().add(pnCentro,BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    btExibir.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    int codigo = (Integer)tfCodigo.getValue();
    double salario = (Double)tfSalario.getValue();
    Date nascimento = (Date)tfNascimento.getValue();
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    DateFormat df = DateFormat.getDateInstance();
    
    JOptionPane.showMessageDialog(this, "Dados informados:\n" +
        "\nC�digo: " + codigo +
        "\nNome: " + tfNome.getText() +
        "\nSal�rio: " + nf.format(salario) +
        "\nNascimento: " + df.format(nascimento) +
        "\nCPF: " + tfCpf.getValue());
  }
  
  public static void main(String[] args) throws Exception{
    new ExemploCamposFormatados( ).setVisible(true);
  }
}
