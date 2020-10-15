import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo gasto de viagem em horas"));
        double velMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade média no percurso"));

        double km = tempo*velMedia;

        double qtdLitros = km/12;

        JOptionPane.showMessageDialog(null, "Você gastou "+qtdLitros+" litros nesse percurso");
    }
}
