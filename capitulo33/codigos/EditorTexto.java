import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import static javax.swing.JOptionPane.*;

public class EditorTexto extends JFrame implements ActionListener{
  private JTextArea taTexto;
  private JPanel pnSul;
  private JButton btSalvar;
  private JButton btAbrir;
  private JButton btFechar;
  private File arquivo;
  
  public EditorTexto() {
    super();
    setTitle("Editor de textos");
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    taTexto = new JTextArea();
    pnSul = new JPanel();
    btSalvar = new JButton("Salvar");
    btAbrir = new JButton("Abrir");
    btFechar = new JButton("Fechar");
    
    pnSul.add(btSalvar);
    pnSul.add(btAbrir);
    pnSul.add(btFechar);
    
    btAbrir.addActionListener(this);
    btSalvar.addActionListener(this);
    btFechar.addActionListener(this);
    
    setLayout(new BorderLayout());
    getContentPane().add(new JScrollPane(taTexto,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS), 
      BorderLayout.CENTER);
    getContentPane().add(pnSul,BorderLayout.SOUTH);
    
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((dm.width - getSize().width) / 2,
      (dm.height - getSize().height) / 2);
  }
  
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btSalvar) salvarArquivo();
    if (evt.getSource() == btAbrir) abrirArquivo();
    if (evt.getSource() == btFechar) fecharArquivo();
  }
  
  public void abrirArquivo() {
    JFileChooser dialogo = new JFileChooser();
    FileNameExtensionFilter filtro = new FileNameExtensionFilter(
        "Arquivos de texto", "txt");
    dialogo.setFileFilter(filtro);
    int resposta = dialogo.showOpenDialog( this );
    if(resposta != JFileChooser.APPROVE_OPTION) return;
    
    try {
      fecharArquivo();
      arquivo = dialogo.getSelectedFile();
      BufferedReader br = new BufferedReader(new FileReader(arquivo));
      
      String linha;
      while ( (linha = br.readLine()) != null)
        taTexto.append(linha + "\n");
      
      br.close();
    } catch (FileNotFoundException e) {
      arquivo = null;
      showMessageDialog(this, "Arquivo n�o encontrado!");
    } catch (IOException ioe) {
      fecharArquivo();
      showMessageDialog(this, "Erro durante leitura/escrita!");
    }
    
    setTitle("Editando arquivo: " + arquivo.getPath() );
  }
  
  public void salvarArquivo() {
    if (arquivo == null) {
      JFileChooser dialogo = new JFileChooser();
      FileNameExtensionFilter filtro = new FileNameExtensionFilter(
          "Arquivos de texto", "txt");
      dialogo.setFileFilter(filtro);
      int resposta = dialogo.showSaveDialog( this );
      if(resposta != JFileChooser.APPROVE_OPTION) return;
      arquivo = dialogo.getSelectedFile();
      arquivo = new File(arquivo.getAbsolutePath() + ".txt");
    }
    
    try  {
      BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
      String conteudo = taTexto.getText().replaceAll("\n", 
          System.getProperty("line.separator"));
      bw.write(conteudo);
      bw.close();
    }
    catch(IOException ioex) {
      fecharArquivo();
      showMessageDialog(null,"Erro durante a grava��o!","Erro",0);
    }
    
    setTitle("Editando arquivo: " + arquivo.getPath() );
  }
  
  public void fecharArquivo() {
    arquivo = null;
    setTitle("Editor de textos");
    taTexto.setText("");
  }
  
  public static void main(String[] args) {
    new EditorTexto().setVisible(true);
  }
}