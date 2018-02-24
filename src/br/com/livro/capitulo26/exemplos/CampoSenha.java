package br.com.livro.capitulo26.exemplos;
import java.awt.*;
import javax.swing.*;

public class CampoSenha extends JFrame {
  private JTextField tfId;
  private JPasswordField pfSenha;
  
  public CampoSenha( ) {
    setTitle("Campos de senha");
    setSize(400,120);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new GridLayout(3,2,5,5));
    
    tfId = new JTextField( );
    pfSenha = new JPasswordField( );
    pfSenha.setEchoChar('@');
    
    getContentPane( ).add(new JLabel("Identifica��o:"));
    getContentPane( ).add(tfId);
    getContentPane( ).add(new JLabel("Senha:"));
    getContentPane( ).add(pfSenha);
    getContentPane( ).add(new JButton("OK"));
    getContentPane( ).add(new JButton("Cancelar"));
  }
  
  public static void main(String[] args) {
    new CampoSenha( ).setVisible(true);
  }
}
