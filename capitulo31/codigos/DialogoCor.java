import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogoCor extends JFrame implements ActionListener {
  private JButton btCor;
  
  public DialogoCor() {
    setTitle("Sele��o de cor");
    setSize(250,300);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    btCor = new JButton("Trocar Cor de Fundo");
    btCor.addActionListener(this);
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(btCor,BorderLayout.SOUTH);
  }
  
  public void actionPerformed(ActionEvent e) {
    Color cor = JColorChooser.showDialog(this, "Selecione uma cor",
      getContentPane().getBackground());
    if (cor != null) getContentPane().setBackground(cor);
  }
  
  public static void main(String[] args) {
    new DialogoCor().setVisible(true);
  }
}
