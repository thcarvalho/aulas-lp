import javax.swing.*;

public class ex2 {
    static int hrT, minT;

    public static void main(String[] args) {
        int hrI = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora do jogo"));
        int minI = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos do jogo"));
        int hrF = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final do jogo"));
        int minF = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos finais do jogo"));

        calcularTempo(hrI, minI, hrF, minF);

        JOptionPane.showMessageDialog(null, hrT+"h"+minT+"m de jogo");
    }
    static void calcularTempo(int hrI, int minI, int hrF, int minF){
        if (hrI>=24 || hrF>=24){
            System.out.println("Hora invalida");
        } else {
            if (hrI>hrF){
                hrT = 24-hrI+hrF;
            } else {
                hrT = hrF-hrI;
            }

            if (minI>=60 || minF>=60){
                System.out.println("Minutos Invalidos");
            } else {
                if (minI>minF){
                    hrT-=1;
                    minT = 60-minI+minF;
                } else {
                    minT = minF-minI;
                }
            }
        }
    }
}
