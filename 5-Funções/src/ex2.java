import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        double result = 1;

        for (int i = 2; i <= num; i++) {
            result = somarSerie(result, i);
        }

        System.out.println(result);
    }

    static double somarSerie(double result, int i){
        double soma = result + ((double) 1 / i);
        return soma;
    }
}
