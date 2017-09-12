import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grade extends JFrame {
  private JTable tbDados;
  private JLabel lbStatus;

  public Grade( ){
    setTitle("Grade de dados");
    setSize(300,150);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    lbStatus = new JLabel("Selecione um registro");
    
    String[] titulos = {"C�digo","Nome"};
    Object[][] dados = {{1,"Arist�teles"},{2,"Hume"},{3,"Locke"},
        {4,"Kant"},{5,"Plat�o"},{6,"Ryle"},{7,"S�crates"}};
    tbDados = new JTable(dados,titulos);
    tbDados.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    tbDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbDados.setCursor(new Cursor(Cursor.HAND_CURSOR));
    tbDados.setFocusable(false);
    tbDados.setToolTipText("Clique para selecionar");
    tbDados.addMouseListener(new MouseHandler());

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(new JScrollPane(tbDados),"Center");
    getContentPane().add(lbStatus,"South");
  }
  
  class MouseHandler extends MouseAdapter {
    public void mouseReleased(MouseEvent e) {
      if (e.getButton() != MouseEvent.BUTTON1) return;
      if (!(e.getSource() instanceof JTable)) return;
  
      JTable tb = (JTable)e.getSource();
      if (tb.getSelectionModel().isSelectionEmpty()) return;
  
      int it = tb.getSelectionModel().getMinSelectionIndex();
      String str = "Registro selecionado: " + 
        tb.getModel().getValueAt(it,0) + " - " +
        tb.getModel().getValueAt(it,1);
      lbStatus.setText(str);
    }
  }

  public static void main(String[] args) {
    new Grade( ).setVisible(true);
  }
}
