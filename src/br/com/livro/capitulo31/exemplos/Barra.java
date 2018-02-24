package br.com.livro.capitulo31.exemplos;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Barra extends JFrame implements ActionListener {
  private JToolBar tbNorte;
  private JToolBar tbOeste;
  private JButton btUsuario;
  private JButton btAluno;
  private JButton btProfessor;
  private JButton btSistema;
  private JButton btSobre;
  private JButton btAjuda;
  private JButton btLogoff;
  private JButton btSair;
  private JPopupMenu pmExibir;
  private JCheckBoxMenuItem miOeste;
  private JCheckBoxMenuItem miNorte;
  
  public Barra() {
    setTitle("Exemplo de barra de ferramentas");
    setSize(350,250);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    tbNorte = new JToolBar("Barra 1",JToolBar.HORIZONTAL);
    tbOeste = new JToolBar("Barra 2",JToolBar.VERTICAL);
    
    btUsuario = new JButton();
    URL url = getClass().getResource("/imagens/Usuario.png");
    btUsuario.setIcon(new ImageIcon(url));
    btUsuario.setToolTipText("Cadastro de usu�rios");
    btUsuario.setFocusable(false);
    tbOeste.add(btUsuario);
    
    btAluno = new JButton();
    url = getClass().getResource("/imagens/Aluno.png");
    btAluno.setIcon(new ImageIcon(url));
    btAluno.setToolTipText("Cadastro de alunos");
    btAluno.setFocusable(false);
    tbOeste.add(btAluno);
    
    btProfessor = new JButton();
    url = getClass().getResource("/imagens/Professor.png");
    btProfessor.setIcon(new ImageIcon(url));
    btProfessor.setToolTipText("Cadastro de alunos");
    btProfessor.setFocusable(false);
    tbOeste.add(btProfessor);
    
    btSistema = new JButton();
    url = getClass().getResource("/imagens/Sistema.png");
    btSistema.setIcon(new ImageIcon(url));
    btSistema.setToolTipText("Configura��es do sistema");
    btSistema.setFocusable(false);
    tbNorte.add(btSistema);
    
    btSobre = new JButton();
    url = getClass().getResource("/imagens/Sobre.png");
    btSobre.setIcon(new ImageIcon(url));
    btSobre.setToolTipText("Informa��es sobre o sistema");
    btSobre.setFocusable(false);
    tbNorte.add(btSobre);
    
    btAjuda = new JButton();
    url = getClass().getResource("/imagens/Ajuda.png");
    btAjuda.setIcon(new ImageIcon(url));
    btAjuda.setToolTipText("Ajuda sobre o sistema");
    btAjuda.setFocusable(false);
    tbNorte.add(btAjuda);
    
    btLogoff = new JButton();
    url = getClass().getResource("/imagens/Logoff.png");
    btLogoff.setIcon(new ImageIcon(url));
    btLogoff.setToolTipText("Efetuar Logoff");
    btLogoff.setFocusable(false);
    tbNorte.add(btLogoff);
    
    btSair = new JButton();
    url = getClass().getResource("/imagens/Sair.png");
    btSair.setIcon(new ImageIcon(url));
    btSair.setToolTipText("Sair do sistema");
    btSair.setFocusable(false);
    tbNorte.add(btSair);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(tbOeste,BorderLayout.WEST);
    getContentPane().add(tbNorte,BorderLayout.NORTH);
    
    miOeste = new JCheckBoxMenuItem("Barra Lateral");
    miNorte = new JCheckBoxMenuItem("Barra Superior");
    
    miOeste.setSelected(true);
    miNorte.setSelected(true);
    
    miOeste.addActionListener(this);
    miNorte.addActionListener(this);
    
    pmExibir = new JPopupMenu();
    pmExibir.add(miOeste);
    pmExibir.add(miNorte);
    
    addMouseListener(new MouseAdapter( ) {
      public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger( ))
          pmExibir.show(e.getComponent( ),e.getX( ),e.getY( ));
        }});
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == miOeste)
      if (miOeste.isSelected()) add(tbOeste,BorderLayout.WEST);
      else remove(tbOeste);
    else if (e.getSource() == miNorte)
      if (miNorte.isSelected()) add(tbNorte,BorderLayout.NORTH);
      else remove(tbNorte);
    
    SwingUtilities.updateComponentTreeUI(this);
  }  
  
  public static void main(String[] args) {
    new Barra().setVisible(true);
  }
}
