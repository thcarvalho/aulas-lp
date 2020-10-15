import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a N1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a N2"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a N3"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a N4"));

        calcularMedia(n1,n2,n3,n4);
    }
    static void calcularMedia(int n1, int n2, int n3, int n4){
        double med = (n1+n2+n3+n4)/4;

        if (med>=6){
            System.out.println("Aprovado: "+med);
        } else if (med >=3){
            System.out.println("Exame: "+med);
        } else {
            System.out.println("Reprovado: "+med);
        }
    }
}
