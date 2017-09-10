import javax.swing.JOptionPane;

public class SwitchString{
    public static void main(String[] args){
        String mensagem = "Informe um mes (Ex.: Janeiro)";
        String mes = JOptionPane.showInputDialog(null, mensagem);
        byte mes_numero = 0;

        switch(mes.toLowerCase()){
            case "janeiro": mes_numero = 1;
                break;
            case "fevereiro": mes_numero = 2;
                break;
            case "marco": mes_numero = 3;
                break;
            case "abril": mes_numero = 4;
                break;
            case "maio": mes_numero = 5;
                break;
            case "junho": mes_numero = 6;
                break;
            case "julho": mes_numero = 7;
                break;
            case "agosto": mes_numero = 8;
                break;
            case "setembro": mes_numero = 9;
                break;
            case "outubro": mes_numero = 10;
                break;
            case "novembro": mes_numero = 11;
                break;
            case "dezembro": mes_numero = 12;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mes invalido!", "Erro", 0);
                System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Seu mes: " + mes_numero);
        System.exit(0);
    }
}