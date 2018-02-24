package br.com.livro.capitulo26.exemplos;
import java.awt.*;
import javax.swing.*;

public class CampoTexto extends JFrame {
  private JTextField tfId;
  private JTextField tfSenha;
  
  public CampoTexto( ) {
    setTitle("Campos de texto");
    setSize(400,120);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new GridLayout(3,2,5,5));
    
    tfId = new JTextField( );
    tfId.setText("Informe sua identifica��o aqui");
    tfId.setHorizontalAlignment(JTextField.CENTER);
    
    tfSenha = new JTextField("Sua senha aqui",JTextField.RIGHT);
    tfSenha.setDisabledTextColor(Color.RED);
    tfSenha.setBackground(Color.LIGHT_GRAY);
    tfSenha.setEnabled(false);
    
    getContentPane( ).add(new JLabel("Identifica��o:"));
    getContentPane( ).add(tfId);
    getContentPane( ).add(new JLabel("Senha:"));
    getContentPane( ).add(tfSenha);
    getContentPane( ).add(new JButton("OK"));
    getContentPane( ).add(new JButton("Cancelar"));
  }
  
  public static void main(String[] args) {
    new CampoTexto( ).setVisible(true);
  }
}
