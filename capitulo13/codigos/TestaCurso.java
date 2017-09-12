import javax.swing.JOptionPane;

public class TestaCurso {
  public static void main(String[] args) {
    Curso cur = new Curso();
    
    String str = "Dados do curso: ";
    str += "\n" + cur.getCodigo() + ": " + cur.getDescricao();
    JOptionPane.showMessageDialog(null,str);
    
    cur.setCodigo( 1 );
    cur.setDescricao( "Sistemas de Informa��o" );
    
    str = "Dados do curso: ";
    str += "\n" + cur.getCodigo() + ": " + cur.getDescricao();
    JOptionPane.showMessageDialog(null,str);
    
    cur.setCodigo( -15 );
    cur.setDescricao( null );
    
    str = "Dados do curso: ";
    str += "\n" + cur.getCodigo() + ": " + cur.getDescricao();
    JOptionPane.showMessageDialog(null,str);
    
    System.exit(0);
  }
}