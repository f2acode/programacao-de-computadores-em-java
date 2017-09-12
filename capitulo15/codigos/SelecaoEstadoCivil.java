import static javax.swing.JOptionPane.*;

public class SelecaoEstadoCivil {
  public static void main(String[] args) {
    int ec = showOptionDialog(null,"Seu estado civil",
        "Selecione",0,QUESTION_MESSAGE,null,
        new String[]{"Solteiro","Casado","Divorciado","Vi�vo"},
        "Solteiro");
    if(ec == -1) System.exit(0);
    
    String str = "Estado civil selecionado: ";
    if(ec == EstadoCivil.SOLTEIRO) str += "Solteiro";
    else if(ec == EstadoCivil.CASADO) str += "Casado";
    else if(ec == EstadoCivil.DIVORCIADO) str += "Divorciado";
    else if(ec == EstadoCivil.VIUVO) str += "Vi�vo";
    
    showMessageDialog(null,str);
    System.exit(0);
  }
}
