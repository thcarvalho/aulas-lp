import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        double notas [][] = new double [2][3];
        double medAluno[] = new double[3];
        double medProva[] = new double[2];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Aluno "+(j+1)+" para a Prova "+(i+1)));
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                medAluno[j] = (notas[0][j] + notas[1][j]) / 2;
                medProva[i] = (notas[i][0] + notas[i][1] + notas[i][2])/3;
            }
        }
        for (int i = 0; i < 2; i++){
            System.out.println("Media da prova "+(i+1)+": "+medProva[i]);
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Media do aluno "+(j+1)+": "+medAluno[j]);
        }

    }
}
