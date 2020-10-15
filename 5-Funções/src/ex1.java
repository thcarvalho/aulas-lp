import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero"));

        if (num1 > num2) {
            System.out.println("O primeiro numero é maior");
            System.out.println("Soma dos impares: " + calcularSomatoria(num1, num2));
        } else if (num2 > num1) {
            System.out.println("O segundo numero é maior");
            System.out.println("Soma dos impares: " + calcularSomatoria(num2, num1));
        } else {
            System.out.println("Valores Iguais");
        }
    }

    static int calcularSomatoria(int num1, int num2) {
        int soma = 0;

        for (int i = num2; i <= num1; i++){
            if (i % 2 == 1) {
                soma+=i;
            }
        }
        return soma;
    }
}
