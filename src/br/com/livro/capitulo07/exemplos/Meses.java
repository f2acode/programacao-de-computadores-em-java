package br.com.livro.capitulo07.exemplos;
import javax.swing.JOptionPane;

public class Meses{
    public static void main(String[] args){
        String st = "Informe um numero entre 1 e 12";
        st = JOptionPane.showInputDialog(null, st);
        byte mes = Byte.parseByte(st);

        switch(mes){
            case 1:
                st = "Janeiro";
                break;
            case 2:
                st = "Fevereiro";
                break;
            case 3:
                st = "Marco";
                break;
            case 4:
                st = "Abril";
                break;
            case 5:
                st = "Maio";
                break;
            case 6:
                st = "Junho";
                break;
            case 7:
                st = "Julho";
                break;
            case 8:
                st = "Agosto";
                break;
            case 9:
                st = "Setembro";
                break;
            case 10:
                st = "Outubro";
                break;
            case 11:
                st = "Novembro";
                break;
            case 12:
                st = "Dezembro";
                break;
            default:
                st = "Mes invalido";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                System.exit(0);
        }

        st = "Você escolheu o mes de " + st;
        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
        System.exit(0);
    }
}