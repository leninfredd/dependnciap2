package calculadoradep2;

import javax.swing.JOptionPane;

public class Calculadoradep2 {

    public static void main(String[] args) {

        Operacoes op = new Operacoes();
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor da Soma:"));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor da Soma:"));
        JOptionPane.showInputDialog(op.Operasoma(a, b));

        Operacoes sub = new Operacoes();
        Double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor da Subtração:"));
        Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor da Subtração:"));
        JOptionPane.showInputDialog(sub.operasub(c, d));

        Operacoes mult = new Operacoes();
        Double e = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor da Multiplicação:"));
        Double f = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor da Multiplicação:"));
        JOptionPane.showInputDialog(mult.operamult(e, f));

        Operacoes div = new Operacoes();
        Double g = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor da Divisão:"));
        Double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor da Divisão:"));
        JOptionPane.showInputDialog(div.operadiv(g, h));

    }

}
