import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

        int soma = 0;

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Primeiro valor é maior");
            for(int i = num2; i <= num1; i++){
                if (i % 2 == 1) {
                    soma+=i;
                }
            }
        } else if(num2 > num1){
            JOptionPane.showMessageDialog(null, "Segundo valor é maior");
            for(int i = num1; i <= num2; i++){
                if (i % 2 == 1) {
                    soma+=i;
                }
            }
        } else{
            JOptionPane.showMessageDialog(null, "Valores Iguais");
        }

        JOptionPane.showMessageDialog(null, "Soma dos impares: " + soma);
    }
}
