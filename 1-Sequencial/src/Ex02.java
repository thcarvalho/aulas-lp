import javax.swing.*;

public class Ex02 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));

        int delta = (int) (Math.pow(b,2) - (4*a*c));

        double x1 = (-b+(Math.sqrt(delta)))/(2*a);
        double x2 = (-b-(Math.sqrt(delta)))/(2*a);

        JOptionPane.showMessageDialog(null, x1+" e "+x2);
    }
}
