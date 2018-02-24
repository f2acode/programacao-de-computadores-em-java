package br.com.livro.capitulo26.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EventoDocumento extends JFrame
  implements DocumentListener,ActionListener {
  private JPanel pnEntrada;
  private JPanel pnStatus;
  private JTextField tfId;
  private JPasswordField pfSenha;
  private JButton btOk;
  private JButton btCancelar;
  private JLabel lbStatus;
  
  public EventoDocumento( ) {
    setTitle("Eventos de texto");
    setSize(400,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    pnEntrada = new JPanel( );
    pnEntrada.setLayout(new GridLayout(3,2,2,2));
    pnStatus = new JPanel( );
    pnStatus.setLayout(new FlowLayout(FlowLayout.LEFT));
    
    tfId = new JTextField( );
    pfSenha = new JPasswordField( );
    btOk = new JButton("OK");
    btCancelar = new JButton("Cancelar");
    tfId.getDocument( ).addDocumentListener(this);
    pfSenha.getDocument( ).addDocumentListener(this);
    btOk.addActionListener(this);
    btCancelar.addActionListener(this);
    
    pnEntrada.add(new JLabel("Identifica��o:"));
    pnEntrada.add(tfId);
    pnEntrada.add(new JLabel("Senha:"));
    pnEntrada.add(pfSenha);
    pnEntrada.add(btOk);
    pnEntrada.add(btCancelar);
    
    lbStatus = new JLabel("Informe sua identifica��o e sua senha.");
    pnStatus.add(lbStatus);
    
    getContentPane( ).add(pnStatus,BorderLayout.SOUTH);
    getContentPane( ).add(pnEntrada,BorderLayout.CENTER);
  }
  
  public void insertUpdate(DocumentEvent e) {
    atualizarStatus( );
  }
  
  public void removeUpdate(DocumentEvent e) {
    atualizarStatus( );
  }
  
  public void changedUpdate(DocumentEvent e){ }
  
  private void atualizarStatus( ) {
    int id = tfId.getText( ).length( );
    int senha = pfSenha.getPassword( ).length;
    
    if (id == 0)
      if (senha == 0) 
        lbStatus.setText("Informe sua identifica��o e sua senha");
      else lbStatus.setText("Informe sua identifica��o");
    else 
      if (senha == 0) 
        lbStatus.setText("Informe sua senha");
      else lbStatus.setText("Pressione \"OK\" para confirmar.");
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource( ) == btCancelar) System.exit(0);
    
    if (tfId.getText( ).length( ) == 0) {
      JOptionPane.showMessageDialog(this,"ID inv�lida!","Erro",0);
      tfId.requestFocus( );
      return;
    }
    
    if (pfSenha.getPassword( ).length == 0) {
      JOptionPane.showMessageDialog(this,"Senha inv�lida!","Erro",0);
      pfSenha.requestFocus( );
      return;
    }
    
    JOptionPane.showMessageDialog(this,"Simula��o conclu�da!");
    System.exit(0);
  }
  
  public static void main(String[] args) {
    new EventoDocumento( ).setVisible(true);
  }
}
