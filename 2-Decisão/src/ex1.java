import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número"));

        int result;

        if (num1 > num2) {
            result = num1-num2;
            JOptionPane.showMessageDialog(null, result);
        } else if(num2 > num1) {
            result = num2-num1;
            JOptionPane.showMessageDialog(null, result);
        } else {
            JOptionPane.showMessageDialog(null, "Valores Iguais");
        }


    }
}
