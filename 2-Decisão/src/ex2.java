import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o anterior"));

        if(num1>num2){
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um número maior que o anterior"));
        }
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número maior que o anterior"));

        if(num2>num3){
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um número maior que o anterior"));
        }
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer"));

        if(num4 < num1){
            JOptionPane.showMessageDialog(null, num4 + " " + num1 + " " + num2 + " " + num3);
        } else if (num4 < num2) {
            JOptionPane.showMessageDialog(null,  num1 + " " + num4 + " " + num2 + " " + num3);
        } else if (num4 < num3) {
            JOptionPane.showMessageDialog(null,  num1 + " " + num2 + " " + num4 + " " + num3);
        } else {
            JOptionPane.showMessageDialog(null,  num1 + " " + num2 + " " + num3 + " " + num4);
        }
    }
}
