import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        double notas[][] = new double[2][3];
        double media[] = new double[3];

        int opc;

        Metodos metodos = new Metodos();

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite uma opção:" +
                            "\n1. Carregar notas" +
                            "\n2. Calcular média" +
                            "\n3. Mostrar média" +
                            "\n9. Fim"
            ));

            switch (opc) {
                case 1:
                    notas = metodos.carregarNotas();
                    break;
                case 2:
                    media = metodos.calcularMedia(notas);
                    break;
                case 3:
                    metodos.mostrarMedia(media);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }

        } while (opc != 9);
    }
}
