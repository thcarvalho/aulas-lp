import javax.swing.*;

public class Aula {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, soma);
    }
}
