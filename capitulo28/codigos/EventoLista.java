import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class EventoLista extends JFrame
  implements ListSelectionListener {
  private JPanel pnNorte;
  private JPanel pnCentro;
  private JList<String> liEstado;
  private JList<String> liCor;
  private JLabel lbStatus;
  
  public EventoLista( ) {
    setTitle("Eventos de sele��o");
    setSize(300,200);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getContentPane( ).setLayout(new BorderLayout( ));
    
    pnNorte = new JPanel( );
    pnNorte.setLayout(new GridLayout(1,2,5,5));
    pnNorte.add(new JLabel("Estado:"));
    pnNorte.add(new JLabel("Fundo das listas:"));
    
    String[] estados = {"AC","AM","AL","AP","BA","CE","DF","ES",
      "GO","MA","MG","MS","MT","PA","PE","PI","PB","PR","RJ",
      "RN","RO","RR","RS","SC","SE","SP","TO"};
    liEstado = new JList<String>(estados);
    
    String[] cores = {"Amarelo","Azul","Branco","Cinza Claro",
      "Cinza Escuro","Vermelho","Verde"};
    liCor = new JList<String>(cores);
    
    liEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    liCor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    liEstado.addListSelectionListener(this);
    liCor.addListSelectionListener(this);
    
    pnCentro = new JPanel( );
    pnCentro.setLayout(new GridLayout(1,2,5,5));
    pnCentro.add(new JScrollPane(liEstado));
    pnCentro.add(new JScrollPane(liCor));
    
    lbStatus = new JLabel("Estado:");
    
    getContentPane( ).add(pnNorte,BorderLayout.NORTH);
    getContentPane( ).add(pnCentro,BorderLayout.CENTER);
    getContentPane( ).add(lbStatus,BorderLayout.SOUTH);
  }
  
  public void valueChanged(ListSelectionEvent e) {
    if (e.getSource( ) == liEstado)
      lbStatus.setText("Estado: " + liEstado.getSelectedValue());
    else if (e.getSource( ) == liCor) {
      Color[] clCores = {Color.YELLOW,Color.BLUE,Color.WHITE,
        Color.LIGHT_GRAY,Color.DARK_GRAY,Color.RED,Color.GREEN};
      Color cor = clCores[liCor.getSelectedIndex( )];
      liEstado.setBackground(cor);
      liCor.setBackground(cor);
    }
  }
  
  public static void main(String[] args) {
    new EventoLista( ).setVisible(true);
    JList<String> lista = new JList<String>(new DefaultListModel<String>());
    lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    DefaultListModel<String> dlm = (DefaultListModel<String>)lista.getModel();
    dlm.insertElementAt("XXX", 0);
    dlm.insertElementAt("YYY", 0);
    dlm.insertElementAt("ZZZ", 0);
    dlm.remove(0);
    System.out.println(dlm.size());
  }
}
