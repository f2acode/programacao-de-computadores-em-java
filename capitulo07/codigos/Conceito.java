import javax.swing.JOptionPane;

public class Conceito{
    public static void main(String[] args){
        double nota1 = 0, nota2 = 0, media;

        String st = "Informe sua primeira nota (entre 0 e 10):";
        st = JOptionPane.showInputDialog(null, st);

        if(st == null || st.length() == 0){
            st = "E preciso informar sua nota!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }
        else nota1 = Double.parseDouble(st);

        st = "Informe sua segunda nota (entre 0 e 10):";
        st = JOptionPane.showInputDialog(null, st);

        if(st == null || st.length() == 0){
            st = "E preciso informar sua nota!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }
        else nota2 = Double.parseDouble(st);

        media = (nota1 + nota2)/2;

        if(media < 7) st = "Insuficiente";
        else
            if(media < 8) st = "Suficiente";
            else
                if(media < 9.5) st = "Bom";
                else st = "Excelente";

        st = "Media obtida: " + media + "\nConceito: " + st;

        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
        System.exit(0);
    }
}