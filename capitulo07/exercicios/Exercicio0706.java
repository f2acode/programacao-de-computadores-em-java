import javax.swing.JOptionPane;

public class Exercicio0706{
    public static void main(String[] args){

        double aliquota = 0.0;
        double valorINSS = 0.00;
        double salarioLiquido = 0.00;
        Double salario = Double.valueOf(JOptionPane.showInputDialog(null, 
            "Informe o salario:"));
        
        if(salario == null)
            System.exit(0);

        if(salario < 465.00){
            JOptionPane.showMessageDialog(null, "Salario minimo e de R$ 465,00", "Erro", 3);
            System.exit(0);
        }
        
        if(salario < 965.67)
            aliquota = 8.0;
        else if(salario < 1609.45)
            aliquota = 9.0;
        else
            aliquota = 11.0;

        valorINSS = salario * (aliquota/100);
        salarioLiquido = salario - valorINSS;

        JOptionPane.showMessageDialog(null, 
            "Salario bruto: R$ " + salario + 
            "\nAliquota do INSS: "+ aliquota + 
            "\nValor do INSS: R$ " + valorINSS + 
            "\nSalario liquido: R$ " + salarioLiquido, "Resumo", 0);

    }
}