import javax.swing.*;

public class Metodos {
    public double[][] carregarNotas() {
        double notas[][] = new double[2][3];

        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 3; j++) {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno "+(j+1)+" referente a prova "+(i+1)));
            }
        }
        return notas;
    }

    public double[] calcularMedia(double[][] notas) {
        double media[] = new double[3];

        for (int i = 0; i < 3; i++) {
            media[i] = (notas[0][i] + notas[1][i])/2;
        }
        JOptionPane.showMessageDialog(null, "Média calculada");
        return media;
    }

    public void mostrarMedia(double[] media) {
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Média do aluno "+(i+1)+": "+media[i]);
        }
    }
}
